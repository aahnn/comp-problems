import java.util.*;

public class Difference 
{
    public static void main(String[] args)
    {
        Scanner rdr = new Scanner(System.in);
        
        while (rdr.hasNextLine())
        {
            int[] nums = new int[4];
            int sum = 0;
            for (int i = 0; i < nums.length; i++)
            {
                nums[i] = rdr.nextInt();
                sum += nums[i];
            }
        
            if (sum == 0)
            {
                return;
            }
            
            int count = 0;
            while (!sameNums(nums))
            {
                int a = nums[0];
                nums[0] = Math.abs(a - nums[1]);
                nums[1] = Math.abs(nums[1] - nums[2]);
                nums[2] = Math.abs(nums[2] - nums[3]);
                nums[3] = Math.abs(nums[3] - a);
                count++;
            }
    
            System.out.println(count);
        }
    }
    
    private static boolean sameNums(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] != arr[i + 1])
            {
                return false;
            }
        }
        return true;
    }
}
