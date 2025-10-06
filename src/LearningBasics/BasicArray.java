package LearningBasics;

public class BasicArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int [] arr= {112,345,586,788};

int start=0	;
		int end=arr.length-1;
		while (start < end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
			System.out.println("Reversed Array");
			for (int num :arr) {
				System.out.println(num +"");
			}

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        System.out.println("Second largest element is: " + secondLargest);
	    }
	
		
	        }

