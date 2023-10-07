package Practice;

import java.util.Scanner;

public class PalendromeNumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any value ");
         int n=s.nextInt();
         int temp=n;
        int r=0;
         while(n>0)
         {
        	int a = n%10 ;
        	 r = r*10+a;
        	n=n/10;
        	
         }
        if (r==temp) {
        	System.out.println(temp+" is a palendrome number");
}
        else
        	System.out.println(temp+" is not a palendrome number");
}}


