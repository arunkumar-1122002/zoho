/*

INPUT:A1B6
OUTPUT:ABBBBBB

INPUT:B3C2Z10
OUTPUT:BBBCCZZZZZZZZZZ

NUMBER RANGE FROM 1 TO 99
*/
public class Printcharbycount{
  public static void main(String[] args){
    String s="B3C6D11";
    char cursor=s.charAt(0);
    int i=0,j,num=0,next;
    do{
      if(num ==0)
      {
        if(i>s.length()-1)
        break;
        cursor=s.charAt(i);
        j=i+1;
        next=i+2;
        if(s.charAt(next)<58 && s.charAt(next)>47){
          num=s.charAt(next)-48;
          num =((s.charAt(j)-48)*10)+num;
          i+=3;
        }
        else{
          num=s.charAt(j)-48;
          i+=2;
      }
    }
    System.out.print(cursor);
    num--;
    
  }while(true);
}
}
