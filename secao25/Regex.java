package secao25;
import java.util.regex.*;


public class Regex {
    public static void main(String[] args) {
     
      // 1 - Quantificador 
      //  exp. reg, text, ver se no texto há a exp. reg.
        String regex = "a*";// Zero ou mais 'a' 
        String texto = "b aaab aa ba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Correspondências para a+");
                while (matcher.find()) {
            System.out.println("" + matcher.group() + "" );           // find = encontrar algo na string.
        }


    }
}
