/*

Input:
5
Output:
1  3  6  10  15  
2  5  9  14  19  
4  8  13  18  22  
7  12  17  21  24  
11  16  20  23  25 

Hint to solve this pattern:
here difference in matrix is
2 3 4 5
3 4 5 5
4 5 5 4
5 5 4 3
5 4 3 2
in this matrix top left side triangle have increment in difference
2 3 4 5
3 4 5
4 5
5
bottom right have decremnt in difference
      5
    5 4
  5 4 3
5 4 3 2
merge these 2 triangle you can find the answer
*/
public class Pattern {

    public static void main(String[] args) {
        int n=5,start=1;
        for(int i=0;i<n;i++)
        {
            int helper;
            start+=i;
            helper=start;
            System.out.print(helper+"  ");
            for(int j=i+2;j<=n;j++)//used for print increment in difference values
            {
                helper+=j;
                System.out.print(helper+"  ");
            }
            for (int k=n;k>n-i; k--)//used for print decrement in difference values
            {  
                helper+=k;
                System.out.print(helper+"  ");
            }
            System.out.println();
        }   
    }    
}
