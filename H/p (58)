import java.util.Scanner;

public class Denomination
{
    public static void main(String args[])
    {
        int amt, r2000=0, r500=0, r200=0, r100=0, count=0; 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter The Amount in Rupees : \n\n");
        amt = sc.nextInt();
 
    while(amt >= 2000) 
 { 
  r2000 = amt / 2000 ; 
  amt = amt % 2000;
  System.out.print("\nTotal Number Of 2000 Rupees Notes :"+ r2000) ;
  break ; 
 }
 while(amt >= 500) 
 { 
  r500 = amt / 500 ; 
  amt = amt % 500;
  System.out.print("\nTotal Number Of 500 Rupees Notes : "+ r500) ;
  break ; 
 } 
 while(amt >= 200) 
 { 
  r200 = amt / 200 ; 
  amt = amt % 200;
  System.out.print("\nTotal Number Of 200 Rupees Notes : "+ r200) ;
  break ; 
 } 
 while(amt >= 100) 
 { 
  r100 = amt / 100 ;
  amt = amt % 100; 
  System.out.print("\nTotal Number Of 100 Rupees Notes : "+ r100) ; 
  break ; 
 }  

 count = r2000 + r500 + r200 + r100;   
 System.out.print("\n\nTotal Number Of Notes Require : \n\n"+ count) ; 
 }
}
