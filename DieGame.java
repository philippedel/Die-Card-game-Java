import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DieGame implements GameInterface {
	//refactored constant variable, making the code more maintainable and easier to read
	private static final int rolls_of_die = 2;
	//I choose to make a separate class for Die game, for improving cohesion and coupling in the program
	//Game class had low cohesion because it was implementing 2 games
	//So I split them into 2 different classes, using the Factory pattern
	
	//using private variables we have loose coupling
	private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private static NextNumber r = new LinearCongruentialGenerator();
	
	//Variable(s) used in the die game methods
	private static HashSet<Integer> numbersRolled=new HashSet<Integer>();
	
	// for high cohesion, methods address single tasks and have clear clear intent (and a suggestive name)
	public void playGame() throws IOException {	     
		  // Play die game:
	      // Initialise the game from the InitialiseDieGame class
		  initialiseGame();

	      // Play the main game phase
	      mainGame();

	      // Now see if (s)he has won!
	      declareGameWinner();
		
	}

	
	public void initialiseGame() throws IOException {
		// TODO Auto-generated method stub
		
	}

	
	public void mainGame() throws IOException {
	      // The main game:

	      // Let the user roll the die twice
	      //we used refactoring of constant on the number of times the user rolls the dice
	      //to make the code more maintainable and easier to read
	      for (int i=0; i<rolls_of_die; i++) {
	        System.out.println("Hit <RETURN> to roll the die");
	        br.readLine();
	        int dieRoll=(int)(r.getNextNumber() * 6) + 1;

	        System.out.println("You rolled " + dieRoll);
	        numbersRolled.add(Integer.valueOf(dieRoll)); //before it was [new Integer(dieRoll)]
	      }

	      // Display the numbers rolled
	      System.out.println("Numbers rolled: " + numbersRolled);
		
	}

	
	public void declareGameWinner() throws IOException {
	      // Declare the winner:

	      // User wins if at least one of the die rolls is a 1
	      if (numbersRolled.contains(Integer.valueOf(1))) { // before it was[new Integer(1)]
	        System.out.println("You won!");
	      }
	      else System.out.println("You lost!");
		
	}
}
