import java.util.Scanner;

public class ComputeAreaWithConstant {
public static void main(String[] args) {
	final double PI= 3.14159;
	
	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Enter a number for radius:");
    
	double radius = scan.nextDouble();
	
	
	
	double area = radius*radius*PI;
	
	System.out.println("The area for the circle of radius"+radius+"is"+area);
}
}
