package Practice;

import java.util.Scanner;

public class FibonacceSeries {
	//The Fibonacci series is an infinite series, 
	//starting from '0' and '1', in which every number in the series 
	//is the sum of two numbers preceding it in the series.
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any first value ");
         int n1=s.nextInt(); 
         System.out.println("Enter any second value ");
         int n2=s.nextInt();
         int n=10;
         System.out.print("Fibonaccie series is "+n1+" "+n2+" ");
         for(int i=0;i<=n;i++)
         {
        	int n3=n1+n2;
        	 System.out.print(n3+" ");
               
               n1=n2;
	          n2=n3;
	
         }
	
	}

}
