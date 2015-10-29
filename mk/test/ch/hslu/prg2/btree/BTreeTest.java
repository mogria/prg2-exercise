package ch.hslu.prg2.btree.test;

import ch.hslu.prg2.btree.BalancedBTree;
import ch.hslu.prg2.btree.BTree;
import ch.hslu.prg2.btree.BTreeNode;
import ch.hslu.prg2.btree.Order;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class BTreeTest {

    private BTree<Integer> emptyTree;
    private BTree<Integer> smallTree;
    private BTree<Integer> tree;
    private BalancedBTree<Integer> balancedTree;

    @Before
    public void setUp() {
        emptyTree = new BTree<>();
        smallTree = new BTree<>();
        smallTree.insert(5);
        smallTree.insert(4);
        /*
                10
               /  \
              2    21
             / \   / \
            1   5  15 23
                 \  \
                  7  17
        */
        tree = new BTree();
        tree.insert(10);
        tree.insert(2);
        tree.insert(5);
        tree.insert(7);
        tree.insert(1);
        tree.insert(21);
        tree.insert(15);
        tree.insert(17);
        tree.insert(23);

        balancedTree = new BalancedBTree<>();
        balancedTree.insert(10);
        // left left
        balancedTree.insert(5);
        balancedTree.insert(3);
        // left right
        balancedTree.insert(1);
        balancedTree.insert(2);
        // right right
        balancedTree.insert(20);
        balancedTree.insert(30);
        // right left
        balancedTree.insert(40);
        balancedTree.insert(35);

        balancedTree.insert(11);
        balancedTree.insert(41);
        balancedTree.insert(21);
        balancedTree.insert(7);
        balancedTree.insert(8);
        balancedTree.insert(0);
        balancedTree.insert(12);


    }

    @After
    public void tearDown() {
    }

    @Test
    public void testRootNodeInsert() {
        emptyTree.insert(8);
        Assert.assertEquals("tree with root node should have size 1", 1, emptyTree.size());
        Assert.assertEquals("tree with root node should have height 1", 1, emptyTree.height());
    }

    @Test
    public void testInsert() {


        BTreeNode<Integer> root = tree.getRootNode();
        Assert.assertEquals("root node should be 10", 10, root.getValue().intValue());
        Assert.assertEquals(2, root.getLeft().getValue().intValue());
        Assert.assertEquals(21, root.getRight().getValue().intValue());
        Assert.assertEquals(1, root.getLeft().getLeft().getValue().intValue());
        Assert.assertEquals(5, root.getLeft().getRight().getValue().intValue());
        Assert.assertEquals(15, root.getRight().getLeft().getValue().intValue());
        Assert.assertEquals(23, root.getRight().getRight().getValue().intValue());
        Assert.assertEquals(7, root.getLeft().getRight().getRight().getValue().intValue());
        Assert.assertEquals(17, root.getRight().getLeft().getRight().getValue().intValue());
    }

    @Test
    public void testSize() {
        Assert.assertEquals("empty tree should have size 0", 0, emptyTree.size());
        Assert.assertEquals(2, smallTree.size());
        Assert.assertEquals(9, tree.size());
    }

    @Test
    public void testHeight() {
        Assert.assertEquals("empty tree should have height 0", 0, emptyTree.height());
        Assert.assertEquals(2, smallTree.height());
        Assert.assertEquals(4, tree.height());
    }

    @Test
    public void testSearch() {
        Assert.assertEquals("search on empty tree should always be unsuccessful", null, emptyTree.search(0));
        Assert.assertEquals(5, smallTree.search(5).intValue());
        Assert.assertEquals(4, smallTree.search(4).intValue());
        Assert.assertEquals(null, smallTree.search(3));
    }

    @Test
    public void testToListPreOrder() {
        Assert.assertArrayEquals("pre order is not correct",
            new Object[]{10, 2, 1, 5, 7, 21, 15, 17, 23},
            tree.toList(Order.PREORDER).toArray()
        );
    }

    @Test
    public void testToListPostOrder() {
        Assert.assertArrayEquals("post order is not correct",
            new Object[]{1, 7, 5, 2, 17, 15, 23, 21, 10},
            tree.toList(Order.POSTORDER).toArray()
        );
    }


    @Test
    public void testToListInOrder() {
        Assert.assertArrayEquals("in order is not correct",
            new Object[]{1, 2, 5, 7, 10, 15, 17, 21, 23},
            tree.toList(Order.INORDER).toArray()
        );
    }

    @Test
    public void testRemoveLeaf() {
        tree.remove(1);

        Assert.assertArrayEquals("removal of leaf failed",
            new Object[]{2, 5, 7, 10, 15, 17, 21, 23},
            tree.toList(Order.INORDER).toArray()
        );

        tree.remove(7);
        tree.remove(5);

        Assert.assertArrayEquals("removal of leaf failed",
            new Object[]{2, 10, 15, 17, 21, 23},
            tree.toList(Order.INORDER).toArray()
        );
    }

    @Test
    public void testRemoveSingleChild() {
        tree.remove(5);
        Assert.assertArrayEquals("removal failed with a single child failed",
            new Object[]{1, 2, 7, 10, 15, 17, 21, 23},
            tree.toList(Order.INORDER).toArray()
        );
        tree.remove(15);
        Assert.assertArrayEquals("removal failed with a single child failed",
            new Object[]{1, 2, 7, 10, 17, 21, 23},
            tree.toList(Order.INORDER).toArray()
        );
    }

    @Test
    public void testRemoveArbitrarily() {
        tree.remove(10);

        Assert.assertArrayEquals("removal with 2 children failed",
            new Object[]{1, 2, 5, 7, 15, 17, 21, 23},
            tree.toList(Order.INORDER).toArray()
        );

        tree.remove(2);
        Assert.assertArrayEquals("removal with 2 children failed",
            new Object[]{1, 5, 7, 15, 17, 21, 23},
            tree.toList(Order.INORDER).toArray()
        );
    }

    @Test
    public void testInsertBalanced() {
        final int n = balancedTree.size();
        final int maxHeight = getMaxHeightOfBalancedTree(balancedTree.size());
        Assert.assertTrue("height of AVL tree with " + n + " should not exceed " + maxHeight, balancedTree.height() < maxHeight);
        Assert.assertEquals("16 elements should have been inserted by now", 16, balancedTree.size());


        Assert.assertArrayEquals("removal with 2 children failed",
            new Object[]{0, 1, 2, 3, 5, 7, 8, 10, 11, 12, 20, 21, 30, 35, 40, 41},
            balancedTree.toList(Order.INORDER).toArray()
        );

    }

    @Test
    public void testDeleteBalanced() {
        balancedTree.remove(5);
        System.out.println(balancedTree);
        Assert.assertArrayEquals("removal with 2 children failed",
            new Object[]{0, 1, 2, 3, 7, 8, 10, 11, 12, 20, 21, 30, 35, 40, 41},
            balancedTree.toList(Order.INORDER).toArray()
        );
        balancedTree.remove(10);
        balancedTree.remove(20);
        balancedTree.remove(21);
        Assert.assertArrayEquals("removal with 2 children failed",
            new Object[]{0, 1, 2, 3, 7, 8, 11, 12, 30, 35, 40, 41},
            balancedTree.toList(Order.INORDER).toArray()
        );

        balancedTree.remove(41);

        Assert.assertArrayEquals("removal with 2 children failed",
            new Object[]{0, 1, 2, 3, 7, 8, 11, 12, 30, 35, 40},
            balancedTree.toList(Order.INORDER).toArray()
        );
    }

    private int getMaxHeightOfBalancedTree(int n) {
        // https://en.wikipedia.org/wiki/AVL_tree
        final double golden_ratio = 1.61803398875;
        double a = Math.log(5 * Math.sqrt(n + 2)) / Math.log(2);
        double b = Math.log(golden_ratio) / Math.log(2);
        return (int) Math.ceil(a / b);
    }
}

