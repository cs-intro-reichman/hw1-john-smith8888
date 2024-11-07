// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesTilNoon = 12*60;
		int hoursShort = hours;
		String m = "";
		String sMinutes = "" + minutes;
		//Indication of PM
		// int pmFlag = (hours - hoursShort) / 12;
		// int amFlag = 1 - pmFlag;
		if (hours * 60 + minutes >= minutesTilNoon ) {
			m = "P";
			if (hours ==12) {hoursShort=12;}
			else hoursShort = hours % 12;
		}
		else m="A";
		m = m + "M";
		if (minutes<10) {
			sMinutes = "0" + minutes;
		}
		// System.out.println("Hours: " + hours + " Minutes: " + sMinutes + " hoursShort: " + hoursShort);
		// String construction
		System.out.println(hoursShort + ":" + sMinutes + " "+ m);
	}
}