package Practice;

import java.util.Scanner;

public class StrongNumbersWithinRange {
	public static void main(String[]args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter initial range ");
		int num1 =s.nextInt();
		System.out.println("Enter final range ");
		int num2 =s.nextInt();
		int temp;
		int a;
		
		for ( a= num1; a<=num2;a++) {
		temp = a;
		
		
		int sum=0;
		
		while (a!=0) {
			int dig=a%10;
			int f=1; 
			for(int i=1;i<=dig;i++) {
				f=f*i;
				}
				sum=sum+f;
			  a=a/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is a strong number ");
		}
		
		}
}
}
