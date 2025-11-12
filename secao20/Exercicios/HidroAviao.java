package secao20.Exercicios;

public class HidroAviao extends Barco implements Pilotavel {
    
   @Override
   public void pilotar(){
    System.out.println("O hidroavião está voando e depois vai navegar.");
   } 
}
