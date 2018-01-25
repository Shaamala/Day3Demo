
public class InfiniteWhileLoop {

	public static void main(String[] args) {

		// this loop will continue endlessly unless i add a stop condition

		while (true) {
			int randomNum = (int) (Math.random() * 10); // this willgenerate a number from 0-10
			System.out.println(randomNum);
			if (randomNum == 7) {
				System.out.println("7 has been found -- exit loop");
				break;
			}
		}
	}

}
