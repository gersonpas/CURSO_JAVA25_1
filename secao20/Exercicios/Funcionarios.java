package secao20.Exercicios;

abstract class Funcionarios {

    protected String nome;

    public Funcionarios(String nome) {
        this.nome = nome;
    }
   
   public abstract double calcularSalario();   
         
    
}
