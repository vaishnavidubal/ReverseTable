import java.util.*;
import java.lang.*;
public class ReverseTable
{
  public static void main(String[]args)
  {
         Scanner input =new Scanner(System.in);
    
          System.out.print("Enter The Starting Number :");
          int s=    input.nextInt();
          System.out.print("Enter The Ending Number :");
          int e= input.nextInt();
          System.out.print("Enter The Table Number :");
          int t= input.nextInt();
      while(s>=e)
                  System.out.println(s+" * "+t+"="+(s*t));
                 s--;
  }
}