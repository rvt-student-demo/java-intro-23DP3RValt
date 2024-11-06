package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main( String[] args ) {
        Account MattehewsAccount = new Account("Arto's account", 1000.00);
        Account MyAccount = new Account("Arto's account in Switzerland", 0.00);

        System.out.println("Initial state");
        System.out.println(MattehewsAccount);
        System.out.println(MyAccount);

        MattehewsAccount.withdraw(100);
        System.out.println("The balance of Arto's account is now: " + MattehewsAccount.balance());
        MyAccount.deposit(100);
        System.out.println("The balance of Arto's other account is now: " + MyAccount.balance());

        System.out.println("End state");
        System.out.println(MattehewsAccount);
        System.out.println(MyAccount);
    }
}