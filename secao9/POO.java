package secao9;

public class POO {
    
public static void main(String[] args) {
    

   Carro fusca = new Carro();

   fusca.marca = "VW";
   fusca.modelo = "Fusca";
   fusca.ano    = 1964; 
   
   //Métodos

    fusca.acelerar();
    fusca.exibirInfo();
    fusca.ligarMotor();
    
}

}
