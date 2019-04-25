import java.util.*;

public class ColoringGraphs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
            String[] line = in.nextLine().split(" ");
            for (String s : line) {
                graph.get(i).add(Integer.parseInt(s));
            }
        }
        int[] colors = new int[n];
        Arrays.fill(colors, -1);
        for (int numColors = 2; numColors < n; numColors++) {
            if (backtrack(graph, colors, numColors, 0)) {
                System.out.println(numColors);
                return;
            }
        }

        System.out.println(n);
    }

    private static boolean backtrack(List<List<Integer>> graph, int[] colors, int numColors, int currNode) {
        if (currNode >= graph.size()) {
            return true;
        }

        for (int color = 0; color < numColors; color++) {
            List<Integer> neighbors = graph.get(currNode);
            boolean valid = true;
            for (int neighbor : neighbors) {
                if (color == colors[neighbor]) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                colors[currNode] = color;
                if (backtrack(graph, colors, numColors, currNode + 1)) {
                    return true;
                }
                colors[currNode] = -1;
            }
        }

        return false;
    }
}
