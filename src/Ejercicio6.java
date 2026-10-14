import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int aux = numeros[i];
            numeros[i] = numeros[9 - i];
            numeros[9 - i] = aux;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}