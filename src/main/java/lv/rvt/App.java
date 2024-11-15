package lv.rvt;

// import java.util.ArrayList;
// import java.util.Scanner;
// import java.util.Random;

public class App {
    public static void main( String[] args ) {
        PaymentCard card = new PaymentCard(10);
        // Scanner scanner = new Scanner(System.in);

        System.out.println(card);

        card.addMoney(15);
        System.out.println(card);

        card.addMoney(10);
        System.out.println(card);

        card.addMoney(200);
        System.out.println(card);

        
    }
}