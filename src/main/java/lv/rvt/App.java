package lv.rvt;

// import java.util.ArrayList;
import java.util.Scanner;
// import java.util.Random;

public class App {
    public static void main( String[] args ) {
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int newNumber = Integer.valueOf(scanner.nextLine());

            if (newNumber == -1) {
                break;
            }

            statistics.addNumber(newNumber);
        }

        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}