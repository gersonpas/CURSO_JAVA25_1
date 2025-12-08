package secao24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import secao17.Pessoa;

public class Colecoes {
    
    public static void main(String[] args) {
        
        // 1 - List

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

            // LinkedList
        List<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println(numeros.get(3));

        numeros.remove(0);

        // Ver os valores facilmente
        System.out.println(numeros.toString());

        numeros.set(0, 23);

        System.out.println(numeros.get(0));


    
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

        // 3 - Map - (dicionários)
        // 4 - HshMap - Implementação de Map
        
       Map<String, Integer> idadeMap = new HashMap<>();
          idadeMap.put("Gerson", 30);
          idadeMap.put("Maria", 25);
          idadeMap.put("João", 28);
          idadeMap.put("Ana", 22);

    
          // Acessando valores
          System.out.println("Idade de Maria: " + idadeMap.get("Maria"));
    
          // Iterando sobre o Map
          System.out.println("Iterando sobre o Map:");
          for (Map.Entry<String, Integer> entry : idadeMap.entrySet()) {
                System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos.");
          }
          
           System.out.println("Map completo: " + idadeMap.toString() + " - Tamanho: " + idadeMap.size());

          System.out.println("Idade de Ana: " + idadeMap.get("Ana"));

          // LinkedHashMap - Mantém a ordem de inserção
            // TreeMap - Ordena as chaves

            Map<String, String> capitals = new HashMap<>();
            capitals.put("USA", "Washington, D.C.");
            capitals.put("France", "Paris");
            capitals.put("Japan", "Tokyo");      

            System.out.println("Capital of France: " + capitals.get("France"));

          // 4 - Iterando sobre o Map

          // 6 - Filter and Collect


          List<Integer> numerosFiltrados = numeros.stream().filter(numero -> numero > 3)
                                                  .collect(Collectors.toList());

            System.out.println(numeros);
            System.out.println("Números filtrados maiores que 3: " + numerosFiltrados);

          // 7 - Outros métodos úteis em coleções - busca 
            int numeroParaBuscar = 23;
            boolean encontrado = false;
            for (Integer numero : numeros) {
                if (numero == numeroParaBuscar) {
                    encontrado = true;                    
                }
            }
            
                System.out.println("Número " + numeroParaBuscar + " encontrado na lista.");
           
                System.out.println("Número " + numeroParaBuscar + " não encontrado na lista.");
              
            // contains
            if (numeros.contains(numeroParaBuscar)) {
                System.out.println("Número " + numeroParaBuscar + " encontrado na lista.");
            } else {
                System.out.println("Número " + numeroParaBuscar + " não encontrado na lista.");
            }
            
            // findAny
            Optional<Integer> numeroEncontrado = numeros.stream()
                                                    .filter(numero -> numero == numeroParaBuscar)
                                                    .findAny();
            System.out.println(numeroEncontrado);
            System.out.println(numeroEncontrado.isPresent() ? 
                               "Número " + numeroParaBuscar + " encontrado na lista." : 
                               "Número " + numeroParaBuscar + " não encontrado na lista.");
                
                               
            numeros.add(40);
            
            numeros.replaceAll(numero -> numero * 3);
            System.out.println(numeros); 
            
            // remoção baseada em condição
            numeros.removeIf(numero -> numero > 100);
            System.out.println(numeros);
            numeros.add(150);

            // 10 - reduce
            int soma = numeros.stream()
                            .reduce(0, (a, b) -> a + b);
            System.out.println("Soma dos números na lista: " + soma);

// 11 - ordenacao com comparator

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Gerson", 30));
        pessoas.add(new Pessoa("Maria", 25));
        pessoas.add(new Pessoa("João", 28));
        pessoas.add(new Pessoa("Ana", 22));

        
        // ordenar pelo nome
        pessoas.sort(Comparator.comparing(Pessoa::getNome));

        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

            // Ordenar pelo nome e idade
            pessoas.sort(Comparator.comparing(Pessoa::getNome)
            .thenComparing(Pessoa::getIdade));

            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa.getNome()+" - " + pessoa.getIdade());

            }

            // 12 - Uso avançado de streams
            // flatMap - transformar uma lista de listas em uma lista única.
            List<List<String>> listaDeListas = Arrays.asList(
                Arrays.asList("Maçã", "Morango"),
                Arrays.asList("Banana", "Abacaxi"),
                Arrays.asList("Laranja", "Uva"));
            
            List<String> listaUnica = listaDeListas.stream()
                                    .flatMap(List::stream)
                                    .collect(Collectors.toList());
            System.out.println(listaUnica);  
            
            // pipeline de streams
            List<Integer> resultado = numeros.stream()
                                    .filter(n -> n % 2 == 0)
                                    .map(n -> n * 5)
                                    .sorted()
                                    .collect(Collectors.toList());

            System.out.println(numeros);
            System.out.println(resultado);

                // 13 - Regex 
                
                

                                                
    } 
}

