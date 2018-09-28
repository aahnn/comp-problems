import java.util.*;

public class Goldbach
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        
        for (int i = 0; i < cases; i++)
        {
            int num = input.nextInt();
            int pairs = 0;
            StringBuilder additions = new StringBuilder();
    
            List<Integer> list = findPrimes(num);
    
            for (int j = 0; j < list.size(); j++)
            {
                for (int k = j; k < list.size(); k++)
                {
                    if (list.get(j) + list.get(k) == num)
                    {
                        additions.append(list.get(j) + "+" + list.get(k) + "\n");
                        pairs++;
                    }
                }
            }
    
            System.out.println(num + " has " + pairs + " representation(s)");
            System.out.println(additions.toString());
        }
    }
    
    private static List<Integer> findPrimes(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < num - 1; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }
    
    private static boolean isPrime(int num) {
        if (num > 2 && num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i+= 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
