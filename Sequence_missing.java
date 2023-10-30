package helloworld;
import java.util.*;
public class Zoho
{
    public static void main(String[] args) {
       int[] arr={44,72,58,30,65,51};
       Arrays.sort(arr);
       int f=0,s;
       for(int i=1;i<arr.length-1;i++)
       {
           f=arr[i]-arr[i-1];
                  s=arr[i+1]-arr[i];
                  if(f==s)
                      break;
       }
       for(int i=0;i<arr.length;i++)
       {
           if((arr[i]+f)!=arr[i+1])
           {
               System.out.println(arr[i]+f);
               break;
       }
       }
    }
}
