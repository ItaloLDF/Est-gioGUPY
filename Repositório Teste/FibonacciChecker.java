import java.util.Scanner;

public class FibonacciChecker {

    // Função que verifica se um numero pertence a sequência de Fibonacci
    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int fibonacci = a + b;

        while (fibonacci <= number) {
            if (fibonacci == number) {
                return true;
            }
            a = b;
            b = fibonacci;
            fibonacci = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        // Lendo o numero informado pelo user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero para verificar se ele pertence a sequência de Fibonacci: ");
        int number = scanner.nextInt();

        // Verificando se o numero pertence a sequência de Fibonacci
        if (isFibonacci(number)) {
            System.out.println("O numero " + number + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O numero " + number + " NÃO pertence a sequência de Fibonacci.");
        }

        scanner.close();
    }
}
