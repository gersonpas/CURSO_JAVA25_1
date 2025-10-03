package secao6;

public class FuncoesSwitch {
    public static void main(String[] args) {
     
        System.out.println(obterDiaDaSemana(5));
        System.out.println(calculaMedia(5, 2, 7));

    }
    public static String obterDiaDaSemana(int dia){
        switch (dia) {
            case 1:
                return "Segunda-Feira"; 
            case 2:
                return "Terça-Feira"; 
            case 3:
                return "Quarta-Feira"; 
            case 4:
                return "Quinta-Feira"; 
            case 5:
                return "Sexta-Feira"; 
            case 6:
                return "Sabado"; 
            case 7:
                return "Domingo"; 
            default:
                return "Dia Inválido";
           
        }
    }

    /**
     *  
     * calcula a média de três números
     * @param num1  O primeiro número a ser enviado
     * @param num2  O segundo número a ser enviado
     * @param num3  O Terceiro número a ser enviado
     * @param dia   Valor correspondente ao dia da semana.
     *  
     */
    
    public static double calculaMedia(int num1, int num2, int num3){
        return (num1 + num2 + num3)/3;

    }
    


}
