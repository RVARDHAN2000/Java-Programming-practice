package Practice1;

import java.util.Scanner;

public class SwapNumbers {

public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter a value ");
	int a = s.nextInt();
	System.out.println("Enter b "
			+ "value ");
	int b = s.nextInt();

    System.out.println("a is " + a + " and b is " + b);

	a = a + b;
	b = a - b;
	a = a - b;

    System.out.println("After swapping, a is " + a + " and b is " + b);
    }

}