import java.util.Scanner;

public class Ex04 {
//4. Escreva um programa que imprime os fatores de um número fornecido pelo usuário.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para calcular seu fator: ");
        int numero = entrada.nextInt();

        System.out.println("O fator de " + numero + " é: ");
        //o programa vai começar a contar desde 1 até o número digitado
        for (int i = 1; i < numero; i++) {
            //
            if (numero % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
