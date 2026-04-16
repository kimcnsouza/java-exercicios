package condicionais;

import java.util.Scanner;

public class Exercicio04MediaEscolar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora de médias escolares!");

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) /3;

        if (media >= 7){
            System.out.printf("Parabéns, você foi aprovado! %nSua média de notas é %.2f", media);
        } else if (media >= 4) {
            System.out.printf("Essa foi por pouco! %nVocê está de recuperação! %nSua média de notas é %.2f", media);
        } else {
            System.out.printf("Você foi reprovado! %nSua média de notas é %.2f", media);
        }

        scanner.close();


    }
}
