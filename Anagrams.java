import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();
        int caseNum = 0;
        for (int i = 0; i < numCases; i++) {
            caseNum++;
            input.next();
            String s1 = input.next();
            String s2 = input.next();
            System.out.println("Case #" + caseNum + ": " + numAnagrams(s1, s2));
        }
    }
    
    private static int numAnagrams(String s1, String s2) {
        int num = 0;
        for (int subLength = 1; subLength <= s1.length(); subLength++) {
            for (int i = 0; i <= s1.length() - subLength; i++) {
                boolean same = false;
                char[] a1 = (s1.substring(i, i + subLength)).toCharArray();
                Arrays.sort(a1);
                String sorted1 = new String(a1);
                for (int j = 0; j <= s2.length() - subLength; j++) {
                    char[] a2 = (s2.substring(j, j + subLength)).toCharArray();
                    Arrays.sort(a2);
                    String sorted2 = new String(a2);
                    if (sorted2.equals(sorted1)) {
                        same = true;
                    }
                }
                if (same) {
                    num++;
                }
            }
        }
        
        return num;
    }
}
