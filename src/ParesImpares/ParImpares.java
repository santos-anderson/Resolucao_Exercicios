package ParesImpares;

import java.util.Scanner;

public class ParImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.print("Digite o número para ver se é Par ou Impar: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("O número não pode ser negativo! Por favor, digite novamente.");
            }
        } while (num < 0);

        if (num % 2 == 0){
            System.out.println("O número " +num+ " é Par!!");
        } else  {
            System.out.println("O número " +num+ " é Impar!!");
        }

    }
}