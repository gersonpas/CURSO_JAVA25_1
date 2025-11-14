package secao21;

public class Erros {

    public static void main(String[] args) {
        
        // 1 - try catch
        try{
            int a = 0;
            int b = 10;
            int resultado = b/a;


        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não é possível.");
        } 

    }
    
}
