package LearningBasics;
import java.util.*;
public class collectionsAssignment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Map<String, List<Map<String, String>>> collectionsAssignment = new HashMap<>();
		 List<Map<String, String>> productDetails = new ArrayList<>();

	        Map<String, String> product1 = new HashMap<>();
	        product1.put("Product ID", "P001");
	        product1.put("Name", "Laptop");
	        product1.put("Category", "Electronics");
	        product1.put("Price", "$1,200");
	        product1.put("Supplier", "Tech Supplies");

	        Map<String, String> product2 = new HashMap<>();
	        product2.put("Product ID", "P002");
	        product2.put("Name", "Desk Chair");
	        product2.put("Category", "Furniture");
	        product2.put("Price", "$150");
	        product2.put("Supplier", "Office Depot");

	        Map<String, String> product3 = new HashMap<>();
	        product3.put("Product ID", "P003");
	        product3.put("Name", "Coffee Maker");
	        product3.put("Category", "Kitchen");
	        product3.put("Price", "$75");
	        product3.put("Supplier", "KitchenWorld");

	        productDetails.add(product1);
	        productDetails.add(product2);
	        productDetails.add(product3);
	        
	        collectionsAssignment.put("Product Details", productDetails);
	        List<Map<String, String>> studentDetails = new ArrayList<>();

	        Map<String, String> student1 = new HashMap<>();
	        student1.put("Name", "John Doe");
	        student1.put("Age", "20");
	        student1.put("Major", "Computer Science");
	        student1.put("Email", "john@example.com");

	        Map<String, String> student2 = new HashMap<>();
	        student2.put("Name", "Jane Smith");
	        student2.put("Age", "21");
	        student2.put("Major", "Mathematics");
	        student2.put("Email", "jane@example.com");

	        Map<String, String> student3 = new HashMap<>();
	        student3.put("Name", "Mike Brown");
	        student3.put("Age", "22");
	        student3.put("Major", "Physics");
	        student3.put("Email", "mike@example.com");

	        studentDetails.add(student1);
	        studentDetails.add(student2);
	        studentDetails.add(student3);

	        collectionsAssignment.put("Student Details", studentDetails);
	        
	        List<Map<String, String>> employeeDetails = new ArrayList<>();

	        Map<String, String> emp1 = new HashMap<>();
	        emp1.put("Employee ID", "E001");
	        emp1.put("Name", "Alice Green");
	        emp1.put("Department", "Engineering");

	        Map<String, String> emp2 = new HashMap<>();
	        emp2.put("Employee ID", "E002");
	        emp2.put("Name", "Bob Johnson");
	        emp2.put("Department", "Marketing");

	        Map<String, String> emp3 = new HashMap<>();
	        emp3.put("Employee ID", "E003");
	        emp3.put("Name", "Carol White");
	        emp3.put("Department", "Sales");

	        employeeDetails.add(emp1);
	        employeeDetails.add(emp2);
	        employeeDetails.add(emp3);

	        collectionsAssignment.put("Employee Details", employeeDetails);
	        
	        System.out.println("Product Details > Supplier Name = Office Depot");

	        List<Map<String, String>> products = collectionsAssignment.get("Product Details");

	        for (Map<String, String> product : products) {
	            if ("Office Depot".equals(product.get("Supplier"))) {
	                System.out.println("Product Found: " + product);
	            }
	        }
	}
}
