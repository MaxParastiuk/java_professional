package homework8.task3;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(MathAnno1.class)
public @interface MathAnno2 {
    int num1() default 10;

    int num2() default 5;
}
