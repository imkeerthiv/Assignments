package LearningBasics;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1. Create a 1D array of integers with a length of 5. Populate the array with values of
		your choice and print each element of the array to the console. For the 1D array of
		integers, you could use: {4, 7, 2, 9, 5}.*/
		
		int [] numbers= {4, 7, 2, 9, 5};
		System.out.println("The elements of the array are:"+numbers[0]+ "," +numbers[1]+ "," +numbers[2]+ "," +numbers[3]+ "," +numbers[4]);
	
		/*2. Create a 1D array of strings with a length of 3. Populate the array with your favorite
		colors and print each element of the array to the console.For the 1D array of
		strings, you could use: {"red", "green", "blue"}.*/
		
		String [] favColors= new String[3];
		favColors[0]= "red";
		favColors[1]="green";
		favColors[2]="blue";
		System.out.println("The Favorite colors are:" +favColors[0] +","+favColors[1]+","+favColors[2]);
		
		/*3. Create a 2D array of integers with a size of 3x3. Populate the array with values of
		your choice and print each element of the array to the console.For the 2D array of
		integers, you could use: {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}*/
		int [][] values= new int[3][3];
		values[0][0]=1;
		values[0][1]=2;
		values[0][2]=3;
		values[1][0]=4;
		values[1][1]=5;
		values[1][2]=6;
		values[2][0]=7;
		values[2][1]=8;
		values[2][2]=9;
		System.out.println("The 2D arrays of integers are:"+"{"+"{"+values[0][0]+","+values[0][1]+","+values[0][2]+"}"+"{"+values[1][0]+","+values[1][1]+","+values[1][2]+"}"+"{"+values[2][0]+","+values[2][1]+","+values[2][2]+"}"+"}");
			
		/*4. Create a 2D array of strings with a size of 2x2. Populate the array with your favorite
		foods and print each element of the array to the console.For the 2D array of strings,
		you could use: {{"pizza", "pasta"}, {"burger", "fries"}}.*/
		
		String [][] favFoods=new String[2][2];
		favFoods[0][0]="Pizza";
		favFoods[0][1]="Pasta";
		favFoods[1][0]="Burger";
		favFoods[1][1]="Fries";
		System.out.println("Favorite Foods are:"+"{"+"{"+favFoods[0][0]+","+favFoods[0][1]+"}"+","+"{"+favFoods[1][0]+","+favFoods[1][1]+"}"+"}");
		}
	
	}

