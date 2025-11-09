package secao9;

public class Carro {
    
    String marca;
    String modelo;
    int ano;

    double velocidadeAtual = 0;
    boolean motorLigado = true;


    //Métodos

    public void acelerar(){
        System.out.println("Estamos acelerando o carro!");
    }

    void exibirInfo(){
        System.out.println("Marca: " + marca + ", Modelo: " +
         modelo + ", Ano: " + ano);
    }

    void ligarMotor(){
        if (motorLigado) {
            System.out.println("O motor já está ligado!");
        }else{
            System.out.println("Ligando o Motor!");
        }
    }

}
