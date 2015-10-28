package ch.hslu.prg2.btree;

class Edge<T extends Comparable<T>> {
    private BTreeNode<T> child;
    private BTreeNode<T> parent;
    private ChildIndex childIndex; /* left or right */

    public Edge(BTreeNode<T> child, BTreeNode<T> parent, ChildIndex childIndex) {
        this.child = child;
        this.parent = parent;
        this.childIndex = childIndex;
    }

    public BTreeNode<T> getChild() {
        return child;
    }

    public BTreeNode<T> getParent() {
        return parent;
    }

    public ChildIndex getChildIndex() {
        return childIndex;
    }
}
