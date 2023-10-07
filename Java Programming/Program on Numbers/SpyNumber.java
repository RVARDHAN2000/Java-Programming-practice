package Practice;

import java.util.Scanner;

public class SpyNumber {
	// a number where the sum of its digits equals the product of its digits. 
	//For example, 1124 is a spy number,
	//the sum of its digits is 1+1+2+4=8 and the product of its digits is 1*1*2*4=8.

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any value ");
         int num=s.nextInt(); 
         int sum=0;
         int temp=num;
         int prod=1;
      while(num!=0)
         {
        	int dig=num%10;
        	 sum=sum+dig;
        	 num=num/10;
        	 
         }
         for(int i=num;i<=temp;i++)
         {
        	int dig=temp%10;
        	 prod=prod*dig;
        	 temp=temp/10;
        	 
         }     System.out.println(sum);
         System.out.println(prod);
         if(sum==prod)
        	 System.out.println("is a Spy number");
	}

	}

