import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number for division:");
		int fnum = scan.nextInt();
		System.out.println("Enter second number for division:");
		int snum = scan.nextInt();
		try {
			int result = fnum / snum;
			System.out.println("division of two numbers : " + result);
		} catch (Exception excp) {
			System.out.println("Denominator can't be zero");
		}
		System.out.println("remaining 1000 lines ");

	}
}
