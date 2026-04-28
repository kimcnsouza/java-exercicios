package repeticao;

import java.util.Scanner;

public class Exercicio03SimuladorDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao simulador de compras!");

        double valorDaCompra = 0;
        double valorComDesconto = 0;
        int opcaoSelecionada = 1;
        int numeroPecas = 0;

        while (opcaoSelecionada != 2){
            System.out.printf("******MENU******%n%n1 - Fazer simulação%n2 - Sair%n3 - Ver resumo%n");
            opcaoSelecionada = scanner.nextInt();

            switch (opcaoSelecionada) {
                case 1-> {
                    valorDaCompra = 0;
                    valorComDesconto =0;
                    numeroPecas = 0;
                    System.out.printf("Digite o número de peças: %n");
                    numeroPecas = scanner.nextInt();
                    if (numeroPecas > 0){
                        for (int i = 0; i < numeroPecas; i++) {
                            System.out.printf("Digite o valor da peças: %n");
                            double valorDaPeca = scanner.nextDouble();
                            while (valorDaPeca <= 0){
                                System.out.printf("ERRO: Valor inválido. Digite o valor novamente: %n");
                                valorDaPeca = scanner.nextDouble();
                            }
                            valorDaCompra += valorDaPeca;
                        }

                        if (valorDaCompra >= 300){
                            valorComDesconto = valorDaCompra - (valorDaCompra * 0.2);
                            System.out.printf("%nBoa notícia!%nSua compra no valor de R$%.2f possui 20%% de desconto!%nValor final da compra é de R$%.2f%n%n", valorDaCompra, valorComDesconto);
                        } else if (valorDaCompra >= 200) {
                            valorComDesconto = valorDaCompra - (valorDaCompra * 0.15);
                            System.out.printf("%nBoa notícia!%nSua compra no valor de R$%.2f possui 15%% de desconto!%nValor final da compra é de R$%.2f%n%n", valorDaCompra, valorComDesconto);
                        } else if (valorDaCompra >= 100) {
                            valorComDesconto = valorDaCompra - (valorDaCompra * 0.1);
                            System.out.printf("%nBoa notícia!%nSua compra no valor de R$%.2f possui 10%% de desconto!%nValor final da compra é de R$%.2f%n%n", valorDaCompra, valorComDesconto);
                        } else {
                            valorComDesconto = valorDaCompra;
                            System.out.printf("%nSua compra no valor de R$%.2f não possui desconto. %nValor final da compra é de: R$%.2f.%n%n", valorDaCompra, valorDaCompra);
                        }
                    }else {
                        System.out.printf("ERRO: Quantidade iválida. Tente novamente: %n");
                    }
                    }

                case 2 -> System.out.println("Obrigada por usar nosso sistema!");
                case 3 -> {
                    if (valorDaCompra > 0) {
                        double descontoEmReais = valorDaCompra - valorComDesconto;
                        double descontoPorcentagem = (descontoEmReais / valorDaCompra) * 100;
                        System.out.printf("Peças: %d%nTotal bruto: R$%.2f%nDesconto: %.0f%%%nValor do desconto: R$%.2f%nValor final: R$%.2f%n%n", numeroPecas, valorDaCompra, descontoPorcentagem, descontoEmReais, valorComDesconto);
                    } else {
                        System.out.println("Ainda não há nenhuma compra simulada.%n");
                    }
                }
                default -> System.out.printf("ERRO: Opção iválida. Tente novamente: %n");
            }

        }

        scanner.close();

    }
}
