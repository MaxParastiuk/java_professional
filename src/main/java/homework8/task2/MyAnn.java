package homework8.task2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface MyAnn {
    String first() default "Hello";

    String second() default "World";
}
