import java.util.*;

public class Cornfield
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = input.nextInt();
        int num = input.nextInt();
        
        for (int i = 0; i < num; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
        }
        
    }
    
    private static boolean isInside(int n, int d, int x, int y) {
        if (x < d) {
            return (y >= d - x && y <= d + x);
        }
        else if (x >= n - 1) {
            return (y >= x - d && y <= 2 * n - d - x);
        }
        else {
            return (y >= )
        }
    }
}
