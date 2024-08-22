public class JabaEx9 {
    public static void main(String[] args) {
        BinaryTree x = new BinaryTree();
        x.insert_root(0);

        x.root.left = new BinaryTreeNode(1);
        x.root.right = new BinaryTreeNode(2);
        x.root.right.right = new BinaryTreeNode(4);
        x.root.right.left = new BinaryTreeNode(3);
        x.root.right.left.left = new BinaryTreeNode(5);
        x.root.right.left.right = new BinaryTreeNode(6);

        int quantidadeFolhas = contarFolhas(x.root);

        System.out.println("Quantidade de folhas é: " + quantidadeFolhas);
    }

    public static int contarFolhas(BinaryTreeNode x) {
        if (x == null) {
            return 0;
        }

        if (x.left == null && x.right == null) {
            return 1;
        }

        return contarFolhas(x.left) + contarFolhas(x.right);
    }
}
