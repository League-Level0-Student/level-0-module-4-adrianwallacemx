package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String numbers=JOptionPane.showInputDialog("pick 1 number");
String numbers2=JOptionPane.showInputDialog("pick 1 number");
int num1=Integer.parseInt(numbers);
int num2=Integer.parseInt(numbers2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "multiply", "subtract", "divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if(operation == 0) {
	add(num1, num2);
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	public static void add(int n1,int n2) {
		JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + (n1 + n2));
		
	}
	public static void subtract(int n1,int n2) {
		JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + (n1 - n2));
		
	}
	public static void multiply(int n1,int n2) {
		JOptionPane.showMessageDialog(null, n1 + " * " + n2 + " = " + (n1 * n2));
		
	}
	public static void divide(int n1,int n2) {
		JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + (n1 / n2));
		
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}