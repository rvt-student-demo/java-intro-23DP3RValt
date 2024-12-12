package lv.rvt;

// import java.util.ArrayList;
import java.util.Scanner;
// import java.util.Random;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        
        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
    }
}