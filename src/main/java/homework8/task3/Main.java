package homework8.task3;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        Class<?> cl = main.getClass();
        try {
            Method method = cl.getDeclaredMethod("mathSum", int.class, int.class);
            MathAnno1 an = method.getAnnotation(MathAnno1.class);
            MathAnno2[] an2 = an.value();

            main.mathSum(an2[0].num1(),an2[1].num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
@MathAnno2(num1 = 10)
@MathAnno2(num2 = 5)
    public void mathSum (int num1, int num2){
        System.out.println(num1+num2);
    }
}
