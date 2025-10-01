package LearningBasics;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Assignment:3 - Create an Employees class that stores the following employee names and IDs in separate variables:
		• Employee Names: "Bharath", "ABC", "XYZ"
		• Employee IDs: 1234, 1235, 1236 */
		
		//Then, create another class called EmpGroups that contains two arrays to store the employee names and IDs
		
		Employees emp= new Employees();
		String [] names = new String[3];
		int [] ids = new int[3];
		
		names[0] = emp.emp1;
		names[1] = emp.emp2;
		names[2] = emp.emp3;
		
		ids[0] = emp.id1;
		ids[1] = emp.id2;
		ids[2] = emp.id3;
		
		  for (int i = 0; i < names.length; i++) {
	            System.out.println("Employee Name: " + names[i] + ", Employee ID: " + ids[i]);
	        }	
		
	}
}
