package Tabuada;

import java.util.Scanner;

        public class Tabuada {
            public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                int num;

                do {
                    System.out.print("Digite o número para Multiplicação: ");
                    num = sc.nextInt();
                    if (num <=0) {
                        System.out.println("O número não pode ser negativo e nem zero! Por favor, digite novamente.");
                    }
                } while (num <=0);

       System.out.println("A tabuada do " + num + " é: ");
        for (int i = 1; i <=10; i++){
            int multiplicacao = num * i;
            System.out.println(num + " x " + i + " = " + multiplicacao);
        }

            }

}
