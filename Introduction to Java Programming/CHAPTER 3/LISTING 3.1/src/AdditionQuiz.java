import java.util.Scanner;

public class AdditionQuiz {
	public static void main(String[] args) {

		double a = Math.random() * 10;
		double b = Math.random() * 10;

		System.out.println(+(int) a + "+" + (int) b + "?");

		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();

		System.out.println(+(int) a + "+" + (int) b);

		int c = (int) a + (int) b;

		if (c == d) {
			System.out.println(+(int) a + "+" + (int) b + "=" + (int) c + "true");
		}

		else if (c != d) {
			System.out.println(+(int) a + "+" + (int) b + "=" + (int) c + "false");
		}
	}
}
