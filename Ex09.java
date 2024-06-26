import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        //9. Escreva um programa que verifica se uma string é um palíndromo.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();
        frase = frase.toLowerCase();

        String palindromo = new StringBuilder(frase).reverse().toString();

        String resposta = (frase.equals(palindromo)) ? "A frase : " + frase + " é um palíndromo" : "A frase : " + frase + " não é um palíndromo";
        System.out.println(resposta);

        entrada.close();
    }
}