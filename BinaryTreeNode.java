public class BinaryTreeNode {
    int item;
    BinaryTreeNode parent;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int item) {
        this.item = item;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public boolean isLeft() {
        return this.left != null;
    }

    public boolean isRight() {
        return this.right != null;
    }

    public BinaryTreeNode left() {
        return this.left;
    }

    public BinaryTreeNode right() {
        return this.right;
    }

    public void binaryPostorder() {
        if (this.isLeft()) {
            this.left.binaryPostorder();
        }
        if (this.isRight()) {
            this.right.binaryPostorder();
        }
        System.out.print(this.item + " ");
    }

    public void binaryInorder() {
        if (this.isLeft()) {
            this.left.binaryInorder();
        }
        System.out.print(this.item + " ");
        if (this.isRight()) {
            this.right.binaryInorder();
        }
    }

    public void binaryPreorder() {
        System.out.print(this.item + " ");
        if (this.isLeft()) {
            this.left.binaryPreorder();
        }
        if (this.isRight()) {
            this.right.binaryPreorder();
        }
    }
}
