package homework6.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите e-mail: ");
        Scanner scan = new Scanner(System.in);
        Pattern p1 = Pattern.compile("(\\w{2,})@(\\w+\\.)(\\w+)(\\.\\w+)?");
        Matcher m1 = p1.matcher(scan.nextLine());

        System.out.println("Введите пароль:");
        Scanner scan1 = new Scanner(System.in);
        Pattern p2 = Pattern.compile("\\w{4,}");
        Matcher m2 = p2.matcher(scan1.nextLine());

        if (m1.find() && m2.find()) {
            System.out.println("e-mail: " + m1.group());
            System.out.println("password: " + m2.group());
        } else {
            System.out.println("Некорректно введен пароль или e-mail");
        }
    }
}
