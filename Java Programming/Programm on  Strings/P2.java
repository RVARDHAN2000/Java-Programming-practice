package Pwork;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
    	Scanner s = new Scanner (System.in);
    	System.out.println("Enter the a & b ");
    	 double a = s.nextDouble();
        double b = s.nextDouble();

        double divisionResult = a / b;

        // Format the result to have 3 decimal places
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        String formattedResult = decimalFormat.format(divisionResult);

        System.out.println("Result: " + formattedResult);
    }
}

