package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> vardi = new ArrayList<>();
        ArrayList<Integer> gadi = new ArrayList<>();

        String vards = " ";
        
        while (vards != "") {
            // String minVards = vardi[0];
            System.out.println("Ievadi vārdu: ");
            vards = scanner.nextLine();
            vardi.add(vards);

            int gads = Integer.valueOf(scanner.nextLine());
            gadi.add(gads);
        }
        System.out.println(vardi);
        System.out.println(gadi);

        // while (true) {
        //     vards = String.valueOf(scanner.nextLine());
        //     gads = Integer.valueOf(scanner.nextLine());

        //     String mvards = vards;

        //     for (vards.length() < mvards.length(); mvards = vards) {

        //     }
        // }
        
    }


public static void divisibleByThree(int start, int end) {
    while (start <= end) {
        if(start % 3 == 0) {
            System.out.println(start);
        }
    start ++;
    }
}
public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
    for (int number: numbers) {
        printNumbersInRange(numbers, 0, 5);
    }
}
public static void bubbleSort(int a[]) {
    int temp;
    boolean swapped;

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length - 1; i++) {
            if (a[j] > a[j + 1]){
                temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
            }
        }
    }
}
}