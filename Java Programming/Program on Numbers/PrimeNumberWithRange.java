package Practice;

import java.util.Scanner;

public class PrimeNumberWithRange {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter initial range ");
			int ir= s.nextInt();
			System.out.println("Enter initial range ");
			int fr =s.nextInt();
			for(int j = ir;j<=fr;j++) {
        int i;
      
        
         for( i=2; i<j; i++) {
        	 if(j%i==0) {
        		 break;
        	 }
        	 
         }
         if (i==j)
         System.out.print(j+" ");
}
	}
	}
