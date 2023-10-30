/*
INPUT:AAAABBCDDDE
OUTPUT:A4B2CD3E
*/
package helloworld;
public class Zoho
{
    public static void main(String[] args) {
        String s="AAAABBCDDDE";
        int count=0;
        for(int i=0;i<s.length();i+=count)
        {
            System.out.print(s.charAt(i));
            count=0;
        for(int j=i;j<s.length();j++)
        {
            if(s.charAt(i)==s.charAt(j))
            count++;
            
        }
        if(count!=1)
        {
            System.out.print(count);
        }
        }
    }
}
