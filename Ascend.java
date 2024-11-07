// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int rangeUpper = Integer.parseInt(args[0]);
		// Number generation - according to desired range:
		int a = (int) (Math.random() * rangeUpper);
		int b = (int) (Math.random() * rangeUpper);
		int c = (int) (Math.random() * rangeUpper);
		System.out.println("" + a + " " + b + " " + c);
		// variable assignment and min finding:
		int smallest = 0;
		smallest = Math.min(a, b);
		smallest = Math.min(smallest, c);
		// variable assignment and max finding:
		int largest = 0;
		largest = Math.max(a, b);
		largest = Math.max(largest, c);

		System.out.println("" + smallest + " " + (a+b+c-smallest-largest) + " " + largest);
	}
}
