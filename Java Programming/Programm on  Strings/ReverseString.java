package Pwork;

public class ReverseString {

	public static void main(String[] args) {
			String str = "Automation";
			StringBuilder str2 = new StringBuilder();
			str2.append(str);
			str2 = str2.reverse(); // used string builder to reverse
			System.out.println(str2);
	}

}
