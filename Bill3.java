// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		//Variable assignment
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int total = Integer.parseInt(args[3]);
		// Portion Calculation
		double portion = Math.ceil(total / 3.0);
		
		System.out.println("Dear " + name3 + ", "+ name2 + ", and " + name1
		 + ": pay "+ portion + " Shekels each.");
	}
}
