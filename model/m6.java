import java.util.*;
class m6
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("enter rows");
		int rows=in.nextInt();
		for (int i=1;i<=rows;i++)
		{
			for (int j=rows;j>=i;j--)
			{
				System.out.print(" ");
			}
			for (int k=1;k<rows ;k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
