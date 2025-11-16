package secao22;

import java.io.*;

public class Arquivo {
    
    public static void main(String[] args) {
        

        // 1 - Leitura de arquivos.

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

    }

}

