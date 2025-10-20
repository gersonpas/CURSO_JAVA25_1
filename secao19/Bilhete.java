
package secao19;

import java.util.Arrays;
import java.util.Random;

public class Bilhete {
   private int[] numerosEcolhidos;
   private int[] resultadoSorteio;

    public Bilhete(int[]numerosEcolhidos){
        this.numerosEcolhidos = numerosEcolhidos;        
    }
    // Metodo para realizar o sorteio
public void realizarSorteio(){
    Random random = new Random();
    resultadoSorteio = new int[6];
    for(int i = 0; i < resultadoSorteio.length; i++){
        resultadoSorteio[i] = random.nextInt(60)+1;
    }
    Arrays.sort(resultadoSorteio);    
}
    // Metodo para contar quantos números o jogador acertou
public int contarAcertos(){
    int acertos = 0;
    for(int numerosEcolhido : numerosEcolhidos){
        for(int numeroSorteado : resultadoSorteio){
            if (numerosEcolhido == numeroSorteado) {
                acertos++;
            }
        }
    }
    return acertos;
}
    // Exibir os resultados
    public void ExibirResultado(){
        System.out.println("Números escolhidos: " + Arrays.toString(numerosEcolhidos));
        System.out.println("Números Sorteados: " + Arrays.toString(resultadoSorteio));
        int acertos = contarAcertos();

        System.out.println("Você acertou: " + acertos + " acertos. ");
        System.out.println(" ");

    }
}
