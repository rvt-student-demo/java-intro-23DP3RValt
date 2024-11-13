package lv.rvt;

// import java.util.ArrayList;
import java.util.Scanner;
// import java.util.Random;

public class App {
    public static void main( String[] args ) {
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0; 

        while (true) {
            int newNumber = Integer.valueOf(scanner.nextLine());

            if (newNumber == -1) {
                break;
            }

            if (newNumber % 2 == 0) {
                sumEven += newNumber;
            }
            else {
                sumOdd += newNumber;
            }
        }

        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}