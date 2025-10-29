package secao20;

// Não tem uma herança propriamente dita
public class Violao extends InnerInstrumentoMusical {
    public Violao(String nome){
        super(nome);
    }

    @Override
    public void tocar(){
     System.out.println("Tocando as cordas do " + nome);
    }

}
