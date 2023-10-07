package Practice;

import java.util.Scanner;

public class Productofnumber {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter any range of the values i,e ir & fr" );
	    int ir = s.nextInt();
	    int fr = s.nextInt();
	    int a=1;
	    
	    for( int i=ir ; i<=fr ; i++ ) {
	    	a=i*a;
	    }
	    System.out.println(a);
	    }
	   
	    }
	   
