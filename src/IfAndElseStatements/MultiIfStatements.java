package IfAndElseStatements;
import java.util.Scanner;
import static java.lang.System.out;
/* Caleb Mouritsen
 * 10/4/18
 * Multi-Way If Statements
 */

public class MultiIfStatements {

	public static void main(String[] args) {
		//initializing the scanner so we can get input
		Scanner input = new Scanner(System.in);
		// assigning variables to each grade and also our calculations
		double grade1;
		double grade2;
		double grade3;
		double grade4;
		double grade5;
		double grade6;
		double grade7;
		double grade8;
		double grade9;
		double grade10;
		double avg;
		double sum;
		String grade;
		
		// getting input for each grade
		out.println("enter the grade percentage from 10 of your classes");
		grade1 = input.nextDouble();
		grade2 = input.nextDouble();
		grade3 = input.nextDouble();
		grade4 = input.nextDouble();
		grade5 = input.nextDouble();
		grade6 = input.nextDouble();
		grade7 = input.nextDouble();
		grade8 = input.nextDouble();
		grade9 = input.nextDouble();
		grade10 = input.nextDouble();
		
		//getting the sum of the grades that were given
		sum = grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 + grade9 + grade10;
		
		//calculating the average based on the sum
		avg = sum / 10;
		
		//using if statements and else if statements to determine the grade the user will get
		if (avg >= 90) {
			grade = "A";
		}
		else if (avg >= 80) { 
			grade = "B";
			
		}
		else if (avg >= 70) {
			grade = "C";
		}
		else if (avg >= 60) {
			grade = "D";
		}
		else if (avg >= 50) {
			grade = "F";
		}
		else {
			grade = "F";
		}
		
		
		out.println("Your grade is: " + grade); 
	}
	
}
