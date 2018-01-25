import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please enter your age: ");

		int age = scan.nextInt();

		if (age >= 18) {
			System.out.println("Congratulation, you can legally vote!");
		} else if (age >= 16) {
			System.out.println("Head to voter education");
		} else {
			System.out.println("Sorry, you can't vote. Please do some research");
		}
		scan.close();

	}

}
