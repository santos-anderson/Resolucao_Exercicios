
package Calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        do {
            System.out.print("Digite o primeiro número: ");
            num1 = sc.nextInt();
            if (num1 < 0) {
                System.out.println("O número não pode ser negativo! Por favor, digite novamente.");
            }
        } while (num1 < 0);

        do {
            System.out.print("Digite o segundo número: ");
            num2 = sc.nextInt();
            if (num2 < 0) {
                System.out.println("O número não pode ser negativo! Por favor, digite novamente.");
            }
        } while (num2 < 0);


        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Digite o número da operação desejada: ");

        int opcao = sc.nextInt();


        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero não permitida!");
                } else {
                    System.out.println("Resultado: " + ((double) num1 / num2));
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}