import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        //8. Escreva um programa que converte um número decimal em binário.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número decimal: ");
        double numeroDecimal = entrada.nextDouble();

        String binario = Integer.toBinaryString((int) numeroDecimal);

        System.out.println("O número binário é " + binario);

        entrada.close();

    }
}
