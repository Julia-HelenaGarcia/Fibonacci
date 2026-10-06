import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N (quantidade de termos): ");
        int n = scanner.nextInt();

        System.out.println("Primeiros " + n + " termos da sequência de Fibonacci:");
        long anterior = 0;
        long atual = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(anterior + " ");
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        System.out.println();
        scanner.close();
    }
}