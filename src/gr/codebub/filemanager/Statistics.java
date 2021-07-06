package gr.codebub.filemanager;

public class Statistics {
    private double sum;
    private double maxPrice;
    private double minPrice;
    private double average;
    private int count;


    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        return "Statistics{" +
                "sum=" + sum +
                ", maxPrice=" + maxPrice +
                ", minPrice=" + minPrice +
                ", average=" + average +
                ", count=" + count +
                '}';
    }
}
