import java.util.Scanner;
/*Main class
 * Reads the input of the user, moves the trainer and checks how many pokemon were caught
 * */
public class Main {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		String moves = new String("");
		Ash trainer = new Ash();
		System.out.println("If you want to exit, insert QUIT");
		while(true) {
			System.out.println("Insert your movements: ");
			//Reads the user input line, and makes them all caps
			moves = reader.nextLine();
			moves = moves.toUpperCase();
			//Checks if the input is "quit", and if it is, teh program ends 
			if(moves.compareTo("QUIT") == 0) {
				System.out.println("Leaving the Pokemon World!");
				break;
			}
			//Moves the trainer according to the input moves
			trainer.Move(moves);
			
			//Prints the amount of pokemon caught
			System.out.print("Ash caught ");
			System.out.print(trainer.getCaught());
			System.out.println(" Pokemon!");
		}
		
		reader.close();
	}

}