package utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR})
public @interface Xunison {
    /**
     * @return
     */
    String name() default "" ;
    String description() default "";
    Priority priority() default Priority.LOW;
}
