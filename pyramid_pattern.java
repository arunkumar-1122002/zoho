/*
input:
n=5
output:
        1 
      2 3 2 
    3 4 5 4 3 
  4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5
*/

public class pyramid_pattern {

    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <= n; i++)
        {
            for (int k = 1; k <=n-i; k++) {
                System.out.print("  ");   
            }
            int l=i-1;
            for (int j = 1; j <=(i+i)-1; j++) {
                if(j<=i)
                    System.out.print((++l)+" ");
                else
                    System.out.print((--l)+" ");
            }
            System.out.println();
        }
        
    }
    
}

