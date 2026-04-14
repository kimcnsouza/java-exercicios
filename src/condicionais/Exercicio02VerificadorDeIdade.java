package condicionais;

import java.util.Scanner;

public class Exercicio02VerificadorDeIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade >=60){
            System.out.println("Idoso!");
        } else if(idade >=18){
            System.out.println("Adulto");
        } else {
            System.out.println("Menor de idade!");
        }
    }
}
