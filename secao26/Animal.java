package secao26;


public class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som");
    }

    @Deprecated
    public void mover() {
        System.out.println("O animal se move");
    }

    public void emitirSom() {
       
        System.out.println("Som genérico de animal");
    }
    
}
