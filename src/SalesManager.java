import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = Integer.MAX_VALUE;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int averageSale() {
        int offset = 0;
        int max = max();
        int min = min();
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
        int[] newSales = Arrays.copyOf(sales, (sales.length - offset));
        int average = 0;
        for (int sale : newSales) {
            average += sale;
        }
        return average / newSales.length;
    }
}