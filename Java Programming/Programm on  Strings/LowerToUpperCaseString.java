package Strings;

import java.util.Scanner;

public class LowerToUpperCaseString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		System.out.println("Enter any string");
	
		String st= s.nextLine();
		char[]a=st.toCharArray();
		String res = "";
		for (int i =0; i<a.length;i++) {
			if (a[i]>='a'&&a[i]<='z') {
				
			 a[i]-=32;
			}
		res=res+a[i];
		}
		System.out.println(res);

	}

}



