package secao6;

public class ReturnString {
    public static void main(String[] args) {
       int numero = 18;
       String r1 = verificarPar(7);
       String r2 = verificarPar(numero); 
        System.out.println(r1);
        System.out.println(r2);

    }

    public static String verificarPar(int n){

        if (n % 2 == 0) {
            return "O número " + n + " é Par!";                   
        }else{
            return "O número " + n + " não é Par!";
        }
    }
}
