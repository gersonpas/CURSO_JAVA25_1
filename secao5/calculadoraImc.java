package secao5;

import java.util.Scanner;

public class calculadoraImc {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o seu peso: ");

    double peso = scanner.nextDouble();
    
    System.out.println("Digite a sua Altura: ");

    double altura =  scanner.nextDouble();

    double imc = peso / (altura * altura);

    if (imc < 18.5) {
        System.out.println("Seu IMC é: " + imc + "Classificação: Abaixo do peso!");
                
    }else if (imc >= 18.5 && imc < 24.9) {
        System.out.println("Seu IMC é: " + imc + "Classificação: peso Normal!");
        
    }else if (imc >= 25 && imc < 29.9) {
        System.out.println("Seu IMC é: " + imc + "Classificação: Acima do peso!");
    }

    scanner.close();
   } 
}
