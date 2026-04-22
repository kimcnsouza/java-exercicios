package condicionais;

import java.util.Scanner;

public class Exercicio06MenuBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Bem vindo ao Banco KimCoin!%n%n");
        System.out.println("******MENU******");
        System.out.printf("%n1 - Ver saldo%n2- Depositar%n3- Sacar%n4- Sair%n%n");

        double saldoConta = 500;
        double valorDepositado = 0;
        double valorSacado = 0;

        System.out.println("Digite a opção desejada: ");
        int opcaoDesejada = scanner.nextInt();

        switch (opcaoDesejada) {
            case 1 -> System.out.printf("Seu saldo atual é de R$%.2f", saldoConta);
            case 2 -> {
                System.out.println("Digite o valor que irá depositar: ");
                valorDepositado = scanner.nextDouble();
                saldoConta += valorDepositado;
                System.out.printf("Valor de R$%.2f, recebido.", valorDepositado);
            }
            case 3 -> {
                System.out.println("Digite o valor que irá sacar: ");
                valorSacado = scanner.nextDouble();
                if (valorSacado <= saldoConta){
                saldoConta -= valorSacado;
                System.out.printf("Saque realizado no valor de R$%.2f", valorSacado);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            }
            case 4 -> System.out.println("Obrigada por usar KimCoin!");
            default -> System.out.println("Opção Inválida!");
        }
        scanner.close();
    }

}
