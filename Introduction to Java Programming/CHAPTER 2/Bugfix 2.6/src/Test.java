
public class Test {
	public static void main(String[] args)

	{

		int j, k; // Bug fix is here
		
		int i = j = k = 2;

		System.out.println(i + " " + j + " " + k);
	}

}