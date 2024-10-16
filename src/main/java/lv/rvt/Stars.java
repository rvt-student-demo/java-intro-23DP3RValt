package lv.rvt;

public class  Stars {
    public static void printStars(int number) {

        for (int i = 0; i < number; i++) {
            System.out.print("*");

        }
        System.out.println("");
    }
    public static void printSquare(int number) {

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
        System.out.println("");
        }
    }
    public static void printRectangle(int num1, int num2) {

        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < num1; j++) {
                System.out.print("*");
            }
        System.out.println("");
        }
    }
    public static void printTriangle(int sk) {

        for (int i = 1; i <= sk; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println("");
        }
        
    }
    public static void printSpaces(int sk) {
        for (int i = 0; i < sk; i++) {
            System.out.print(" ");
        }
        System.out.println("");
    }
    public static void printRTriangle(int sk) {

        for (int i = 0; i < sk; i++) {
            printSpaces(i);
            for (int j = 0; j < sk; j++) {
                System.out.print("*");
            }

        }

    }
    public static void printChristmasTree(int sk) {
        for (int i = 1; i <= sk; i++) {
            printSpaces(sk - 1);
            printStars(2 * i -1);
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(sk -2);
            printStars(3);
        }
    }
}
