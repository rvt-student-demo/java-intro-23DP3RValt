package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;
// import java.util.Random;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in)
        ArrayList<Books> books = new ArrayList<>();

        Books book1 = new Books("To Kill a Mockingbird", 281, 1960);
        Books book2 = new Books("A Brief Hstory of Time", 256, 1988);
        Books book3 = new Books("Beautiful Code", 593, 2007);
        Books book4 = new Books("Teh Name of the Wind", 662, 2007);

        while (true) {
            System.out.println("Title: ");
            String title = String.valueOf(scanner.nextLine());

            if (title.isEmpty()) {
                break;
            }
        }
    }
}