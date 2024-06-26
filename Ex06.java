import java.util.Scanner;

public class Ex06 {
    //6. Escreva um programa que encontra o maior número em uma lista de números fornecida pelo usuário.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos números você quer inserir?");
        int n = entrada.nextInt();

        if (n <= 0) {
            System.out.println("A quantidade de números deve ser maior que zero.");
        } else {
            System.out.println("Digite o primeiro número:");
            int maior = entrada.nextInt();

            for (int i = 1; i < n; i++) {
                System.out.println("Digite o próximo número:");
                int numero = entrada.nextInt();
                if (numero > maior) {
                    maior = numero;
                }
            }

            System.out.println("O maior número é: " + maior);
        }

        entrada.close();
    }
}
