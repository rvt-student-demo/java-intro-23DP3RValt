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
        if (this.balance > 2.60) {
            this.balance = 1.0 * this.balance - 2.60;
        } else {
            System.out.println("Not enough money!");
        }
        
    }

    public void eatHeartly() {
        if (this.balance > 4.60) {
            this.balance = 1.0 * this.balance - 4.60;
        } else {
            System.out.println("Not enough money!");
        }
        
    }
    public void addMoney(double amount) {
        if (amount + this.balance > 150) {
            this.balance = 150;
        } else if (amount < 0) {
            this.balance = this.balance;
        } else {
            this.balance = amount + this.balance;
        }
    }
}
