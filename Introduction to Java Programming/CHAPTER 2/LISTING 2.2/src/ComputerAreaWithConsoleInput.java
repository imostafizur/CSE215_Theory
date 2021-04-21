import java.util.Scanner;

public class ComputerAreaWithConsoleInput {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number for radius: ");

		double radious = input.nextDouble();

		double area = radious * radious * 3.141592;

		System.out.println("The area for the circle of radius " + radious + "is " + area);

	}
}
