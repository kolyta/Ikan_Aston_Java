package taskTree;

public class EvenNumbers {

    public static final int[] ARRAY_NUMBERS = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void getEvenNumbersList(int[] mass1) {
        int i=0;
        String rez ="";
        while(mass1.length>i) {
            if(mass1[i]%2 == 0)
                rez +=mass1[i] + ", ";
            i++;
        }
        System.out.println("Список четных чисел: " + rez);;
    }
}

