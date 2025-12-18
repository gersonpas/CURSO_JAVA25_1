package secao26;


//import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Anotacoes {
    

    public static void main(String[] args) {
    
        // 1 - annotations pre definidas
        Cachorro cachorro = new Cachorro();

        cachorro.emitirSom();

        //cachorro.testeMover();

        // 2 - annotation customizada
        Exemplo exemplo = new Exemplo();

        // anotações geralmente vão precisar de try catch

        // loop em cada um dos métodos
        for(Method metodo : exemplo.getClass().getDeclaredMethods()) {

            System.out.println(metodo);

            // verifica se a anotacao esta presente no método
            if(metodo.isAnnotationPresent(Executar.class)) {

                // resgatar ql é a annotation
                Executar anotacao = metodo.getAnnotation(Executar.class);

                // loop baseado em qts vezes tem q executar
                for(int i = 0; i < anotacao.vezes(); i++) {

                    // invoco o método -> mostrarMensagem
                    try {
                        metodo.invoke(exemplo);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }

                }

            }

        }

    }

}