import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sales;
    SalesManager salesManager = new SalesManager(sales =
            new int[]{ 1_000_000_000, 100, 20000, 0 });
        System.out.println(Arrays.toString(sales));
        System.out.printf("Max value: %d\n", salesManager.max());
        System.out.printf("Average value: %d\n", salesManager.averageSale());
    }
}
