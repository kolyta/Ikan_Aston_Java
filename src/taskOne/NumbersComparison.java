package taskOne;

import java.util.Scanner;

public class NumbersComparison {
    int num1, num2;

    public void requestParameters(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        num1 = checkNumber(scan);

        System.out.println("Введите второе целое число: ");
        num2 = checkNumber(scan);
    }

    private int checkNumber(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Введен некорректный символ. Пожалуйста, введите число: ");

            scan.next();
        }
        return scan.nextInt();
    }

    public void executionComparison(){
        System.out.println("\nРезультаты сравнения:");
        if (num1 < num2) {
            System.out.printf("%d < %d", num1, num2);
        } else if (num1 > num2) {
            System.out.printf("%d > %d", num1, num2);
        } else {
            System.out.printf("%d = %d", num1, num2);
        }
    }

    public void executionArithmeticOperations(){
        System.out.println("\nРезультаты вычислений:");
        System.out.printf("%d + %d = %d \n", num1, num2, num1+num2);
        System.out.printf("%d - %d = %d \n", num1, num2, num1-num2);
        System.out.printf("%d * %d = %d \n", num1, num2, num1*num2);
        if(num2 != 0)
            System.out.printf("%d / %d = %.2f \n", num1, num2, (double)num1/num2);
        else{
            System.out.println("Операция деления невозможна");
        }
    }
}
