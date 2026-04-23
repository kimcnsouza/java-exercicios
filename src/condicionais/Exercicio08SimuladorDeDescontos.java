package condicionais;

import java.util.Scanner;

public class Exercicio08SimuladorDeDescontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo(a) ao simulador de compras da Kim & Cia!");

        System.out.printf("%nInsira o valor dos produtos:%n");
        double valorProduto = scanner.nextDouble();

        double valorComDesconto = 0;

        if (valorProduto >= 300){
            valorComDesconto = valorProduto - (valorProduto * 0.2);
            System.out.printf("Boa notícia!%nSua compra no valor de R$%.2f possui 20%% de desconto!%nValor final da compra é de R$%.2f", valorProduto, valorComDesconto);
        } else if (valorProduto >= 200) {
            valorComDesconto = valorProduto - (valorProduto * 0.15);
            System.out.printf("Boa notícia!%nSua compra no valor de R$%.2f possui 15%% de desconto!%nValor final da compra é de R$%.2f", valorProduto, valorComDesconto);
        } else if (valorProduto >= 100) {
            valorComDesconto = valorProduto - (valorProduto * 0.1);
            System.out.printf("Boa notícia!%nSua compra no valor de R$%.2f possui 10%% de desconto!%nValor final da compra é de R$%.2f", valorProduto, valorComDesconto);
        } else {
            System.out.printf("Sua compra no valor de R$%.2f não possui desconto. %nValor final da compra é de: R$%.2f.", valorProduto, valorProduto);
        }

        scanner.close();

    }
}
