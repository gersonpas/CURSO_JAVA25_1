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
         // Backreference para substituição
         // $1 = primeiro grupo, $2 = segundo grupo, $3 = terceiro grupo...
            String textoSubstituido = texto.replaceAll("(\\d{2})-(\\d{2})-(\\d{4})", "$3/$2/$1");
            System.out.println("Texto substituído: " + textoSubstituido);

         // 4 - Avançando em pattern e matcher
           
         // correspondência parcial com lookingAt()
            regex = "\\d{3}";
            texto = "1234ABC456";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(texto);
            System.out.println("Correspodencia parcial com lookingAt()");
            if(matcher.lookingAt()) {
                System.out.println("Encontrado: " + matcher.group());
            }
            // contando grupos com groupCount()
            // alem de contar os grupos, a regex precisa estar no texto alvo.
            regex = "(\\d{3})-(\\d{3})-(\\d{3})"; 
            texto = "123-456-712";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(texto);
            System.out.println("Contando grupos com groupCount()");
            if             
             (matcher.matches()) {
                System.out.println("Total de grupos encontrados: " + matcher.groupCount());                
                
                for (int i = 0; i <= matcher.groupCount(); i++) {
                    System.out.println("O Grupo " + i + " tem o valor de: " + matcher.group(i));
            }
                
      }

      // start e end para obter posições das correspondências na string
        regex = "\\d{3}";
        texto = "O código é 123 e o outro é 456";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);
        System.out.println("Posições das correspondências na string");
        while(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group() + 
            " Início: " + matcher.start() + 
            " Fim: " + matcher.end());
        }

        // quote para tratar caracteres literais
        String literalRegex = Pattern.quote("1 + 1 = 2");
        String textoLiteral = "A expressão 1 + 1 = 2 é verdadeira.";

        pattern = Pattern.compile(literalRegex);
        matcher = pattern.matcher(textoLiteral);

        System.out.println("Tratando caracteres literais com quote");
        if (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
            
        }

        // 5 - expressões regulares avançadas
        // Positive lookahead (?=...) -> do que a gente sinalizou para tras 
        String regexLookAhead = "\\d+(?=\\$)"; // números seguidos de $
        texto = "Preços: 100$ 200$ $300 $400";
        pattern = Pattern.compile(regexLookAhead);
        matcher = pattern.matcher(texto);
        System.out.println(" lookahead Positivo");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }
        
        // lookbehind positivo  -> para frente que a gente sinalizou
        String regexLookBehind = "(?<=\\$)\\d+"; // números precedidos de $    
        texto = "Preços: 100$ 200$ $300 $400";
        pattern = Pattern.compile(regexLookBehind);
        matcher = pattern.matcher(texto);
        System.out.println(" lookabehind Positivo");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }


        // Lookahead negativo (?!=...) -> não seguido do que a gente sinalizou
        // p{L} -> qualquer letra de qualquer idioma => Código Unicode.
        String regexLookAheadNeg = "\\b[\\p{L}]+\\b(?!\\.)"; // Palavras (w) sem ponto final
        // \\b <- conceito de fronteira para pegar a palavra completa
        //String regexLookAheadNeg = "\\b[\\wáéíóú]+\\b(?!\\.)"; // Palavras (w) sem ponto final

        texto = "Esta é uma frase. Esta é outra frase sem ponto final";
        pattern = Pattern.compile(regexLookAheadNeg);
        matcher = pattern.matcher(texto);
        System.out.println(" lookahead Negativo");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());

        }

        // Lookbehind negativo (?<!...) -> não precedido do que a gente sinalizou
        texto = "#java #javascript #python csharp #ruby";
        String regexLookBehindNeg = "(?<!#)\\b\\w+\\b"; // hashtags que não são precedidas por 'java'
        pattern = Pattern.compile(regexLookBehindNeg);
        matcher = pattern.matcher(texto);
        System.out.println(" lookbehind Negativo");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }


    }


}

