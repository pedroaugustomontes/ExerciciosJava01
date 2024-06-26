import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        //7. Escreva um programa que conta o número de vogais em uma frase fornecida pelo usuário.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String fraseEntrada = entrada.nextLine();
        fraseEntrada = fraseEntrada.toLowerCase();

        int contadorVogais = 0;
        for (int i = 0; i < fraseEntrada.length(); i++) {
            char letra = fraseEntrada.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                    letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú'
                    || letra == 'â' || letra == 'ê' || letra == 'ô' || letra == 'õ' || letra == 'ã') {
                contadorVogais++;
            }
        }
        System.out.println("Vogais: " + contadorVogais);
        entrada.close();
    }
}
