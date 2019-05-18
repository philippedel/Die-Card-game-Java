import java.io.IOException;

//We have loose coupling by having implemented a public interface which
//DieGame and CardGame use

public interface GameInterface {
	
	//we created 4 methods that die/card game have to use in order to increase cohesion and reduce coupling
	public void playGame() throws IOException;
	
	public void initialiseGame() throws IOException;
	
	public void mainGame() throws IOException;
	
	public void declareGameWinner() throws IOException;

}
