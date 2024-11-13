package lv.rvt;

public class Statistics {
    private int count;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int newNumber) {
        this.count++;
    }

    public int getCount() {
        return count;
    }
}
