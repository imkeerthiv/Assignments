package LearningBasics;

import java.util.HashMap;
import java.util.Map;

public class Assignment9_ConditionalStatements_loops {
	public static void main(String[] args) {

		String[] names = { "Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green" };
		double[] baseSalaries = { 75000.0, 68000.0, 82000.0, 90000.0, 60000.0 };
		double[] experiences = { 5.1, 3.2, 7.1, 10.2, 2.4 };
		double[] ratings = { 4.2, 3.8, 4.5, 2.5, 3.5 };
		Map<String, Double> hikePercentMap = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			double varPayPercent = 0.0;
			double bonus = 0.0;
			double reward = 0.0;

			// Checking hike components based on rating
			if (ratings[i] >= 4.0) {
				varPayPercent = 15.0;
				bonus = 1500.0;
			} else if (ratings[i] >= 3.0 && ratings[i] < 4.0) {
				varPayPercent = 10.0;
				bonus = 1200.0;
			} else {
				varPayPercent = 3.0;
				bonus = 300.0;
			}

			// Checking Experience >= 5 years
			if (experiences[i] >= 5.0) {
				reward = 5000.0;
			}

			// Hike calculation
			double hikeAmount = (baseSalaries[i] * varPayPercent / 100.0) + bonus + reward;
			double hikePercent = hikeAmount / baseSalaries[i];

			// Storing in map
			hikePercentMap.put(names[i], hikePercent);
		}

		for (Map.Entry<String, Double> entry : hikePercentMap.entrySet()) {
			String name = entry.getKey();
			Double hikePercent = entry.getValue();
			System.out.printf("%s: %.2f%%%n", name, hikePercent * 100);
		}
	}
}
