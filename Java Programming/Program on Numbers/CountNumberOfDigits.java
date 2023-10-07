package Practice;

import java.util.Scanner;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any value ");
         int num=s.nextInt(); 
         int temp=num;
         int count=0;
     while(num>0)
         {
        	 count++;
        	 num=num/10;
        	
         }System.out.println("No of digits in number "+temp+" is "+count);
	}

}
