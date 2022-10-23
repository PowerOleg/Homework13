import java.util.Arrays;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = Integer.MAX_VALUE;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long averageSale() {
        int offset = 0;
        long max = max();
        long min = min();
        for (int i = 0; i < sales.length; i++) {
        if (sales[i] == min) {
            sales[i] = 0;
            offset++;
            } else if (sales[i] == max) {
            sales[i] = 0;
            offset++;
        } else {
            sales[i - offset] = sales[i];
        }
        }
        long[] newSales = Arrays.copyOf(sales, (sales.length - offset));
        int average = 0;
        for (long sale : newSales) {
            average += sale;
        }
        return average / newSales.length;
    }
}