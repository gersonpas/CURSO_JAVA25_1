package secao7;

import java.util.Scanner;

//import secao4.elseIf;

public class conversorTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Escolha 1: Farenheit ou 2: Celsius ");

        int Escolha = scanner.nextInt();
        
      if ( Escolha == 1) {
        System.out.println(" Farenheit ");
        converterFparaC();
      }  else if (Escolha == 2) {
        System.out.println("Celsius");
        converterCparaF();
      }else{
        System.out.println("Invalido");
        
      }

scanner.close();
    }
    
      public static void converterCparaF(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre a temperatura em Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();
        double celsius = (Fahrenheit - 32) * 5/9;
        System.out.println(Fahrenheit + " F convertido é igual a: " + celsius + "C");
        scanner.close();
      }
public static void converterFparaC(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double Fahrenheit = celsius * 5/9 + 32;
        System.out.println(celsius + " C convertido é igual a: " + Fahrenheit + "F");
        scanner.close();
      }


}
