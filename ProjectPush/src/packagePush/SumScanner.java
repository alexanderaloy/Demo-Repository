package packagePush;

import java.util.Scanner;

public class SumScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number");
	float a = sc.nextFloat();
	System.out.println("Enter second number");
	float b = sc.nextFloat();
	float sum = a+b;
	System.out.println("The sum is "+sum);
	sc.close();
	}

}
