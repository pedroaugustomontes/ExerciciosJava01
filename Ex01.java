import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        //1. Escreva um programa que verifica se um número é positivo, negativo ou zero.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        // O dado vindo do Scanner sempre vai ser string, precisamos converter
        double numero = entrada.nextDouble();
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        entrada.close();
    }
}
