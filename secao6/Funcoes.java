package secao6;

public class Funcoes {

    public static void main(String[] args) {
       // Criando uma função  
        saudacao();
        saudacao();
        saudacao();
        soma(2, 4);
        soma(5, 7);
    }
    public static void saudacao(){
        System.out.println("Olá, esta é a minha primeira função!");
    }
    public static void soma(int a , int b){
        int resultado = a + b; 
        System.out.println("O resultado da soma é: " + resultado);             
    }

}
