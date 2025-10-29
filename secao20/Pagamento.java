package secao20;

interface Pagamento {

    // Método Abstrato
    void processarPagamento(double valor);

    // Método com Default
    default void exibirRecibo(double valor){
        System.out.println("Recibo do pagamento, com valor de R$" + valor);
    }


}  


    

