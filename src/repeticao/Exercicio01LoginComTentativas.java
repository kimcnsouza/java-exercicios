package repeticao;

import java.util.Scanner;

public class Exercicio01LoginComTentativas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String login = "Kimberly Souza";
        String senha = "K123456";

        System.out.println("Digite seu nome de usuario: ");
        String loginDigitado = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senhaDigitada = scanner.nextLine();

        while (!loginDigitado.equals(login) || !senhaDigitada.equals(senha)) {
            System.out.printf("Usuario e/ou senha inválidos.%nTente novamente. %n%n");

            System.out.println("Digite seu nome de usuario: ");
            loginDigitado = scanner.nextLine();

            System.out.println("Digite sua senha: ");
            senhaDigitada = scanner.nextLine();
        }

        System.out.printf("Usuario conectado!%nBem vindo(a) %s!", loginDigitado);

    }
}
