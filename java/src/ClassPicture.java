import java.util.*;

public class ClassPicture {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                names[i] = in.next();
            }
            Arrays.sort(names);

            int m = in.nextInt();
            Map<String, Set<String>> pairs = new HashMap<>();
            for (int i = 0; i < m; i++) {
                String name1 = in.next();
                String name2 = in.next();
                if (!pairs.containsKey(name1)) {
                    pairs.put(name1, new HashSet<>());
                }
                pairs.get(name1).add(name2);
                if (!pairs.containsKey(name2)) {
                    pairs.put(name2, new HashSet<>());
                }
                pairs.get(name2).add(name1);
            }

            if (!permute(names, pairs, new ArrayList<>(), new boolean[n])) {
                System.out.println("You all need therapy.");
            }

        }
    }

    private static boolean permute(String[] names, Map<String, Set<String>> pairs, List<String> lineup, boolean[] visited) {
        if (lineup.size() == names.length) {
            StringBuilder out = new StringBuilder();
            for (String name : lineup) {
                out.append(name);
                out.append(" ");
            }
            System.out.println(out.toString());
            return true;
        }

        for (int i = 0; i < names.length; i++) {
            if (!visited[i] && !(lineup.size() > 0 && pairs.containsKey(names[i])
                                && pairs.get(names[i]).contains(lineup.get(lineup.size() - 1)))) {
                lineup.add(names[i]);
                visited[i] = true;
                if (permute(names, pairs, lineup, visited)) {
                    return true;
                }
                visited[i] = false;
                lineup.remove(lineup.size() - 1);
            }
        }

        return false;
    }
}
