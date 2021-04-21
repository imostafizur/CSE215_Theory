import java.util.Scanner;

public class FarhenheightToCelsius {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter a degree in Fahrenheight:");
    
    double F = scan.nextDouble();
    
   double C = ((F-32)*5)/9 ;
   
   
   System.out.println("Fahrenheit"+F+"is"+C+"in Celsius");
	
}
}
