
public class DoWhilePractice {

	public static void main(String[] args) {
		int i = 1;
		int month = 36;
		double futureValue = 0;
		double monthlyPmt = 330.36;
		double intRate = 5.99 / 100;

		// the do loop will always execute aat least once
		do {

			futureValue = (futureValue + monthlyPmt) * (1 + intRate);
			i++;
			System.out.println(futureValue);

		} while (i <= month);

	}

}
