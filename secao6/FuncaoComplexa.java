package secao6;

public class FuncaoComplexa {
    public static void main(String[] args) {      // Funções Condicionais Complexas
      String r1 = vericarAcesso(17, true, false);
      System.out.println(r1);
    }
    public static String vericarAcesso(
        int idade,
        boolean temCarteira,
        boolean temHistoricoNegativo){

            if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
                return "Acesso Permitido";
            }else{
                return "Acesso Negado!";
            }
        }
    

}
 