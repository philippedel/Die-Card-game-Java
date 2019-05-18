import java.io.*;

public class Game  {
  // The BufferedReader used throughout
  private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


  public static void main(String[] args) throws Exception {
    // Ask whether to play a card game or a die game

    System.out.print("Card (c) or Die (d) game? ");
    String ans=br.readLine();
    //creating an object of the GameFactory class
	GameFactory object = new GameFactory();
	GameInterface obj =  object.getInstance(ans);
	

    if (object.getInstance(ans) != null) {
    	//starting the game
		obj.playGame();
    }
    //if the user types something other than c or d an error message is displayed!
    else System.out.println("Input not understood");
  }
}

