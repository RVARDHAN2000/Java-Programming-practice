package Practice;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[]args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any value");
		int num =s.nextInt();
		int temp = num;
		
		
		int sum=0;
		while (num!=0) {
			int dig=num%10;
			int f=1; 
			for(int i=1;i<=dig;i++) {
				f=f*i;}
				sum=sum+f;
			
			num=num/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is a strong number ");
		}
		else
			System.out.println(temp+" is not a strong number");
		}
		
	}
	


