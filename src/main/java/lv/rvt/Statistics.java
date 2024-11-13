package lv.rvt;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int newNumber) {
        this.count++;
        this.sum = this.sum + newNumber;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return 1.0 * this.sum / this.count;
    }
}
