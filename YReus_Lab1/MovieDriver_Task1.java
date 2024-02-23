
import java.util.Scanner;

public class MovieDriver_Task1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean askAgain;
		int soldTickets = 0;

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


		System.out.println("Goodbye");
		
}
}