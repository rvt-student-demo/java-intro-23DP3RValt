package lv.rvt;

public class PaymentCard {
    private double balance;
    

    public PaymentCard(double Balance) {
        this.balance = Balance;
    }
    
    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        if (amount < this.balance){
            this.balance = this.balance - amount;
            return true;
        } else {
            return false;
        }

        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        
    }
}
