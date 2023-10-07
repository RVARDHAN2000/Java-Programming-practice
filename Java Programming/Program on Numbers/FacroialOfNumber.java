package Practice;

import java.util.* ;
public class FacroialOfNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any value ");
         int n=s.nextInt();
         int f=1;
         
		for (int i = n; i>0; i--) {
			f=f*i;
		}
		System.out.println(f);
	}

}
