
/*

Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the
following conditions
1. 5 if a perfect square
2. 4 if multiple of 4 and divisible by 6
3. 3 if even number
And sort the numbers based on the weight and print it as follows
<10,its_weight>,<36,its weight><89,its weight>
Should display the numbers based on increasing order

*/

import java.util.*;
public class Weight_calculation
{
    public static void main(String[] args) {
        int[] arr={10,36,54,89,12};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i], weight(arr[i]));
        }
        System.out.println(map);
       
        for(int i=0;i<arr.length;i++)
        { int max=0;
        int max_ind=0;
            for(int j=0;j<arr.length;j++)
            {
                if(map.get(arr[j])>=max)
                {
                    max_ind=arr[j];
                    max=map.get(arr[j]);
                }
            }
            System.out.println(max_ind+" : "+max);
            map.put(max_ind,-1);
        }
       
    }
    public static int weight(int n)
    {
        int result=0;
        int temp=1;
        if(n==0)
            return 0;
        while(temp*temp<=n)
        {
            if(temp*temp==n)
            {
                result+=5;
            }
            temp++;
        }
        temp=n/4;
        if(temp*4==n)
        {
            temp=n/6;
            if(temp*6==n)
            {
                result+=4;
            }
        }
        if(n%2==0)
        {
            result+=3;
        }
        
        return result;
    }
    
}
