package condicionais;

import java.util.Scanner;

public class Exercicio05LoginSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String login = "Kimberly";
        String senha = "Kim123";

        System.out.println("Digite seu nome de usuario: ");
        String loginDigitado = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senhaDigitada = scanner.nextLine();

        if (loginDigitado.equals(login) && senhaDigitada.equals(senha)) {
            System.out.printf("Usuario Conectado!%nBem vindo(a), %s!", login);
        } else if (!loginDigitado.equals(login)) {
            System.out.printf("ERRO: Usuario %s não encontrado!%nTente novamente!", loginDigitado);
        } else {
            System.out.println("ERRO: Senha inválida!");
        }

        scanner.close();

    }
}