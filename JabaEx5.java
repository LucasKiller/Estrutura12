public class JabaEx5 {
    public static void main(String[] args) {
        BinaryTree x = new BinaryTree();
        x.insert_root(0);

        x.root.left = new BinaryTreeNode(1);
        x.root.right = new BinaryTreeNode(2);
        x.root.right.right = new BinaryTreeNode(4);
        x.root.right.left = new BinaryTreeNode(3);
        x.root.right.left.left = new BinaryTreeNode(5);
        x.root.right.left.right = new BinaryTreeNode(6);

        int menorValor = menorValor(x.root);

        if (menorValor == 999) {
            System.out.println("A árvore é vazia!");
        }
        else {
            System.out.println("O menor valor na árvore é o número " + menorValor);
        }
    }

    public static int menorValor(BinaryTreeNode x) {
        if (x == null) {
            return 999; 
        }

        int menorLeft = menorValor(x.left);
        int menorRight = menorValor(x.right);

        int menorValor = x.item;
        if (menorValor > menorLeft) {
            menorValor = menorLeft;
        }
        if (menorValor > menorRight) {
            menorValor = menorRight;
        }

        return menorValor;
    }
}