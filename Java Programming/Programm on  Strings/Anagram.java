package Strings;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any String here ");
		String st = s.next();
		char[]a=st.toCharArray();
		String res = "";
		int count=0;
		for (int i =0; i<a.length;i++) {
			if (a[i]>='a'&&a[i]<='z') {
				
			 a[i]-=32;
			}
		res=res+a[i];
		}
		
		String st1 = s.next();
		char[]a1=st1.toCharArray();
		String res1 = "";
		for (int i =0; i<a1.length;i++) {
			if (a1[i]>='a'&&a1[i]<='z') {
				
			 a1[i]-=32;
			}
		res1=res1+a1[i];
		}
		
		
		for (int i=0;i<a.length;i++ ) {
			for(int j=0; j<a1.length ;j++ ) {
				if(a[i]==a1[j]) {
					count++;
					 
				}
			}
		}
	
		if(count==a.length)
		{
			System.out.println("The string is anagram");
		}
		else
			System.out.println("The string is not a anagram");
	}

}
