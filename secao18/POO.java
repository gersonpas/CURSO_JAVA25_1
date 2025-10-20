package secao18;

public class POO {
    public static void main(String[] args) {        
        
        Produto compras = new Produto();
        compras.setNome("Churrasqueira");
        compras.setPreco(100.9);
        compras.setQuantidade(21);
        compras.exibirDetalhes();
    }
}
