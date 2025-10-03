package secao1;

import java.util.Scanner;

class TesteScanner {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + "!");



        
        scanner.close();

    }

}
