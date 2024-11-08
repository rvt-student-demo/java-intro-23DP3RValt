package lv.rvt;

// import java.util.ArrayList;
// import java.util.Scanner;
// import java.util.Random;

public class App {
    public static void main( String[] args ) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement1();
        counter.printValue();

        counter.decrement1();
        counter.printValue();

        counter.printValue();

        counter.decrement2();
        counter.printValue();

        counter.decrement2();
        counter.printValue();

        counter.decrement2();
        counter.printValue();
    }
}