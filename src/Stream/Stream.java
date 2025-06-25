package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite números inteiros para adicionar na lista (digite 0 para parar):");
        int num;
        while (true) {
            num = sc.nextInt();
            if (num == 0) break;
            lista.add(num);
        }

        System.out.println("Lista original: " + lista);

        List<Integer> impares = lista.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Ímpares: " + impares);

        List<Integer> imparesDobradosOrdenados = lista.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Ímpares dobrados e ordenados: " + imparesDobradosOrdenados);

        List<Integer> listaOrdenada = lista.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Lista ordenada: " + listaOrdenada);

        sc.close();
    }
}