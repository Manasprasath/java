import java.util.*;
class m4
{
	public static void main(String[] args) 
	{
		int arr[]={16, 18, 27, 16, 23,21, 19};
		int len=arr.length;
		int comp=0;
		for (int i=0;i<len;i++ )
		{
		  int c=0;
          for (int j=1;j<=arr[i] ;j++ )
          {
           if(arr[i]%j==0){
                  c++;
               }
          }if (c>2)
          {
           comp++;
          }
		}System.out.println("comp="+comp);
	}
}
