package ch.hslu.prg2.btree;

public class BalancedBTreeNode<T extends Comparable<T>> extends BTreeNode<T> {
    private int height;
    private BalancedBTreeNode<T> parent;

    public BalancedBTreeNode(T value) {
        super(value);
        height = 0;
        parent = null;
    }

    @Override
    public void setLeft(BTreeNode<T> node) {
        super.setLeft(node);
        if(node == null) return;
        ((BalancedBTreeNode<T>)node).setParent(this);
    }

    @Override
    public void setRight(BTreeNode<T> node) {
        super.setRight(node);
        if(node == null) return;
        ((BalancedBTreeNode<T>)node).setParent(this);
    }

    private int getLeftHeight() {
        BalancedBTreeNode<T> balancedLeft
            = (BalancedBTreeNode<T>)getLeft();
        return balancedLeft == null ? 0 : balancedLeft.getHeight();
    }

    private int getRightHeight() {
        BalancedBTreeNode<T> balancedRight
            = (BalancedBTreeNode<T>)getRight();
        return balancedRight == null ? 0 : balancedRight.getHeight();
    }

    public int getBalance() {
        return getLeftHeight() - getRightHeight();
    }

    public int getHeight() {
        return height;
    }

    public void updateHeight() {
        this.height = 1 + Math.max(getLeftHeight(), getRightHeight());
    }

    public BalancedBTreeNode<T> getParent() {
        return parent;
    }

    public void setParent(BalancedBTreeNode<T> parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "BN[" + getValue().toString() + ",b~" + getBalance() + "]:(" + getParent() + ")";
    }
}
