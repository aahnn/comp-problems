import java.util.*;

public class Oddities
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        
        for (int i = 0; i < amount; i++) {
            int curr = input.nextInt();
            String output = "" + curr + (Math.abs(curr) % 2 == 1 ? " is odd" :
                " is " +
                                                                     "even");
            System.out.println(output);
        }
    }
}
