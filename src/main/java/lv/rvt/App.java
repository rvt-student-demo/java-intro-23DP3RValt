package lv.rvt;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    
    int start = Integer.valueOf(scanner.nextLine());
    int end = Integer.valueOf(scanner.nextLine());

    divisibleByThree(start, end);
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