package lv.rvt;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

    Stars.printStars(5);
    Stars.printStars(3);
    Stars.printStars(9);

    Stars.printSquare(4);

    Stars.printRectangle(17, 3);

    Stars.printTriangle(4);

    Stars.printSpaces(3);

    Stars.printRTriangle(5);
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