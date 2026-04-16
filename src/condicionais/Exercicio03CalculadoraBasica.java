package condicionais;

import java.util.Scanner;

public class Exercicio03CalculadoraBasica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite a operação (+ - * /): ");
        String operacao = scanner.next();

        switch (operacao){
            case "+" -> System.out.printf("%d + %d = %d%n" , numero1, numero2, (numero1 + numero2));
            case "-" -> System.out.printf("%d - %d = %d%n", numero1, numero2, (numero1 - numero2));
            case "*" ->System.out.printf("%d * %d = %d%n", numero1, numero2, (numero1 * numero2));
            case "/" ->System.out.printf("%d / %d = %d%n", numero1, numero2,(numero1 / numero2));
                default -> System.out.printf("ERRO! %nTente novamete!");
        }


    }
}
