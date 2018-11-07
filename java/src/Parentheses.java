import java.util.*;

public class Parentheses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pars = input.next();
        
        if (isBalanced(pars)) {
            System.out.println("Balanced");
        }
        else {
            System.out.println("Unbalanced");
        }
        
    }
    
    private static boolean isBalanced(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            }
            else {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}
