package homework8.task2;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {

            Cats c = new Cats();
            Class<?> cl = c.getClass();
            Annotation[] classAnnotation = cl.getAnnotations();

            System.out.println(cl.getName());

            for (Annotation annotation : classAnnotation) {
                System.out.println("\t" + annotation);
            }
            Method[] classMethods = cl.getMethods();
            System.out.println("Method annotations:");
            for (Method method : classMethods) {
                Annotation[] methodAnnotations = method.getAnnotations();
                if (methodAnnotations.length > 0) {
                    System.out.println("\t" + method.getName() + "():");
                }
                for (Annotation annotation : methodAnnotations) {
                    System.out.println("\t" + annotation);
                }
            }}
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
