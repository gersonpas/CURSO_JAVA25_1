package secao22;

import java.io.*;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Arquivo {
    
    public static void main(String[] args) {       

        // 1 - Leitura de arquivos.
         // FileReader = caracter por caracter
        // BufferedReader = linha por linha

        // Ler o arquivo linha por linha.
        String currentDir = System.getProperty("user.dir") + "\\secao22\\";
        System.out.println("###########");
        System.out.println(currentDir);
        System.out.println("##########");


        try (FileReader reader = new FileReader(currentDir + "arquivo.txt")) {            
            int caracter;
            while((caracter = reader.read()) != -1) {
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
        System.out.println("----------Serialização de Objetos---------------");
        Pessoa pessoa = new Pessoa("GorsenPAS", 46);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        // Serialização  => OUTPUT
        // arquivos serializados tem a extensão  .ser
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser"))) {
            oos.writeObject(pessoa);
            System.out.println("==> Objeto serializado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao serializar objeto: " + e.getMessage());           
        }

        System.out.println("-----------Deserializando objetos----------------");

        // Deserialização => INPUT

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentDir + "pessoa.ser"))) {
                     
            Pessoa pessoa2 = (Pessoa) ois.readObject();
            System.out.println("Nome: " + pessoa2.getNome());
            System.out.println("Idade: " + pessoa2.getIdade());
            System.out.println("==> Objeto Deserializado com sucesso.");
            
        } catch (Exception e) {
         System.out.println("Erro ao deserializar objeto: " + e.getMessage());           

        }
        System.out.println("---------------------------------------------------"+ "\n");
        
        // 4 - Manipulação de arquivos Binários

        System.out.println("Manipulação de arquivos Binários\r\n");


        try (FileInputStream fis = new FileInputStream(currentDir + "foto_1977.jpg");
            FileOutputStream fos = new FileOutputStream(currentDir + "copia_imagem2.png");    
    
    ) {          
           
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);                
            }

                System.out.println("Arq copiado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao copiar arquivo."+ e.getMessage());
        }
        
        // 5 - Manipulação de arquivos de Vídeos
        System.out.println("---------------------------------------------------"+ "\n");
        
        System.out.println("Manipulação de arquivos de Vídeos\r\n");

        try (            
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(currentDir + "video.mkv"));            
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(currentDir + "copia_video.mkv"));
    
    ) {
          byte[] buffer = new byte[1024]; // buffer 1kb em  1kb.
          int bytesLidos;
          while ((bytesLidos = bis.read(buffer)) != -1) {
            bos.write(buffer,0, bytesLidos);                        
          }

          System.out.println("Vídeo copiado com sucesso.");
            
        } catch (Exception e) {
            System.out.println("Erro ao copiar arquivo." + e.getMessage());

        }
        System.out.println("---------------------------------------------------"+ "\n");

        // 6 - Manipulação de Imagens.
        System.out.println("Manipulação de Imagens. \r\n");

        try {
            BufferedImage imagem = ImageIO.read(new File(currentDir + "copia_imagem2.png"));
            if (imagem == null) {
                System.out.println("A imagem não pode ser carregada.");
                return;
            }
                Graphics2D g2d = imagem.createGraphics(); 
                // Preparando o texto.
                g2d.setFont(new Font("Arial", Font.BOLD, 50 ));
                FontMetrics fm = g2d.getFontMetrics();
                String texto = "Texto no Centro";

                // Centralizar texto na imagem.
                int larguraTexto = fm.stringWidth(texto);
                int alturaTexto = fm.getHeight();
                // Posionamento
                int x = (imagem.getWidth() - larguraTexto) / 2;
                int y = (imagem.getHeight() - alturaTexto) / 2 + fm.getAscent();
                // desenhar retangulo no fundo do texto
                g2d.setColor(Color.BLACK);
                g2d.fillRect(x - 10, y - fm.getAscent(),larguraTexto + 20, alturaTexto);

                // Desenhar o texto em cima do retangulo.
                g2d.setColor(Color.YELLOW);
                g2d.drawString(texto, x, y);

                // Liberando recursos
                g2d.dispose();

                // Salvando a imagem.

                File outputFile = new File(currentDir + "imagem_com_texto.png");
                ImageIO.write(imagem, "png", outputFile);
                System.out.println("Gerado um texto na imagem com sucesso.");

                
        } catch (Exception e) {
            System.out.println("Erro ao manipular imagem." + e.getMessage());
            

        }

   }
   
}
