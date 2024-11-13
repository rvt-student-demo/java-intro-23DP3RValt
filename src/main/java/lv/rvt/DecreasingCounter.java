package lv.rvt;

public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement1() {
        this.value = value - 1;
        System.out.println("value-1: " + this.value);
    }

    public void decrement2() {
        this.value = value - 1;
        System.out.println("value-1: " + this.value);
    }
}
