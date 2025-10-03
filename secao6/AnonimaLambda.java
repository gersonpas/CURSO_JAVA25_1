package secao6;


import java.util.Arrays;
import java.util.List;

public class AnonimaLambda {
    public static void main(String[] args) {
        
       Runnable tarefa = () -> System.out.println("Minha Função Anonima!");
       
       tarefa.run();

        List<String> nomes = Arrays.asList("Ana", "Pedro", "Paulo");
        nomes.forEach(nome -> System.out.println(nome));

    }
}
