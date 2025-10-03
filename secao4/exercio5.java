package secao4;

import java.util.Scanner;

public class exercio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        if (n >= 10 && n <= 20) {
            System.out.println(" Dentro do Intervalo");
            
        }else{
            System.out.println(" Fora do Intervalo");

        }

        scanner.close();
    }
}
