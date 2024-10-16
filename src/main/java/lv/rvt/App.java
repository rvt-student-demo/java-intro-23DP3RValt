package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> skaitlis = new ArrayList<>();
        
        int sum = 0;
        while (true) {
            int ievade = Integer.valueOf(scanner.nextLine());

            if(ievade != 0) {
                skaitlis.add(ievade);
                sum = sum + ievade;
            }
            else {
                break;
            }
        }

        System.err.println(skaitlis);
        System.err.println(sum);
    }


public static void divisibleByThree(int start, int end) {
    while (start <= end) {
        if(start % 3 == 0) {
            System.out.println(start);
        }
    start ++;
    }
}
}