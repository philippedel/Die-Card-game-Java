
public class GameFactory {
	//creating instance method of GameInterface
	public GameInterface getInstance(String ans) {
		//choosing which game to display depending on the input
	    if (ans.equals("c") || ans.equals("C")) {
			return new CardGame();
	    }else if (ans.equals("d") || ans.equals("D")) {
			return new DieGame();
	    }
		return null;
	}
}
