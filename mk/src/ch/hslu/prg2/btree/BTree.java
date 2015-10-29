package ch.hslu.prg2.btree;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class BTree<T extends Comparable<T>> {
    protected BTreeNode<T> rootNode = null;

    public interface ValueHandler<T> {
        void handle(T value);
    }

    public boolean insert(T value) {
        Edge<T> edge = subTreeSearch(value);
        BTreeNode<T> parentNode = edge.getParent();
        if(edge.getChild() != null) return false;

        BTreeNode<T> nodeToInsert = createBTreeNode(value);
        insertOntoNode(nodeToInsert, parentNode);
        return true;
    }

    protected BTreeNode<T> createBTreeNode(T value) {
        return new BTreeNode<T>(value);
    }

    protected void insertOntoNode(BTreeNode<T> nodeToInsert, BTreeNode<T> parentNode) {
        if(parentNode == null) {
            rootNode = nodeToInsert;
        } else {
            int compResult = nodeToInsert.compareTo(parentNode);
            if(compResult < 0) {
                parentNode.setLeft(nodeToInsert);
            } else {
                parentNode.setRight(nodeToInsert);
            }
        }
    }

    public boolean contains(T value) {
        return subTreeSearch(value).getChild() != null;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return subTreeSize(rootNode);
    }

    private int subTreeSize(BTreeNode<T> node) {
        if(node == null) return 0;
        return 1 + subTreeSize(node.getLeft())
                 + subTreeSize(node.getRight());
    }

    public int height() {
        return subTreeHeight(rootNode);
    }

    protected int subTreeHeight(BTreeNode<T> node) {
        if(node == null) return 0;
        return 1 + Math.max(subTreeHeight(node.getLeft()),
                            subTreeHeight(node.getRight()));
    }

    public List<T> toList(Order order) {
        List<T> list = new ArrayList<>();
        walk(order, e -> list.add(e));
        return list;
    }

    public void walk(Order order, ValueHandler<T> handler) {
        switch(order) {
            case PREORDER:
                subTreeWalkPreOrder(rootNode, handler);
                break;
            case POSTORDER:
                subTreeWalkPostOrder(rootNode, handler);
                break;
            case INORDER:
                subTreeWalkInOrder(rootNode, handler);
                break;
        }
    }

    private void subTreeWalkPreOrder(BTreeNode<T> node, ValueHandler<T> handler) {
        if(node == null) return;
        handler.handle(node.getValue());
        subTreeWalkPreOrder(node.getLeft(), handler);
        subTreeWalkPreOrder(node.getRight(), handler);
    }

    private void subTreeWalkPostOrder(BTreeNode<T> node, ValueHandler<T> handler) {
        if(node == null) return;
        subTreeWalkPostOrder(node.getLeft(), handler);
        subTreeWalkPostOrder(node.getRight(), handler);
        handler.handle(node.getValue());
    }


    private void subTreeWalkInOrder(BTreeNode<T> node, ValueHandler<T> handler) {
        if(node == null) return;
        subTreeWalkInOrder(node.getLeft(), handler);
        handler.handle(node.getValue());
        subTreeWalkInOrder(node.getRight(), handler);
    }

    public BTreeNode<T> getRootNode() {
        return rootNode;
    }

    public T search(T value) {
        BTreeNode<T> child = subTreeSearch(value).getChild();
        if(child == null) return null;
        return child.getValue();
    }

    private Edge<T> subTreeSearch(T value) {
        return subTreeSearch(
            new Edge<T>(rootNode, null, ChildIndex.LEFT),
            value
        );
    }

    private Edge<T> subTreeSearch(Edge<T> lastEdge, T value) {
        BTreeNode<T> currentNode = lastEdge.getChild();
        if(currentNode == null) return lastEdge;

        int result = currentNode.getValue().compareTo(value);
        if     (result == 0) return lastEdge;

        Edge<T> nextEdge;
        if(result > 0) nextEdge = new Edge<T>(currentNode.getLeft(), currentNode, ChildIndex.LEFT);
        else           nextEdge = new Edge<T>(currentNode.getRight(), currentNode, ChildIndex.RIGHT);
        return subTreeSearch(nextEdge, value);
    }

    public boolean remove(T value) {
        Edge<T> edge = subTreeSearch(value);

        /* no such node with this value */
        if     (edge.getChild() == null)       return false;
        else if(edge.getChild().isLeaf())      return removeLeafNode(edge);
        else if(!edge.getChild().isFullNode()) return removeUnfullNode(edge);
        else                                   return removeFullNode(edge);
    }

    private boolean removeLeafNode(Edge<T> edge) {
        replaceChildNode(edge, null);
        return true;
    }

    private boolean removeUnfullNode(Edge<T> edge) {
        BTreeNode<T> node = edge.getChild();
        BTreeNode<T> singleChildNode = node.getLeft() == null
            ? node.getRight()
            : node.getLeft();

        replaceChildNode(edge, singleChildNode);
        return true;
    }

    private boolean removeFullNode(Edge<T> edge) {
        BTreeNode<T> node = edge.getChild();
        Edge<T> leftmostEdge = getLeftmostEdge(new Edge(node.getRight(), node, ChildIndex.RIGHT)); 
        BTreeNode<T> leftmostNode = leftmostEdge.getChild();

        if(leftmostNode.isLeaf()) removeLeafNode(leftmostEdge);
        else                      removeUnfullNode(leftmostEdge);

        leftmostNode.setLeft(node.getLeft());
        leftmostNode.setRight(node.getRight());
        node.setLeft(null);
        node.setRight(null);
        replaceChildNode(edge, leftmostNode);

        return true;
    }

    private Edge<T> getLeftmostEdge(Edge<T> edge) {
        BTreeNode<T> node = edge.getChild();
        if(node.getLeft() != null) return getLeftmostEdge(new Edge(node.getLeft(), node, ChildIndex.LEFT));
        return edge;
    }

    protected void replaceChildNode(Edge<T> edge, BTreeNode<T> replacement) {
        if     (edge.getParent() == null)  rootNode = replacement;
        else                               edge.getParent()
                                               .setChild(edge.getChildIndex(),
                                                         replacement);
    }

    @Override
    public String toString() {
        return toStringRecurse(rootNode);
    }

    public String toStringRecurse(BTreeNode<T> node) {
        if(node == null) return "null";
        return node.toString() + "\n"
        + "+-" + indent(toStringRecurse(node.getLeft()), "| ") + "\n"
        + "\\-" + indent(toStringRecurse(node.getRight()), "  ") + "";
    }

    public String indent(String str, String indentStr) {
        return Pattern.compile("^", Pattern.UNIX_LINES | Pattern.MULTILINE).matcher(str).replaceAll(indentStr).substring(2);
    }
}
