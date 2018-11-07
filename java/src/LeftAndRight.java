import java.util.*;

public class LeftAndRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int houses = input.nextInt();
        int numDirs = houses - 1;
        String dirs = input.next();
        
        boolean[] visits = new boolean[houses];
        int numVisits = 1;
    
        int currHouse = 0;
        if (dirs.charAt(0) == 'L') {
            while (currHouse < dirs.length() && dirs.charAt(currHouse) == 'L') {
                currHouse++;
            }
        }
        System.out.println(currHouse + 1);
        visits[currHouse]  = true;
        
        int currDir = 0;
        while (currDir < dirs.length()) {
            int move = 0;
            if (dirs.charAt(currDir) == 'R') {
                if (currDir + 1 < dirs.length() && dirs.charAt(currDir + 1) == 'R'
                        || currDir == dirs.length() - 1) {
                    while (visits[currHouse + move]) {
                        move++;
                    }
                }
                int probe = currDir;
                while (probe + 1 < dirs.length() && dirs.charAt(probe + 1) == 'L') {
                    while(visits[currHouse + move]) {
                        move++;
                    }
                    move++;
                    probe++;
                }
            }
            else {
                while (visits[currHouse + move]) {
                    move--;
                }
            }
            currDir++;
            currHouse += move;
            visits[currHouse] = true;
            System.out.println(currHouse  + 1);
        }
        
        
    }    
}
