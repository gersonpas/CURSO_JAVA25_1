package secao4;

import java.util.Scanner;
public class exercicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        
        int numero = scanner.nextInt();
        String resultado = "Par";
        if (numero % 2 == 0) {
            resultado = "Par";            
        }else{
            resultado = "Impar";            
        }
            System.out.println("O Número é: " + resultado);

        

        // Exercicio 4 
    
        int dia = scanner.nextInt();
        switch (dia) {
            case 1:
            case 7:
            System.out.println("Final de Semana");                          
                break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
            System.out.println("Dia de Semana");
            break;
            default:
                System.out.println("Número Inválido");    
                
            }
            
            scanner.close();
    }
}
