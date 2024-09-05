import java.util.Scanner;

public class CountLetterA {

    // Função que conta a quantidade de vezes que 'a' (maiúsculo ou minúsculo)
    // aparece na string
    public static int countA(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'a' || currentChar == 'A') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Lendo a string informada pelo user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma string: ");
        String input = scanner.nextLine();

        // Contando quantas vezes a letra 'a' aparece
        int count = countA(input);

        // Exibindo o resultado
        if (count > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + count + " vezes.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não foi encontrada.");
        }

        scanner.close();
    }
}
