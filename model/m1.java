import java.util.*;
class m1
{
	public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("enter rows");
        int r=input.nextInt();
		System.out.print("enter cols");
        int c=input.nextInt();
		System.out.print("enter mat1");
        int mat1[][]=new int[r][c];
        int mat2[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
           {
            mat1[i][j]=input.nextInt();
           }
          System.out.print("");
        }
		System.out.print("enter mat2");
      for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
         {
          mat2[i][j]=input.nextInt();
         }
        System.out.print("");
       }
	int sum[][]=new int[r][c];
	for(int i=0;i<r;i++)
 {
 for(int j=0;j<c;j++)
 {
 sum[i][j]=mat1[i][j] * mat2[i][j];
 System.out.print(sum[i][j]+"\t");
 }
 System.out.println();
}
	}
}

 



