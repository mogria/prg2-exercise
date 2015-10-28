package ch.hslu.prg2.btree;

public class BalancedBTree<T extends Comparable<T>> extends BTree<T> {

    @Override
    protected BTreeNode<T> createBTreeNode(T value) {
        return new BalancedBTreeNode<T>(value);
    }

    @Override
    protected void insertOntoNode(BTreeNode<T> nodeToInsert, BTreeNode<T> parentNode) {
        super.insertOntoNode(nodeToInsert, parentNode);

        rebalance((BalancedBTreeNode<T>)nodeToInsert);
    }

    @Override
    protected void replaceChildNode(Edge<T> edge, BTreeNode<T> replacement) {
        super.replaceChildNode(edge, replacement);
        BalancedBTreeNode<T> parent
            = (BalancedBTreeNode<T>)edge.getParent();

        BalancedBTreeNode<T> newNode
            = (BalancedBTreeNode<T>)replacement;

        if(newNode == null) {
            rebalanceAfterDelete(parent);
        } else {
            rebalanceAfterInsert(newNode);
        }
    }

    @Override
    protected int subTreeHeight(BTreeNode<T> node) {
        if(node == null) return 0;
        return ((BalancedBTreeNode<T>)node).getHeight();
    }

    private void rebalanceAfterInsert(BalancedBTreeNode<T> mutatedNode) {
        mutatedNode.updateHeight();
        if(mutatedNode == null) return;
        BalancedBTreeNode<T> parent = mutatedNode.getParent();
        if(parent == null) return;
        parent.updateHeight();

        int parentBalance = parent.getBalance();
        int childBalance = mutatedNode.getBalance();
        if(parentBalance == 2) {
            if(childBalance == -1) {
                rotateLeft(mutatedNode);
            }
            rotateRight(parent);
        } else if(parentBalance == -2) {
            if(childBalance == 1) {
                rotateRight(mutatedNode);
            }
            rotateLeft(parent);
        }
        mutatedNode.updateHeight();

        rebalance(parent); // move up to root node, if necessary
    }

    private void rebalanceAfterDelete(BalancedBTreeNode<T> mutatedNode) {
        mutatedNode.updateHeight();
        if(mutatedNode == null) return;
        BalancedBTreeNode<T> parent = mutatedNode.getParent();
        if(parent == null) return;
        parent.updateHeight();

        int parentBalance = parent.getBalance();
        if(parentBalance == 2) {
            if(childBalance == -1) {
                rotateLeft(mutatedNode);
            }
            rotateRight(parent);
        } else if(parentBalance == -2) {
            if(childBalance == 1) {
                rotateRight(mutatedNode);
            }
            rotateLeft(parent);
        }
        mutatedNode.updateHeight();

        rebalance(parent); // move up to root node, if necessary

    }

    private void rotateRight(BalancedBTreeNode<T> node) {
        BalancedBTreeNode<T> leftChild = (BalancedBTreeNode<T>)node.getLeft();
        BalancedBTreeNode<T> swapRight = (BalancedBTreeNode<T>)leftChild.getRight();
        ensureRootNode(node, leftChild);
        leftChild.setRight(node);
        node.setLeft(swapRight);
    }


    private void rotateLeft(BalancedBTreeNode<T> node) {
        BalancedBTreeNode<T> rightChild = (BalancedBTreeNode<T>)node.getRight();
        BalancedBTreeNode<T> swapLeft = (BalancedBTreeNode<T>)rightChild.getLeft();
        ensureRootNode(node, rightChild);
        rightChild.setLeft(node);
        node.setRight(swapLeft);
    }

    private void ensureRootNode(BalancedBTreeNode<T> node, BalancedBTreeNode<T> possiblyNewRoot) {
        BalancedBTreeNode<T> parent = (BalancedBTreeNode<T>)node.getParent();
        possiblyNewRoot.setParent(parent);
        if(parent == null) rootNode = possiblyNewRoot;
        else if (parent.getRight() == node) parent.setRight(possiblyNewRoot);
        else if (parent.getLeft() == node) parent.setLeft(possiblyNewRoot);
    }
}
