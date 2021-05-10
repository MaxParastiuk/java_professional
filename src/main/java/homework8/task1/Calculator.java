package homework8.task1;

public class Calculator {
    @MyAnn(num1 = 10, num2 = 5)
    public void mult(int num1, int num2){
        System.out.println(num1*num2);
    }
    @MyAnn(num1 = 10,num2 = 5)
    public void div(int num1, int num2){
        System.out.println(num1/num2);
    }
    @MyAnn(num1 = 10,num2 = 5)
    public void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    @MyAnn(num1 = 10,num2 = 5)
    public void sub(int num1, int num2){
        System.out.println(num1-num2);
    }
}
