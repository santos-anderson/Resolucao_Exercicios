package Fatorial;

import java.util.Scanner;

public class CalculoFatorial {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

    int num;
       do {
           System.out.print("Digite o número que deseja calcular o fatorial: ");
           num = sc.nextInt();
           if (num < 0) {
               System.out.println("O número não pode ser negativo! Por favor, digite novamente.");
           }
       } while (num < 0);

       int fatorial = 1;

       for (int i = 1; i <= num; i++) {
           fatorial *= i;

       }

       System.out.println(" O fatorial do numero " + num + " é: " + fatorial);

    }

}
