package IZO_808.ErrorHandling;

import java.util.Scanner;

public class TryResouce {

	public static void main(String[] args) {
		// try with resource statement
		// Resource will be closed automatically if the class implements java.lang.AutoCloseable interface
		try(Scanner scanner = new Scanner(System.in)){
			String input = scanner.next();
			
			double doubleNumber = Double.parseDouble(input);
			System.out.printf("Result: %7.2f", doubleNumber);
		} catch(NumberFormatException e) {
			System.out.println("Invalid input.");
		}
	}

}
