package LearningBasics;

public class conditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customerName = "John Doe";
		int cs = 720;
		int income = 55000;
		boolean isEmployed = true;
		float dR = 35.0f;
if (cs>750){ 
	System.out.println("The Loan is approved");
}

else if ((cs>650) && (cs<750)) {
	
	if(income>=50000) {
		if(isEmployed== true){
			if(dR<40) {
				System.out.println("The Loan is approved");
			}
			else {
				System.out.println("The Loan is rejected");
			}
		}
	}
}
else {
	System.out.println("The Loan is rejected");
	
		}
	}
	}

