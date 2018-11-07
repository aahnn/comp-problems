import java.util.*;

public class Systems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numAns = input.nextInt();
        
        Set<Integer> answers = new HashSet<>();
        int numPairs = 0;
        
        for (int i = 0; i < numAns; i++) {
            int answer = input.nextInt();
            if (answers.contains(12345 - answer)) {
                numPairs++;
            }
            else {
                answers.add(answer);
            }
        }
    
        System.out.println(numPairs);
        
        
    }    
}
