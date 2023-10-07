package Practice;

import java.util.Scanner;

public class primeNumber {
	//Prime numbers are natural numbers that are divisible by only 1 and the number itself.
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any value ");
         int num=s.nextInt(); 
         boolean isprime=true;
         for(int i=2; i<=num/2; i++) {
        	 if(num%i==0) {
        		 isprime=false;
        	 }
         }
		if(isprime==true) {
			System.out.println("The given number is prime number");
		}
		else
			System.out.println("The given number is not a prime number");
	}
}
