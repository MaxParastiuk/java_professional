package homework8.task1;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Class<?> cl = Calculator.class;

        try {
            Method m1 = cl.getDeclaredMethod("add", int.class, int.class);
            Method m2 = cl.getDeclaredMethod("mult", int.class, int.class);
            Method m3 = cl.getDeclaredMethod("div", int.class, int.class);
            Method m4 = cl.getDeclaredMethod("sub", int.class, int.class);

            MyAnn myAnn1 = m1.getAnnotation(MyAnn.class);
            MyAnn myAnn2 = m2.getAnnotation(MyAnn.class);
            MyAnn myAnn3 = m3.getAnnotation(MyAnn.class);
            MyAnn myAnn4 = m4.getAnnotation(MyAnn.class);

            calc.add(myAnn1.num1(), myAnn1.num2());
            calc.mult(myAnn2.num1(), myAnn1.num2());
            calc.div(myAnn3.num1(), myAnn3.num2());
            calc.sub(myAnn4.num1(), myAnn4.num2());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
