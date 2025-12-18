package secao26;



public class Cachorro extends Animal {

    // warning não para a compilação
    // erro (vermelho) para a compilação.

    @Override 
    public void emitirSom() {
        System.out.println("O cachorro late");
    }

    @SuppressWarnings("@Deprecated\r\n" + //
                "")
    public void mover() {
        // Usando o método mover, que está marcado como @Deprecated
       System.out.println("Teste do método mover:");
       
        // Isso deve gerar um aviso de depreciação
    }

}
