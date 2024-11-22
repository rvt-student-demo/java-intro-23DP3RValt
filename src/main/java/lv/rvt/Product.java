package lv.rvt;

public class Product {
    private double price;
    private int quantity;
    private String name; 

    public Product(String initialName, int initialQuantity, double initialPrice) {
        this.name = initialName;
        this.quantity = initialQuantity;
        this.price = initialPrice;
    }

    public Product(String initialName, int initialQuantity) {
        this.name = initialName;
        this.quantity = initialQuantity;
    }

    public Product(String initialName) {
        this.name = initialName;
    }

    public String toString() {
        return this.name + ", price " + this.price + ", " + this.quantity + " pcs";
    }
}
