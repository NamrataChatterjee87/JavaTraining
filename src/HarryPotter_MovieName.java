import java.util.Scanner;

public class HarryPotter_MovieName {

	public static void main(String[] args) {
		//User will input a number between 1-8
				Scanner input = new Scanner(System.in);
				
			
				System.out.println("Enter the movie squence number (1-8) : ");
				int movieSquenceNumber  = input.nextInt();


		        //Movie names as per sequence of release
				switch (movieSquenceNumber) {
				case 1:
				System.out.println("Harry Potter and the Philosopher's Stone");
				break;
				case 2:
				System.out.println("Harry Potter and the Chamber of Secrets");
				break;
				case 3:
				System.out.println("Harry Potter and the Prisoner of Azkaban");
				break;
				case 4:
				System.out.println("Harry Potter and the Goblet of Fire");
				break;
				case 5:
				System.out.println("Harry Potter and the Order of the Phoenix");
				break;
				case 6:
				System.out.println("Harry Potter and the Half-Blood Prince");
				break;
				case 7:
				System.out.println("Harry Potter and the Deathly Hallows – Part 1");
				break;
				case 8:
				System.out.println("Harry Potter and the Deathly Hallows – Part 2");
				break;
				default:
				System.out.println("Not First or Last movie");



				} // End Switch
			
				input.close();
				


	}

}
