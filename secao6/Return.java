package secao6;

public class Return {

    public static void main(String[] args) {   

        saudar("Gerson PAS");
      //  dobrar(2);
        int numero = 10;
        int numerodobrado = dobrar(numero);
        System.out.println("O Múmero dobrado é: " + numerodobrado);
    }
    
    public static void saudar(String nome){

        System.out.println("Olá,  " + nome + ", boa noite! ");
    }
    public static int dobrar(int n){
            return (n * 4)/2;
            
    }
}
