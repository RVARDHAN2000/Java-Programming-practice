package Pwork;
import java.util.Scanner;


public class ReverseSplit {

	public static void main(String[] args) {
		
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your String");
		str = in.nextLine();
		String[] token = str.split(""); //used split method to print in reverse order
		int gt = 0;
		for(int i=token.length-1; (i&gt)==0; i--)
		{
		System.out.print(token[i] + "");
	}

}
}