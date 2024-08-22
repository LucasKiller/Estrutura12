public class JabaEx8 {
    public static void main(String[] args) {
        BinaryTree x = new BinaryTree();
        x.insert_root(0);

        x.root.left = new BinaryTreeNode(1);
        x.root.right = new BinaryTreeNode(2);
        x.root.right.right = new BinaryTreeNode(4);
        x.root.right.left = new BinaryTreeNode(3);
        x.root.right.left.left = new BinaryTreeNode(5);
        x.root.right.left.right = new BinaryTreeNode(6);

        int quantNos = contarNos(x.root);

        System.out.println("Quantidade de nós é: " + quantNos);
    }

    public static int contarNos(BinaryTreeNode x) {
        if (x == null) {
            return 0;
        }

        return 1 + contarNos(x.left) + contarNos(x.right);
    }
}
