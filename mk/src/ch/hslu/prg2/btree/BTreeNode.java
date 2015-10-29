package ch.hslu.prg2.btree;

public class BTreeNode<T extends Comparable<T>> implements Comparable<BTreeNode<T>> {
    private T value;
    private BTreeNode<T> left = null;
    private BTreeNode<T> right = null;

    public BTreeNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public BTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BTreeNode<T> left) {
        this.left = left;
    }

    public BTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BTreeNode<T> right) {
        this.right = right;
    }

    public BTreeNode<T> getChild(ChildIndex index) {
        if   (index == ChildIndex.LEFT) return getLeft();
        else                            return getRight();
    }

    public void setChild(ChildIndex index, BTreeNode<T> value) {
        if(index == ChildIndex.LEFT) setLeft(value);
        if(index == ChildIndex.RIGHT) setRight(value);
    }

    public int compareTo(BTreeNode<T> other) {
        return this.value.compareTo(other.getValue());
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public boolean isInnerNode() {
        return !isLeaf();
    }

    public boolean isFullNode() {
        return left != null && right != null;
    }

    @Override
    public String toString() {
        return "N[" + value.toString() + "]";
    }
}
