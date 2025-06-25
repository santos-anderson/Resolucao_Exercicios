package ListaPessoas;

import java.util.*;

public class ListaPessoas{
    public static void main(String[] args) {

        Map<String, Integer> pessoas = new HashMap<>();


        pessoas.put("Lucia", 42);
        pessoas.put("Gabriela", 13);
        pessoas.put("Carla", 41);
        pessoas.put("Fernando", 29);
        pessoas.put("Vanda", 34);


        Set<String> maioresDe30 = new HashSet<>();
        for (String nome : pessoas.keySet()) {
            int idade = pessoas.get(nome);
            if (idade > 30) {
                maioresDe30.add(nome);
            }
        }

        List<String> nomesOrdenados = new ArrayList<>(maioresDe30);
        Collections.sort(nomesOrdenados);


        System.out.println("Pessoas com mais de 30 anos:");
        for (String nome : nomesOrdenados) {
            System.out.println(nome);
        }
    }
}
