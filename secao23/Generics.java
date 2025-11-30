package secao23;
import java.util.*;


public class Generics {

    public static void main(String[] args) {
        
        // 1 - Classe Genericas
        // Quando instanciamos o objeto, agora o T é ALGUMA COISA.
        Caixa<Integer> caixaInteira = new Caixa<>();

        caixaInteira.adicionar(100);
        System.out.println(caixaInteira.obter());

        Caixa<String> caixaStr = new Caixa<>();

        caixaStr.adicionar("Teste");
        System.out.println(caixaStr.obter());

            // 2 - Métodos Genericos

            System.out.println("Maior valor entre 10 e 5 é: " + obterMaior(5, 10));
            System.out.println("Maior valor entre Python e Java é: " + obterMaior("Python", "Java" ));

            String[] letras = {"a", "b", "c" , "d"};
            Integer[] numeros = {12, 45, 99, 27};
            Boolean[] bools = {true, false, false,true};

            imprimirArray(letras);
            imprimirArray(numeros);
            imprimirArray(bools);
            System.out.println();

            // 3 - bounded types
        Comparador<Integer> comparadorInteiros = new Comparador<>();

        System.out.println("Maior numero entre 20 e 10: " + comparadorInteiros.obterMaior(20, 10));

        Comparador<Double> comparadorInteiros2 = new Comparador<>();

        System.out.println("Maior numero entre 1.95 e 4.55: " + comparadorInteiros2.obterMaior(1.95, 4.55));
    
        // Erro de compilação
        // Comparador<String> comparadorStrings = new Comparador<>();

        // - 4 WildCard

        List<Integer> numeros2 = Arrays.asList(1, 2 , 3);
        List<String> palavras2 = Arrays.asList("Gorsen", "Java", "olá");
            
        imprimirLista(numeros2);
        imprimirLista(palavras2);

        // 5 - Generics com Collections
        List<Integer> listaInteiros = new ArrayList< >();  
        listaInteiros.add(10);
        listaInteiros.add(20);
        listaInteiros.add(30);

        for(Number numero : listaInteiros){
            System.out.println(numero);
        }

        Set<String> conjuntoDePalavras = new HashSet< >();

        conjuntoDePalavras.add("Java");
        conjuntoDePalavras.add("Python");   
        conjuntoDePalavras.add("C++");

        for(String palavra : conjuntoDePalavras){
            System.out.println(palavra);
        }
    }
    
    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2){
        return (valor1.compareTo(valor2) > 0) ? valor1 : valor2;
    }

    public static <T> void imprimirArray(T[] array){
        for(T elemento : array){
            System.out.print(elemento + ", ");
        }
    }

    public static void imprimirLista(List<?> lista){
        for(Object elemento : lista){
            System.out.println(elemento);
        }
    }
}
