package helloworld;

public class Ak
{
    public static void main(String[] args) {
   int n=5;
   for(int i=0;i<n;i++)
   {
       for(int j=i;j<n-1;j++)
       {
           System.out.print("  ");
       }
       int temp=i+1;
       for(int j=n-i;j<=n;j++)
       {
           System.out.print(temp+" ");
           temp++;
       }
       temp=((i+1)*2)-2;
       int z=i;
       while(z>0)
       {System.out.print(temp+" ");
       temp--;
           z--;
       }
       System.out.println("");
   }
}
}
