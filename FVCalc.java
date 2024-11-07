// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currVal = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1])/100;
		int years = Integer.parseInt(args[2]);
		// FV  Calculation
		double futureValue = currVal * Math.pow(1 + rate, years);
		// System.out.println("current value: " + currVal + " rate: " + rate + " years: " + years);
		System.out.println("After " + years + " years, $" + currVal + " saved at " + rate*100 + "% will yield $" + (int)futureValue);
	}
}