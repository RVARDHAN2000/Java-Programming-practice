package Practice;

import java.util.*;

public class SumOfFactors {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter any value" );
	    int n = s.nextInt();
	    int a=0;
	    for( int i=2 ; i<=n/2 ; i++ ) {
	    if(n%i==0)
	    { a=a+i;
	    }
	    
	    }
	    System.out.println(a+n+1);
	    }
	   
	    }


