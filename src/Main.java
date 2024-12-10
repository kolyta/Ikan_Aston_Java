import taskOne.NumbersComparison;
import taskTree.EvenNumbers;
import taskTwo.StringComparison;

public class Main {

    public static void main(String[] args) {
        System.out.println("------ Task 1 ----- ");
        NumbersComparison taskFirst =  new NumbersComparison();
        taskFirst.requestParameters();
        taskFirst.executionComparison();
        taskFirst.executionArithmeticOperations();

        System.out.println("\n------ Task 2 ----- ");
        StringComparison taskSecond = new StringComparison();
        taskSecond.requestParameters();
        taskSecond.executionComparison ();

        System.out.println("\n------ Task 3 ----- ");
        EvenNumbers taskThird = new EvenNumbers();
        taskThird.getEvenNumbersList(new EvenNumbers().ARRAY_NUMBERS);
    }
}