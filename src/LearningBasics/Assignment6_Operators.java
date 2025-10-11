package LearningBasics;

public class Assignment6_Operators {

	public static void main(String[] args) {

		String[] stnames = { "Suresh", "Mahesh", "Naresh" };
		int[] marks = { 75, 80, 82 };
		// Storing marks into another array newmarks
		int[] newmarks = new int[3];
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			newmarks[i] = marks[i] + 10;
			// Printing new marks
			System.out.println("Mark of " + stnames[i] + " is: " + newmarks[i]);
			// Finding average

			total += newmarks[i];
		}
		int avg = total / marks.length;
		System.out.println("Average of new marks is: " + avg);
	}

}
