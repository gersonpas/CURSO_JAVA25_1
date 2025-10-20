package secao19;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulador {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bilhete> bilhetes = new ArrayList<>();
        
        // Solicitando bilhetes de usuário
            System.out.println("Digite 6 números para o seu bilhete(entre 1 e 60: )");
                    int[] numerosEcolhidos = new int[6];
                        
                    // Usuário escolhe os números 
                for(int i = 0; i < numerosEcolhidos.length; i++){
                        System.out.println("Digite o número " + (i + 1) + ": ");
                        numerosEcolhidos[i] = scanner.nextInt();                         


                }
                    // Criamos o bilhete com os números escolhidos
                    Bilhete bilhete = new Bilhete(numerosEcolhidos);
                    bilhetes.add(bilhete);

               // Pergunta se o usuário quer continuar     
            System.out.println("Deseja registrar outro bilhete? (s/n)");
                    String resposta = scanner.next();
                   
                    
            while (true) {
                    if (resposta.equals("n")) {
                        break;
                        
                    }                
                    // Realizar o sorteio para cada bilhete
                    System.out.println("Realizando o sorteio...");
                    
                      for (Bilhete bilhete2 : bilhetes) {
                        bilhete.realizarSorteio();
                        bilhete.ExibirResultado();
                        break;
                      }
                        scanner.close(); 
                        
                }                  
            } 
        
    }       
