public class JabaEx7 {
    public static void main(String[] args) {
        BinaryTree x = new BinaryTree();
        x.insert_root(0);

        x.root.left = new BinaryTreeNode(1);
        x.root.right = new BinaryTreeNode(2);
        x.root.right.right = new BinaryTreeNode(4);
        x.root.right.left = new BinaryTreeNode(3);
        x.root.right.left.left = new BinaryTreeNode(5);
        x.root.right.left.right = new BinaryTreeNode(6);

        int numeroNulls = contarNulls(x.root);

        System.out.println("O número de Null's armazenados na árvore é " + numeroNulls);
    }

    private static int contarNulls(BinaryTreeNode x) {
        if (x == null) {
            return 1;
        }

        int nullsEsquerdo = contarNulls(x.left);
        int nullsDireito = contarNulls(x.right);

        return nullsEsquerdo + nullsDireito;
    }
}
