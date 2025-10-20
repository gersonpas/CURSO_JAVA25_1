package secao17;
public class ContaBancaria {

    private String titular;
    private double saldo;

    public void setTitular(String titular){
       if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
       } else{
        System.out.println("Nome do Titular invalido");
       }       
    }
    public void setSaldo(double saldo){
        if (saldo >= 0) {
            this.saldo = saldo;            
        }else{
            System.out.println("O saldo precisa ser positivo");
        }
    }
    public String getTitular(){
        return titular;
    }
}