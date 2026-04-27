package repeticao;

import java.util.Scanner;

public class Exercicio02MenuDeBancoInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoConta = 548.59;
        double valorSacado = 0;
        double valorDepositado = 0;

        System.out.printf("Bem vindo ao Banco KimCoin!%n%n");
        System.out.println("******MENU******");

        int opcaoDesejada = 0;

        while(opcaoDesejada != 4){
            System.out.printf("%n1 - Ver saldo%n2 - Depositar%n3 - Sacar%n4 - Sair%n%n");
            System.out.println("Digite a opção desejada: ");
            opcaoDesejada = scanner.nextInt();

            switch (opcaoDesejada) {
                case 1 -> System.out.printf("Seu saldo atual é de R$%.2f%n", saldoConta);
                case 2 -> {
                    System.out.println("Digite o valor que irá depositar: ");
                    valorDepositado = scanner.nextDouble();
                    if (valorDepositado > 0) {
                        saldoConta += valorDepositado;
                        System.out.printf("Valor de R$%.2f, recebido.%n", valorDepositado);
                    }else {
                        System.out.println("ERRO: Valor inválido!");
                    }
                }
                case 3 -> {
                    System.out.println("Digite o valor que irá sacar: ");
                    valorSacado = scanner.nextDouble();
                    if (valorSacado <= 0){
                        System.out.printf("Valor inválido!%nValor precisa ser maior que R$0,00%n");
                    } else if (valorSacado <= saldoConta) {
                    saldoConta -= valorSacado;
                    System.out.printf("Saque realizado no valor de R$%.2f%n", valorSacado);
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                }
                case 4 -> System.out.println("Obrigada por usar KimCoin!");
                default -> System.out.printf("ERRO: Opção inválida! Digite novamente: ");
            }
        }


    }

}
