
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite os números para preencher a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }


        int somaTotal = 0;

        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + somaLinha);
            somaTotal += somaLinha;
        }

        System.out.println("Soma total da matriz: " + somaTotal);
    }
}
