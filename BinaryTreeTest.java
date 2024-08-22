

class BinaryTreeTest{
    public static void main(String[] args) {
        // 1
        BinaryTree tree = new BinaryTree();
        tree.insertRoot(0);

        BinaryTreeNode no_1 = new BinaryTreeNode(1);
        BinaryTreeNode no_2 = new BinaryTreeNode(2);
        BinaryTreeNode no_3 = new BinaryTreeNode(3);
        BinaryTreeNode no_4 = new BinaryTreeNode(4);
        BinaryTreeNode no_5 = new BinaryTreeNode(5);
        BinaryTreeNode no_6 = new BinaryTreeNode(6);

        tree.root.left = no_1;
        tree.root.right = no_2;
        no_2.left = no_3;
        no_2.right = no_4;
        no_3.left = no_5;
        no_3.right = no_6;


        // 2
        System.out.println("Preorder");
        tree.root.binaryPreorder();
        System.out.println("-----------------");
        System.out.println("Postorder");
        tree.root.binaryPostorder();
        System.out.println("-----------------");
        System.out.println("Inorder");
        tree.root.binaryInorder();
        System.out.println("-----------------");

        // 3
        System.out.println("Checando se 3 está na árvore");
        tree.root.checkNum(3);
        System.out.println("-----------------");

        // 4
        System.out.println("Encontrando valor maximo");
        int max = tree.root.findMax();
        System.out.println("O valor máximo é: " + max);
        System.out.println("-----------------");

        // 5
        System.out.println("Encontrando o valor mínimo");
        int min = tree.root.findMin();
        System.out.println("O valor mínimo é: " + min);
        System.out.println("-----------------");

        // 6
        System.out.println("Calculando valor total e valor médio:");
        System.out.println("Valor total dos nós: " + tree.root.totalArvore());
        System.out.println("Valor médio: " + tree.root.mediaArvore());
        System.out.println("-----------------");

        // 7
        System.out.println("Contando o numero de nulos:");
        System.out.println("Numero de nós nulos: " + tree.root.contaNulos());
        System.out.println("-----------------");

        // 8
        System.out.println("Contando o numero de nós: ");
        System.out.println("Numero de nós: " + tree.root.contarNos());
        System.out.println("-----------------");

        // 9
        System.out.println("Contando numero de folhas");
        System.out.println("Numero de folhas: " + tree.root.contaFolhas());
        System.out.println("-----------------");

        // 10
        System.out.println("Calculando a altura da arvore");
        System.out.println("Altura: " + tree.root.altura());
        System.out.println("-----------------");
    }
}