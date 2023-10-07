package Strings;

public class SubStrings {

	public static void main(String[] args) {
	 String st="Selenium";
	 for(int i =0; i<st.length();i++) {
		 for (int j=1;j<st.length();j++) {
			 for(int k=i;k<=j;k++) {
				 System.out.print(st.charAt(k));
			 }
			 System.out.println();
		 }
	 }

	}

}
