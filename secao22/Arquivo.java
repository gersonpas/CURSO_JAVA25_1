package secao22;

import java.io.*;

public class Arquivo {
    
    public static void main(String[] args) {
        

        // 1 - Leitura de arquivos.
         // FileReader = caracter por caracter
        // BufferedReader = linha por linha


        // Ler o arquivo linha por linha.
        String currentDir = System.getProperty("user.dir") + "\\secao22\\";
        System.out.println("");
        System.out.println(currentDir);
        System.out.println("");


        try (FileReader reader = new FileReader(currentDir + "arquivo.txt")) {
            
            int caracter;
          while ((caracter = reader.read()) != -1) {
            System.out.print((char)caracter);
            
          }
            
        }catch (Exception e) {
            System.out.println("Erro ao ler arquivo." + e.getMessage());
        }

        System.out.println();


        // Ler o arquivo linha por linha.
        System.out.println("Lendo o arquivo linha por linha.");
        try (BufferedReader reader = new BufferedReader(new FileReader(currentDir + "arquivo.txt"))) {
            
            String linha;

            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (Exception e) {
           
            System.out.println("Erro ao ler arquivo: " + e.getMessage());

        }

        // 2 => Escrever em arquivos

        try (FileWriter writer = new FileWriter(currentDir + "saida.txt")){

            writer.write("Escrevendo em arquivo \n");
            writer.write("Escrevendo em arquivo 2");
            
        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivo: " + e.getMessage());           
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt"))){
            
            writer.write("Escrevendo em arquivo com o buffered");
            writer.newLine();
            writer.write("Escrevendo em arquivo com o buffered 2");
            writer.append("\nTestando");
            writer.append("\nGerson Pereira de Araujo.");

        }catch (Exception e) {

            System.out.println("Erro ao escrever em arquivo: " + e.getMessage());           

        }

        // 3 => Serialização de Objetos.
        Pessoa pessoa = new Pessoa("GorsenPAS", 46);
        System.out.println(pessoa.getNome());
        System.out.println("--------------------------------");

        // Serialização  
        // arquivos serializados tem a extensão  .ser
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser"))) {
            
        } catch (Exception e) {
            System.out.println("Erro ao serializar objeto: " + e.getMessage());           
            

        }

    }
   
}
