import java.util.*;

public class VictoryThroughSynergy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < c; i++) {
            int p1 = in.nextInt();
            int p2 = in.nextInt();
            graph.get(p1).add(p2);
            graph.get(p2).add(p1);
        }

        Player[] players = new Player[10];
        for (int i = 0; i < players.length; i++) {
            String name = in.next();
            String nation = in.next();
            String league = in.next();
            String team = in.next();
            players[i] = new Player(name, nation, league, team);
        }

        boolean ans = backtrack(players, new ArrayList<>(), new boolean[10], graph);
        System.out.println(ans ? "yes" : "no");
    }

    private static boolean backtrack(Player[] players, List<Player> formation, boolean[] visited, List<List<Integer>> graph) {
        if (formation.size() == players.length) {
            for (int i = 0; i < graph.size(); i++) {
                int numEdges = graph.get(i).size();
                int numSynergy = 0;
                for (int j : graph.get(i)) {
                    Player p1 = formation.get(i);
                    Player p2 = formation.get(j);
                    numSynergy += p1.calculateSynergy(p2);
                }
                if (numSynergy < numEdges) {
                    return false;
                }
            }
            return true;
        }

        for (int i = 0; i < players.length; i++) {
            if (!visited[i]) {
                formation.add(players[i]);
                visited[i] = true;
                if (backtrack(players, formation, visited, graph)) {
                    return true;
                }
                visited[i] = false;
                formation.remove(formation.size() - 1);
            }
        }
        return false;
    }

    private static class Player {
        String name;
        String nation;
        String league;
        String team;

        public Player(String name, String nation, String league, String team) {
            this.name = name;
            this.nation = nation;
            this.league = league;
            this.team = team;
        }

        public int calculateSynergy(Player p2) {
            if (this.nation.equals(p2.nation) && this.team.equals(p2.team)) {
                return 3;
            }
            if (this.nation.equals(p2.nation) && this.league.equals(p2.league) || this.team.equals(p2.team)) {
                return 2;
            }
            if (this.league.equals(p2.league) || this.nation.equals(p2.nation)) {
                return 1;
            }
            return 0;
        }
    }
}
