package taskTwo;

import java.util.Scanner;

public class StringComparison {
    String stringFirst ;
    String stringSecond;

    public void requestParameters(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        stringFirst = scan.nextLine();

        System.out.println("Введите вторую строку: ");
        stringSecond =scan.nextLine();
    }

    public void executionComparison(){
        System.out.println(stringFirst.equalsIgnoreCase(stringSecond) ? "Строки идентичны" : "Строки неидентичны");

    }
}