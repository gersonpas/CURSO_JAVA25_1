package secao20.Exercicios;

public class FuncionarioTempoIntegral extends Funcionarios implements Beneficios {
    
    private double salarioBase;
    private int horasTrabalhadas;


    public FuncionarioTempoIntegral(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
        
    }
    @Override
    public double calcularSalario(){
        return salarioBase;
    }
    
    @Override
    public void adicionarBeneficio(String beneficio){
        System.out.println("Benefício adicionado para tempo integral: " + beneficio);
    }



}
