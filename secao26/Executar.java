package secao26;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME) // em tempo de execução
@Target(ElementType.METHOD)  // pode ser aplicada a métodos
@interface Executar {
    int vezes() default 1;

    
}

