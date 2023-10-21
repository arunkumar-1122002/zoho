

package helloworld;

/**
 *
 * @author arunn
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="program";
        int n=s.length();
        int k=0;
        int m=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==n/2 && j==n/2)
                {
                    
                    System.out.print(s.charAt(m));
                    k++;
                    m--;
                }
                else if(i==j)
            {
                
                System.out.print(s.charAt(k));
            k++;
            }
                else if(i+j==n-1)
            {
                
                System.out.print(s.charAt(m));
            m--;
            }
            else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
    
}
