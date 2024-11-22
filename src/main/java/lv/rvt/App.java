package lv.rvt;

// import java.util.ArrayList;
import java.util.Scanner;
// import java.util.Random;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", 5);
        Product tyre = new Product("Tyre", 5, 15.5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}