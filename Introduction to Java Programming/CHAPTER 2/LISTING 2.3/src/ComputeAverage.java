import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter three Number:");

		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();

		double X = ((A + B + C) / 3);

		System.out.println("The average of" + A + " " + B + " " + C + " is " + X);

	}

}
