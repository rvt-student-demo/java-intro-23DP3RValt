package lv.rvt;

// import java.util.ArrayList;
// import java.util.Scanner;
// import java.util.Random;

public class App {
    public static void main( String[] args ) {
        PaymentCard card = new PaymentCard(5);
        // Scanner scanner = new Scanner(System.in);

        System.out.println(card);

        card.eatAffordably();
        System.out.println(card);

        card.eatHeartly();
        System.out.println(card);

        
    }
}