package Practice;

import java.util.Scanner;
//A number  whose sum of factors is equal to the original number 
// e.g:--   6 factors of 6 = 1,2,3 i,e === 1*2*3*=6


public class PerfectNumber {
                              
	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter any value ");
		int n= s.nextInt();
		int sum=0;;
		for(int i=1;i<=n/2;i++)
		{
			if (n%i==0)
		{
			sum=sum+i;
			}
		}
	System.out.println(sum);
	
	if (sum==n) {
		System.out.println(" is a Perfect Number");
		}
	
}
}
