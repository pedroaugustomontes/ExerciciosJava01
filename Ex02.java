import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        //2. Escreva um programa que calcula a média de uma lista de números fornecida pelo usuário.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de números: ");
        int quantidade = entrada.nextInt();
        double soma = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            double numero = entrada.nextDouble();
            soma += numero;
        }
        double media = soma / quantidade;
        System.out.println("A média é " + media);
    }
}
