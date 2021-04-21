import java.util.Scanner;

public class DisplayTime {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter an integer for second:");
	int t = scan.nextInt();
	
	int y1 = t/60 ;
	int y2 = t%60 ;
	
	System.out.println(t+"second is"+y1+"minutes and"+y2+"second");
}
}
