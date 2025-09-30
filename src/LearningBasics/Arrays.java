package LearningBasics;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [][][] studentReport = new String[5][6][2];
//Semester 1
studentReport[0][0][0] = "Mathematics I";
studentReport[0][0][1] = "Pass(78)";

studentReport[0][1][0] = "Physics";
studentReport[0][1][1] = "Pass(85)";

studentReport[0][2][0] = "Chemistry";
studentReport[0][2][1] = "Fail(21)";

studentReport[0][3][0] = "Computer Programming";
studentReport[0][3][1] = "Pass(74)";

studentReport[0][4][0] = "Engineering Drawing";
studentReport[0][4][1] = "Pass(88)";

studentReport[0][5][0] = "Basic Electrical Eng.";
studentReport[0][5][1] = "Pass(79)";

//Semester 2
studentReport[1][0][0] = "Mathematics II";
studentReport[1][0][1] = "Pass(82)";

studentReport[1][1][0] = "Mechanics";
studentReport[1][1][1] = "Pass(77)";

studentReport[1][2][0] = "Environmental Sci";
studentReport[1][2][1] = "Pass(93)";

studentReport[1][3][0] = "Basic Electronics";
studentReport[1][3][1] = "Fail(19)";

studentReport[1][4][0] = "Engineering Physics";
studentReport[1][4][1] = "Fail(24)";

studentReport[1][5][0] = "Engineering Graphics";
studentReport[1][5][1] = "Pass(90)";

//Semester 3
studentReport[2][0][0] = "Data Structures";
studentReport[2][0][1] = "Pass(88)";

studentReport[2][1][0] = "Discrete Mathematics";
studentReport[2][1][1] = "Pass(81)";

studentReport[2][2][0] = "Digital Electronics";
studentReport[2][2][1] = "Pass(76)";

studentReport[2][3][0] = "Operating Systems";
studentReport[2][3][1] = "Fail(32)";

studentReport[2][4][0] = "Signals and Systems";
studentReport[2][4][1] = "Pass(85)";

studentReport[2][5][0] = "Object-Oriented Prog.";
studentReport[2][5][1] = "Pass(78)";

//Semester 4
studentReport[3][0][0] = "Algorithms";
studentReport[3][0][1] = "Pass(91)";

studentReport[3][1][0] = "Computer Networks";
studentReport[3][1][1] = "Pass(73)";

studentReport[3][2][0] = "Database Systems";
studentReport[3][2][1] = "Fail(19)";

studentReport[3][3][0] = "Microprocessors";
studentReport[3][3][1] = "Pass(80)";

studentReport[3][4][0] = "Communication Eng.";
studentReport[3][4][1] = "Pass(76)";

studentReport[3][5][0] = "Software Engineering";
studentReport[3][5][1] = "Pass(87)";

//Semester 5
studentReport[4][0][0] = "Probability & Stats";
studentReport[4][0][1] = "Pass(86)";

studentReport[4][1][0] = "Machine Learning";
studentReport[4][1][1] = "Pass(88)";

studentReport[4][2][0] = "Compiler Design";
studentReport[4][2][1] = "Pass(84)";

studentReport[4][3][0] = "Theory of Computation";
studentReport[4][3][1] = "Pass(95)";

studentReport[4][4][0] = "Embedded Systems";
studentReport[4][4][1] = "Pass(73)";

studentReport[4][5][0] = "Computer Graphics";
studentReport[4][5][1] = "Pass(90)";

System.out.println("Semester 2 Subject 4 and Subject 5 names are: "+studentReport[1][3][0]+ " and " +studentReport[1][4][0] );
System.out.println("The Status/Marks of Semester 4 Subject 3 and Subject 6 is: "+studentReport[3][2][1] + " and " +studentReport[3][5][1]);
	}


}
