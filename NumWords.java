// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		// System.out.println(num);
		int hundreds = num / 100;
		int tens = (num - 100 * hundreds) / 10;
		int ones = (num - 100 * hundreds - 10 * tens) % 10;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
