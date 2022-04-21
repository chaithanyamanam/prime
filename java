import java.io.*;
import java.util.*;
public class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  int i,j, n; 
n=sc.nextInt();
 for (i= 2; i<=n; i++)
        {
            boolean Prime = true;
            for (j=2; j<=i/2; j++)
            {
                if ( i% j == 0)
                {
                    Prime = false;
                    break;
                }
            }
 
            if ( Prime == true )
                System.out.print(i);
        }
  }
}
