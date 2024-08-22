import java.util.Scanner;

public class JabaEx3 {
    public static void main(String[] args) {
        BinaryTree x = new BinaryTree();
        x.insert_root(0);

        x.root.left = new BinaryTreeNode(1);
        x.root.right = new BinaryTreeNode(2);
        x.root.right.right = new BinaryTreeNode(4);
        x.root.right.left = new BinaryTreeNode(3);
        x.root.right.left.left = new BinaryTreeNode(5);
        x.root.right.left.right = new BinaryTreeNode(6);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número e veja se ela está na árvore: ");
        int k = sc.nextInt();

        sc.close();

        boolean existe = verificadorNum(k, x.root);
        
        if (existe) {
            System.out.println("\nO número existe na árvore!");
        }
        else {
            System.out.println("\nO número não existe na árvore :(");
        }

    }

    public static boolean verificadorNum(int k, BinaryTreeNode x) {
        if (x == null) {
            return false;
        }

        if (x.item == k) {
            return true;
        }

        return (verificadorNum(k, x.left) || verificadorNum(k, x.right));
    }
}
