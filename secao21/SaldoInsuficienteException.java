package secao21;

public class SaldoInsuficienteException extends Exception{
    
    // Toda class que herda de Exception tem que enviar pelo menos uma 
    // mensagem => getMesage -> mensagem.
    public SaldoInsuficienteException(String mensagem){
        super(mensagem);

    }
    
}
