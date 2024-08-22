public class JabaEx6 {
    public static void main(String[] args) {
        BinaryTree x = new BinaryTree();
        x.insert_root(0);

        x.root.left = new BinaryTreeNode(1);
        x.root.right = new BinaryTreeNode(2);
        x.root.right.right = new BinaryTreeNode(4);
        x.root.right.left = new BinaryTreeNode(3);
        x.root.right.left.left = new BinaryTreeNode(5);
        x.root.right.left.right = new BinaryTreeNode(6);

        double media = calcularMedia(x.root);

        System.out.println("A média aritmética dos valores na árvore é " + media);
    }

    public static double calcularMedia(BinaryTreeNode root) {
        Result resultado = calcularSomaEContagem(root);

        return (double) resultado.soma / resultado.contagem;
    }

    private static class Result {
        int soma;
        int contagem;

        Result(int soma, int contagem) {
            this.soma = soma;
            this.contagem = contagem;
        }
    }

    private static Result calcularSomaEContagem(BinaryTreeNode node) {
        if (node == null) {
            return new Result(0, 0);
        }

        Result leftResult = calcularSomaEContagem(node.left);
        Result rightResult = calcularSomaEContagem(node.right);

        int soma = node.item + leftResult.soma + rightResult.soma;
        int contagem = 1 + leftResult.contagem + rightResult.contagem;

        return new Result(soma, contagem);
    }
}

