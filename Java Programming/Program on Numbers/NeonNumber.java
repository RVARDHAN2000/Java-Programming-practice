package Practice;

import java.util.Scanner;

public class NeonNumber {
	//sum of digits of the square of a number is equal to the original number 
		//square of 9 is 81 i,e  ==> 8+1=9
		public static void main (String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter any value ");
			int n=s.nextInt();
			int sq=n*n;
			int sum=0;
			while(sq>0){
				int dig=sq%10;
				sum=sum+dig;
				 sq=sq/10;
			 }
			 if(sum==n){
				 
				System.out.println("yes");
			 }
			 else
				 System.out.println("no");
		}
	}

