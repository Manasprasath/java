import java.util.Scanner;
import java.util.Arrays;
class m3
{
 public static void main(String args[])
 {
          Scanner in=new Scanner(System.in);
          String n=in.nextLine();
          int len=n.length();
          char arr[]=new char[len];
          String A;
          for(int i=0;i<len;i++)
          {
          arr[i]=n.charAt(i);
          }
           Arrays.sort(arr);
           for(int i=len-1;i>=0;i--)
          {
           System.out.print(arr[i]+" ");

		}
	}
}
