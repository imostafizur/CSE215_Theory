import java.util.Scanner;

public class SubtractionQuiz {
public static void main(String[] args) {
	double a = Math.random() * 10;
	double b = Math.random() * 10;

	System.out.println("What is"+(int) a + "-" + (int) b + "?");

	Scanner scan = new Scanner(System.in);
	int d = scan.nextInt();

//	System.out.println(+(int) a + "+" + (int) b);

	int c = (int) a - (int) b;

	if (c == d) {
		System.out.println("You are correct! ");
	}

	else if (c != d) {
		System.out.println("Your answer is wrong!");
		System.out.println(+(int) a + "-" + (int) b + "is"+c);
	}
}
}
