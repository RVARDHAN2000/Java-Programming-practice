package Practice;

import java.util.Scanner;

public class OddNumbers {
	

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter any range of the values i,e ir & fr" );
	    int ir = s.nextInt();
	    int fr = s.nextInt();
	    
	    for( int i=ir ; i<=fr ; i++ ) {
	    if(i%2==1)
	    {
	    	System.out.print(i+" ");
	    }
	    
	    }
	   
	    }
	   
	    }



