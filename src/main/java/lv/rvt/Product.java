package lv.rvt;

public class Product {
    private double price;
    private int quantity;
    private String name; 

    public Product(String initialName, int initialQuantity, double initialPrice) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
}
