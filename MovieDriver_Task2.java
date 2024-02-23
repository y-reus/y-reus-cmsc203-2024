
import java.util.Scanner;

public class MovieDriver_Task2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean askAgain;
		int soldTickets = 0;

		do {
			System.out.println("Enter a name of a movie: ");
			String title = scanner.nextLine();

			System.out.println("Enter the movie's rating: ");
			String rating = scanner.nextLine();

			do {
				System.out.println("Enter the number of tickets sold for the movie: ");

				if (scanner.hasNextInt()) {
					soldTickets = scanner.nextInt();
					scanner.nextLine(); 
					break; 
				} else {
					System.out.println("Invalid input. Please enter a valid integer.");
					scanner.nextLine(); 
				}
			} while (true);

			Movie movieInfo = new Movie(title, rating, soldTickets);

			System.out.println(movieInfo.toString());

			char yesNo;
			do {
				System.out.println("Do you want to enter another movie? (y or n)");
				yesNo = scanner.nextLine().charAt(0);
				if (yesNo != 'y' && yesNo != 'n') {
					System.out.println("Invalid input. Please enter 'y' or 'n'.");
				}
			} while (yesNo != 'y' && yesNo != 'n');
			askAgain = (yesNo == 'y');

		} while (askAgain);

		System.out.println("Goodbye");
	}
}
