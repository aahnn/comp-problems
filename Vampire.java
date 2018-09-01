import java.util.*;

public class Vampire
{
    public static void main(String[] args)
    {
        Scanner rdr = new Scanner(System.in);
        while (rdr.hasNext())
        {
            int num = rdr.nextInt();
            if (num == 0)
            {
                return;
            }
            int vamp = findVamp(num);
            System.out.println(vamp);
        }
    }
    
    private static int findVamp(int num)
    {
        for (int i = num; i <= 10000000; i++)
        {
            for (int l = 1; l <= Math.sqrt(i); l++)
            {
                if (i % l == 0)
                {
                    int r = i / l;
                    if (numDigits(l) + numDigits(r) == numDigits(i)
                       && sameDigits(l, r, i))
                    {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    
    private static int numDigits(int num)
    {
        return (int)(Math.log10(num)) + 1;
    }
    
    private static boolean sameDigits(int l, int r, int num)
    {
        String s1 = "" + l + r;
        String s2 = "" + num;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : c1)
        {
            if (map.containsKey(ch))
            {
                map.put(ch, map.get(ch) + 1);
            }
            else
            {
                map.put(ch, 1);
            }
        }
        
        for (char ch : c2)
        {
            if (map.containsKey(ch))
            {
                if (map.get(ch) == 0)
                {
                    return false;
                }
                else
                {
                    map.put(ch, map.get(ch) - 1);
                }
            }
            else
            {
                return false;
            }
        }
        
        return true;
    }
}
