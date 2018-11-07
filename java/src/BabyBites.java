import java.util.*;

public class BabyBites {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numBites = input.nextInt();
        
        int count = 1;
        boolean sense = true;
        for (int i = 0; i < numBites; i++) {
            String next = input.next();
            if (!"mumble".equals(next) && Integer.parseInt(next) != count) {
                sense = false;
            }
            count++;
        }
    
        System.out.println(sense ? "makes sense" : "something is fishy");
    }    
}
