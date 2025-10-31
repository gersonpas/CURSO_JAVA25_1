package secao20;

public class POO {
    public static void main(String[] args) {       

        // Override  -  4 
        Quadrado q1 = new Quadrado(4);
        Circulo c1 = new Circulo(3.2);

        System.out.println("Área do quadrado: " + q1.calcularArea());
        System.out.println("Área do circulo: " +c1.calcularArea());

        // 5 - super

        Funcionario funcionario = new Funcionario("Carlos", 3000);
        Gerente gerente = new Gerente("Armando" + " => Gerente Geral", 5000, 1000);

        funcionario.exibirDetalhes();
        gerente.exibirDetalhes();

        System.out.println(gerente.calcularBonus());
        System.out.println(funcionario.calcularBonus());

        // 6 - Classe Abstrata
        InstrumentoMusical violao = new Violao("Violão");
        InstrumentoMusical bateria = new Bateria("Bateria");
        InstrumentoMusical violino = new Violino("Violino");

        violao.exibirDetalhes();
        bateria.exibirDetalhes();        

        violao.tocar();
        bateria.tocar();        

        // 7  -  Interfaces 

        Pagamento cartao = new CartaoCredito();
        Pagamento transfer = new TransferenciaBancaria();

        cartao.processarPagamento(100);
        transfer.exibirRecibo(100);

        transfer.processarPagamento(500);
        transfer.exibirRecibo(500);

        //  10 -  Polimorfismo 
        // Classes abstratas ou interfaces -> sobreescrever os métodos destas superclasses
        violino.exibirDetalhes();
        violino.tocar();

    }
}
