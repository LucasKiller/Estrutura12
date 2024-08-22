public class JabaEx4 {
    public static void main(String[] args) {
        BinaryTree x = new BinaryTree();
        x.insert_root(0);

        x.root.left = new BinaryTreeNode(1);
        x.root.right = new BinaryTreeNode(2);
        x.root.right.right = new BinaryTreeNode(4);
        x.root.right.left = new BinaryTreeNode(3);
        x.root.right.left.left = new BinaryTreeNode(5);
        x.root.right.left.right = new BinaryTreeNode(6);

        int maiorValor = maiorValor(x.root);

        if (maiorValor == -1) {
            System.out.println("A árvore é vazia!");
        }
        else {
            System.out.println("O maior valor na árvore é o número " + maiorValor);
        }
    }

    public static int maiorValor(BinaryTreeNode x) {
        if (x == null) {
            return -1;
        }

        int maiorLeft = maiorValor(x.left);
        int maiorRight = maiorValor(x.right);

        int maiorValor = x.item;
        if (maiorLeft > maiorValor) {
            maiorValor = maiorLeft;
        }
        if (maiorRight > maiorValor) {
            maiorValor = maiorRight;
        }

        return maiorValor;
    }
}
