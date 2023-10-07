package Pwork;
import java.util.Scanner;

public class P1 {
	
public static void main (String[]args) 
	{
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the base & power ");
	int base = s.nextInt();
    int power = s.nextInt();

    int result = 1;
    for (int i = 0; i < power; i++) {
    result = result * base;
}
    System.out.println(result);


}
}