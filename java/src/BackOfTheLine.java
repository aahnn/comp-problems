import java.util.*;

public class BackOfTheLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        String[] strings = new String[size];
        
        for (int i = 0; i < size; i++) {
            String curr = input.next();
            String reversed = new StringBuilder(curr).reverse().toString();
            strings[i] = curr.compareTo(reversed) > 0 ? curr : reversed;
        }
        
        Arrays.sort(strings);
        
        StringBuilder cat = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            cat.append(strings[i]);
        }
        cat.setCharAt(0, Character.toUpperCase(cat.charAt(0)));
        String strCat = cat.toString();
        
        String ans = strCat.compareTo("Acorn") > 0 ? strCat : "Acorn";
        System.out.println(ans);
    }
}
