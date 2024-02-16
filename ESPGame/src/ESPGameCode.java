
/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: ESPGameCode is the code used to run the ESP Game
 * Due: 02/16/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Yuri Reus
*/


import java.util.Scanner;
import java.util.Random;

public class ESPGameCode {
	public static void main(String[] ags) {
		
		final int red = 1;
		final int blue = 2;
		final int green = 3;
		final int orange = 4;
		final int purple = 5;
		final int yellow = 6;
		final int pink = 7;
		
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		final int roundNumber = 11;
		int correctGuess = 0;
		
			System.out.println("Enter your name: ");
				String name = keyboard.nextLine();
			System.out.println("Enter your MC M#: ");
				String mcNum = keyboard.nextLine();
			System.out.println("Describe yourself: ");
				String info = keyboard.nextLine();
			
		boolean validDate = false;
		String dueDate = "";
		
		while (!validDate) {	
			System.out.println("Due Date in MM/DD/YY format: ");
				dueDate = keyboard.nextLine();
		if (dueDate.matches("\\d{2}/\\d{2}/\\d{2}")) {
		        validDate = true;
			} else {
		        System.out.println("Invalid date format. Please enter the date in MM/DD/YY format.");
					}
		}
		for (int i = 1; i <= roundNumber; i++) {
			
		
			int randomNumber = random.nextInt(7) +1;
			
			String randomColor = "";
			
			if (randomNumber == red) {
				randomColor = "Red";
				} else if (randomNumber == blue) {
					randomColor = "Blue";
				} else if (randomNumber == green) {
					randomColor = "Green";
				} else if (randomNumber == orange) {
					randomColor = "Orange";
				} else if (randomNumber == purple) {
					randomColor = "Purple";
				} else if (randomNumber == yellow) {
					randomColor = "Yellow";
				} else if (randomNumber == pink) {
					randomColor = "Pink";
				}
			
			System.out.println("Round " + i);
			System.out.println("\nWhat color am I thinking of?");
			System.out.println("Red, Blue, Green, Orange, Purple, Yellow, or Pink\n");
			String answer = "";
			boolean validColor = false;

		    while (!validColor) {
		        answer = keyboard.nextLine();
		        if (answer.equalsIgnoreCase("Red") || answer.equalsIgnoreCase("Blue") ||
		            answer.equalsIgnoreCase("Green") || answer.equalsIgnoreCase("Orange") ||
		            answer.equalsIgnoreCase("Purple") || answer.equalsIgnoreCase("Yellow") ||
		            answer.equalsIgnoreCase("Pink")) {
		            validColor = true;
		        } else {
		            System.out.println("Invalid color. Please choose from: "
		            		+ "Red, Blue, Green, Orange, Purple, Yellow, or Pink");
		        }
		    }
			
			if (answer.equalsIgnoreCase(randomColor)) {
				System.out.println("\nCorrect\n");
				correctGuess++;
			} else {
				System.out.println("\nWrong, the color was " + randomColor + "\n");
				}
		}
			System.out.println("Game Over\n");
			System.out.println("\nYou got " + correctGuess + " out of 11 correct.");
			System.out.println("" + name);
			System.out.println("" + mcNum);
			System.out.println("" + info);
			System.out.println("" + dueDate);
	}
}
