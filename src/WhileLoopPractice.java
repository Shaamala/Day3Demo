import java.util.Scanner;

public class WhileLoopPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {  // to pass lowe or upper case letter
			// the code should start here
			
			System.out.println(" Do some stuff!");
			
			
			// this where code should end if using this as a template
			System.out.println("Do yo want to continue? y/n");
			cont = scan.nextLine();

		}
		
		// let the user know the program has end
		System.out.println("Goodbye!");
		scan.close();
	}

}
