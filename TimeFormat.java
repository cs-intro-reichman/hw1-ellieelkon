// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		if (hours > 0 && hours < 12 && minutes >= 0 && minutes < 10) {
			System.out.print(hours + ":0" + minutes + " AM") ; }
		
			if (hours > 0 && hours < 12 && minutes >= 10 && minutes < 60) {
			System.out.print(hours + ":" + minutes + " AM") ; }

		if (hours > 12 && hours <= 23 && minutes >= 0 && minutes < 10) {
			System.out.print((hours - 12) + ":0" + minutes + " PM"); }
		
			if (hours > 12 && hours <= 23 && minutes >= 10 && minutes < 60) {
			System.out.print((hours - 12) + ":" + minutes + " PM"); }

		if (hours == 0 && minutes >= 0 && minutes < 10) {
			System.out.print(hours + ":0" + minutes + " AM") ; }
		
			if (hours == 0 && minutes >= 10 && minutes < 60) {
			System.out.print(hours + ":" + minutes + " AM") ; }
		
		if (hours ==12 && minutes >= 10 && minutes < 60) {
			System.out.print(hours + ":0" + minutes + " PM") ; }
	
		if (hours ==12 && minutes >= 10 && minutes < 60){
			System.out.print(hours + ":" + minutes + " PM") ; }	

	}
}