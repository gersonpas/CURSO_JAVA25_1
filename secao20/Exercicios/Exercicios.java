package secao20.Exercicios;


public class Exercicios {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Nova", 0125, "Brasília - DF");
        Pessoa pessoa = new Pessoa("Fulano ", 35, endereco);
        
        pessoa.exibirInfo();
         System.out.println(endereco.getEnderecoCompleto());
         System.out.println();
         Carros carro = new Carros();
         Moto moto = new Moto();
         carro.acelerar();
         moto.acelerar();

    }
    
}
