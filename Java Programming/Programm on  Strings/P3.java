package Pwork;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter any value");
	    int  n = s.nextInt();
	 int temp=n;
	    int r=0;
	    long p=1;
	while(n!=0) {     
	    int a=n%10;
	    
	   	r=r*10+a;
	    n=n/10;
	  
	}
	System.out.println(r);
for (int i=0 ; i<r; i++) {
	
    p = p*temp;
	
	}
System.out.println(p);

}}
