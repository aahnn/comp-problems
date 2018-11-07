import java.util.*;

public class Elections {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        List<Integer> votes = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            votes.add(input.nextInt());
        }
        
        int max = Collections.max(votes);
        
        int sum = 0;
        for (int i : votes) {
            sum += i;
        }
        
        int k = max;
        while (k * n - sum <= sum) {
            k++;
        }
    
        System.out.println(k);
        
    }    
}
