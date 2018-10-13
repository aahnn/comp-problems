import java.util.*;

public class Burger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOrders = input.nextInt();
        int[] orders = new int[numOrders];
        
        for (int i = 0; i < numOrders; i++) {
            orders[i] = input.nextInt();
        }
        
        Arrays.sort(orders);
        
        int sum = 0;
        int total = 0;
        for (int i = 0; i < numOrders; i++) {
            sum += orders[i];
            total += sum;
        }
        
        double ans = ((double)total) / numOrders;
        System.out.printf("%.3f%n", ans);
    }    
}
