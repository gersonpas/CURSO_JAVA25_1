package secao24;

import java.util.ArrayList;
import java.util.List;

public class Colecoes {
    
    public static void main(String[] args) {
        
        // 1 - Listas 

        List<String> listaDeNomes =  new ArrayList<>();
        // Adicionando elementos
        listaDeNomes.add("Gerson");
        listaDeNomes.add("Maria");
        listaDeNomes.add("João");

        // Acessando elementos
        System.out.println("Elemento no índice 0: " + listaDeNomes.get(0));

        // Iterando sobre a lista
            System.out.println("Iterando sobre a lista:");
            listaDeNomes.set(1, "Pedro");
            listaDeNomes.add("Ana");

            // Removendo um elemento
            // listaDeNomes.remove("João");

            // Procurando um elemento
            int index = listaDeNomes.indexOf("Ana");
            System.out.println("Índice de Ana: " + index);
    
            // Procurando por valor de item
            boolean existe = listaDeNomes.contains("Maria");
            System.out.println("Maria está na lista? " + existe);
            System.out.println(listaDeNomes.contains("Pedro") ? "Sim" : "Não existe");
            System.out.println(listaDeNomes.contains("Teste") ? "Sim" : "Não existe");

            // Imprimindo a lista completa
            System.out.println(listaDeNomes.toString() + " - Tamanho: " + listaDeNomes.size());

        // Tamanho da lista
        System.out.println("Tamanho da lista: " + listaDeNomes.size());
    
        for (String nome : listaDeNomes) {
            System.out.println("Nome: " + nome);
        }


    }
}
