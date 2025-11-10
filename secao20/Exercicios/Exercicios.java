package secao20.Exercicios;


public class Exercicios {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Nova", 0125, "Brasília - DF");
        Pessoa pessoa = new Pessoa("Fulano ", 35, endereco);
        
        pessoa.exibirInfo();
         System.out.println(endereco.getEnderecoCompleto());
         System.out.println();

         //Exercício 2
         Carros carro = new Carros();
         Moto moto = new Moto();
         carro.acelerar();
         moto.acelerar();
         System.out.println();

         //Exercício 3
        Cachorro bob = new Cachorro("Maia", "Latido", "Caramelo");
        bob.exibirDetalhes();
        //bob.emitirSom();
        System.out.println();

        //Exercício 4
        System.out.println("Exercício 4 - Seção 20");
        FuncionarioTempoIntegral fti = new FuncionarioTempoIntegral("Ana", 4000);
        FuncionarioMeioPeriodo fmp = new FuncionarioMeioPeriodo("Francisco", 50, 120);
        System.out.println("Salario Ana: " + fti.calcularSalario());
        System.out.println("Salario Francisco: " + fmp.calcularSalario());
        
        fti.adicionarBeneficio("Plano de Saúde e VA");
        fmp.adicionarBeneficio(" VA");
        System.out.println();

    }
    
}
