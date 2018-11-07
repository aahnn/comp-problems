import java.util.*;

public class Polling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numVotes = input.nextInt();
        
        Map<String, Integer> candidateMap = new HashMap<>();
        for (int i = 0; i < numVotes; i++) {
            String name = input.next();
            if (candidateMap.containsKey(name)) {
                candidateMap.put(name, candidateMap.get(name) + 1);
            }
            else {
                candidateMap.put(name, 1);
            }
        }
        
        int max = -1;
        for (String key : candidateMap.keySet()) {
            if (candidateMap.get(key) > max) {
                max = candidateMap.get(key);
            }
        }
        
        List<String> names = new ArrayList<>();
        for (String key : candidateMap.keySet()) {
            if (candidateMap.get(key) == max) {
                names.add(key);
            }
        }
        
        Collections.sort(names);
        for (String s : names) {
            System.out.println(s);
        }
        
    }    
}
