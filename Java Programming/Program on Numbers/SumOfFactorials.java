package Practice;

import java.util.Scanner;

public class SumOfFactorials {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any value ");
         int num=s.nextInt();
         int sum=0;
         int f =1;
        while (num!=0) {
        int n=num%10;
     for (int i =1;i<=n;i++) {
    	 f=f*i;
    	 sum=sum+f;
    	 num=num/10;
     }
       
                  
      	}
        System.out.println(sum);    
       
}}
