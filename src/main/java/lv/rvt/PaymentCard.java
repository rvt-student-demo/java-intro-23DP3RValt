package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        System.out.println(this.balance);
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        this.balance = 1.0 * this.balance - 2.60;
    }

    public void eatHeartly() {
        this.balance = 1.0 * this.balance - 4.60;
    }
}
