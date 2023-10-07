package Strings;

import java.util.Scanner;

public class UpperCaseToLower {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		System.out.println("Enter any string");
	
		String st= s.nextLine();
		char[]a=st.toCharArray();
		String res = "";
		for (int i =0; i<a.length;i++) {
			if (a[i]>='A'&&a[i]<='Z') {
				
			 a[i]+=32;
			}
		res=res+a[i];
		}
		System.out.println(res);

	}

}
