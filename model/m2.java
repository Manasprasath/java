import java.util.*;
class m2
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("enter how many no:");
		int r=in.nextInt();
		int arr1[]=new int [r];
		int sum=0;
		for (int i=1;i<r ;i++)
		{
			 sum=(i+sum)*i;
			 arr1[i]=in.nextInt();
			System.out.print("the sum of n"+arr1[i]);
				System.out.print(sum);
			

		}
	}
}
