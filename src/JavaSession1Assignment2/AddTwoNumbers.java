package JavaSession1Assignment2;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		System.out.println(" Sum of 115 and 135 is : " + add(115, 135));
	}
	
// method to add the 2 numbers
	private static int add(int a, int b) {
		if (b == 0){
			return a;
		}
		int sum = a ^ b; //Applying XOR operator to add
		int shift = (a & b) << 1; //shifting the bits after bitwise and operation
		return add(sum,shift);
	}

}
