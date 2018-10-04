package IfAndElseStatements;

/* Caleb Mouritsen 
 * Nested if statement example
 * 10/4/18
 */

public class NestedIfStatements {

	public static void main(String[] args) {
		int x = 1; 
		int y = 2;
		int z = 3;
		
		if (x < y) {
			System.out.println("the x variable is less than the y variable");
			if (z > y) {
				System.out.println("z is greater than y");
			}
			
			else { 
				System.out.println("second condition wasn't true");
			}
		}
		else {
			System.out.println("first condition wasn't true");
		}
	}

}
