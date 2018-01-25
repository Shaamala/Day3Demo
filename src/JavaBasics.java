
public class JavaBasics {

	public static void main(String[] args) {
		final String TEST = "hello"; 
		// TEST = "no"; we cannot do this - th constant cannot be reassigned
		
		final int TESTINT = 4;
		
		// Pirimtive type declaration
		
		byte b =127;  // limit -128 to 127
		short s = 32767; // limit -32767 to 32767
		int i = 13333;  // llimit 2147483647
		float fl = 6.7F;
		double d = 5.667;
		char c = 'c';
		boolean bool = true; // default is false
		long l = 1223928398L; // can use lower case l
		
		Math.abs(6.7);
		
		// implicit conversion examples
		int numOfItem =5;
		System.out.println(3.0/1.5);
		System.out.println(3.0/2);
		System.out.println((numOfItem +10)/2);
		System.out.println((numOfItem+10)/2.0);
		
		// explicit casting(type casting)
		
		double x =(double) 3/5; // answer will be 0.0 because the calculation is done before casting
		System.out.println(x);
		
		double z =(double) 3/(double)5; // answer will be 0.6 because casting is done first
		System.out.println(z);
		
		//example 2 -- commen error forgetting to cast
		int kidsInFamily1 =3;
		int kidsInFamily2 = 4;
		int numOfFamilies = 2;
		double avgKidsPerFamily = (double)(kidsInFamily1 + kidsInFamily2) / numOfFamilies;
		System.out.println(avgKidsPerFamily);
		
		
		

	}

}
