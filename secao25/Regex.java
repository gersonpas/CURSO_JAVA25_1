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

        // 2 - ancoras e fronteiras

        // ^ no inicio da string
        regex = "^c";
        texto = "carro casa cadeira";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para ^c");
        while(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        // $ no final
        regex = "cadeira$";
        texto = "carro casa cadeira";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para a$");
        while(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        // fronteira \b -> apenas o que ta entre os \b
        regex = "\\bpalavra\\b";
        texto = "palavra compalavra palavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para \\bpalavra\\b");
        while(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        // fronteira \B -> string com fronteira com o texto a ser procurado
        regex = "\\Bpalavra";
        texto = "palavra compalavra apalavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para \\Bpalavra");
        while(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
    }

        // 3 - grupos de captura
        regex = "(\\d{2})-(\\d{2})-(\\d{4})"; // dd/mm/aaaa   
        texto = "A data de hoje é 10-05-2023 e a de ontem foi 09-05-2023";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia de grupos de captura");
        while(matcher.find()) {
            System.out.println("Encontrado dia: " + matcher.group(1)
            + " mês: " + matcher.group(2)
            + " ano: " + matcher.group(3)
             );


         }





      }
  }


