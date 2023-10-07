package Practice;
import java.util.*;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the range of values i,e ir & fr");
		int ir = s.nextInt();
		int fr = s.nextInt();
		 for (int i= ir ; i<=fr; i++)
		 {
			 if(i%2==0)
			 System.out.print(i+" ");
		 }
		
	}

}
