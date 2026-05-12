package repeticao;

import java.util.Scanner;

public class Exercicios04CarrinhoDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menuCadastro = 0;
        int menuCarrinho = 1;

        double valorFinalDaCompra = 0;
        double valorDesconto = 0;
        double valorFinalComDesconto = 0;
        int index = 0;

        System.out.printf("Bem vindo ao Kim Supermarket!%nAproveite suas compras;)%n%n");
        System.out.println("Digite o numero de produtos que está comprando: ");
        int produtosNaCompra = scanner.nextInt();
        scanner.nextLine();

        String[] nomeProduto = new String[produtosNaCompra];
        double[] valorProduto = new double[produtosNaCompra];
        int[] quantidadePorProduto = new int[produtosNaCompra];
        double[] valorTotalPorProduto = new double[produtosNaCompra];

        while(index < produtosNaCompra){
            System.out.printf("%n1 - Adicionar produto%n2 - Cancelar compra%n");
            menuCadastro = scanner.nextInt();
            scanner.nextLine();
            if (menuCadastro == 1 || menuCadastro == 2) {
                if (menuCadastro != 2) {
                    System.out.println("Digite o nome do produto: ");
                    nomeProduto[index] = scanner.nextLine();
                    System.out.println("Digite o valor do produto: ");
                    valorProduto[index] = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite a quantidade de produto(s): ");
                    quantidadePorProduto[index] = scanner.nextInt();
                    scanner.nextLine();
                    index++;
                } else {
                    System.out.printf("%nObrigada por visitar o Kim Supermarket!");
                    break;
                }
            }else {
                System.out.printf("%nOpção inválida!%nDigite a opção desejada:%n");
            }
        }

        for (int i = 0; i < index; i++) {
            valorTotalPorProduto[i] = valorProduto[i] * quantidadePorProduto[i];
            valorFinalDaCompra += valorTotalPorProduto[i];
        }

        while (menuCarrinho == 1) {
                System.out.printf("%n1 - Ver carrinho%n2 - Finalizar compra%n3 - Sair%n");
                System.out.printf("%nDigite a opção desejada: %n");
                menuCarrinho = scanner.nextInt();

                switch (menuCarrinho){
                    case 1 -> {
                        System.out.printf("%n   ITEM        UNIDADE     VALOR P/ UNIDADE     VALOR TOTAL%n");
                        for (int i = 0; i < index; i++) {
                            System.out.printf(" > %s         %d           R$%.2f            R$%.2f%n", nomeProduto[i], quantidadePorProduto[i],valorProduto[i], valorTotalPorProduto[i]);
                        }
                        System.out.printf("%n*****TOTAL***** ->                                R$%.2f%n", valorFinalDaCompra);
                    }
                    case 2 -> {
                        if (valorFinalDaCompra > 300){
                             valorDesconto = valorFinalDaCompra * 0.3;
                             valorFinalComDesconto = valorFinalDaCompra - valorDesconto;
                            System.out.printf("Boa notícia! Sua compra teve um desconto de 30%%!%n");
                            System.out.printf("Valor total: R$%.2f %nValor do desconto: R$%.2f %nValor com desconto: R$%.2f", valorFinalDaCompra, valorDesconto, valorFinalComDesconto);
                        } else if (valorFinalDaCompra > 150) {
                             valorDesconto = valorFinalDaCompra * 0.15;
                             valorFinalComDesconto = valorFinalDaCompra - valorDesconto;
                            System.out.printf("Boa notícia! Sua compra teve um desconto de 15%%!%n");
                            System.out.printf("Valor total: R$%.2f %nValor do desconto: R$%.2f %nValor com desconto: R$%.2f", valorFinalDaCompra, valorDesconto, valorFinalComDesconto);
                        }else {
                            valorDesconto = 0;
                            valorFinalComDesconto = valorFinalDaCompra;
                            System.out.printf("Valor total: R$%.2f ", valorFinalDaCompra);
                        }
                        System.out.printf("%n%nCompra finalizada!%nObrigada pela preferência!");
                    }
                    case 3 -> System.out.printf("%nObrigada pela preferencia!%nVolte sempre!!!");
                    default -> System.out.printf("ERRO: Opção inválida!%n");
                }

        }


    }
}
