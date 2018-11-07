import java.util.*;

public class PerfectShuffle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCards = input.nextInt();
        
        int halfway = numCards / 2;
        String[] right = new String[halfway];
        if (numCards % 2 == 1) {
            halfway++;
        }
        String[] left = new String[halfway];
        
        for (int i = 0; i < numCards; i++) {
            
            
            if (i < halfway) {
                left[i] = input.next();
            }
            else {
                right[i - halfway] = input.next();
            }
        }
    
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < halfway; i++) {
            output.append(left[i]);
            output.append("\n");
            if (i != halfway - 1 || right.length == halfway) {
                output.append(right[i]);
            }
            output.append("\n");
        }
    
        System.out.println(output.toString());
    }    
}
