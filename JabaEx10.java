public class JabaEx10 {
    public static void main(String[] args) {
        BinaryTree x = new BinaryTree();
        x.insert_root(0);

        x.root.left = new BinaryTreeNode(1);
        x.root.right = new BinaryTreeNode(2);
        x.root.right.right = new BinaryTreeNode(4);
        x.root.right.left = new BinaryTreeNode(3);
        x.root.right.left.left = new BinaryTreeNode(5);
        x.root.right.left.right = new BinaryTreeNode(6);

        int altura = calcularArvore(x.root);

        System.out.println("A altura da árvore é: " + altura);
    }

    public static int calcularArvore(BinaryTreeNode x) {
        if (x == null) {
            return 0;
        }

        int alturaEsquerda = calcularArvore(x.left);
        int alturaDireita = calcularArvore(x.right);

        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }
}
