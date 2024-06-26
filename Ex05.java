import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        //5. Escreva um programa que verifica se um número fornecido pelo usuário é primo.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        entrada.close();

        if (numero <= 1) {
            System.out.println(numero + " não é primo");
        } else if (numero == 2) {
            System.out.println(numero + " é primo");
        } else {
            boolean ehPrimo = true;
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println(numero + " é primo");
            } else {
                System.out.println(numero + " não é primo");
            }
        }
    }
}
