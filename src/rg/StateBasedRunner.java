package rg;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

	
public class StateBasedRunner extends StateBasedGame {

	public static BasicGameState jojoGameState, menuState;
	public static int menuID = 0, gameID = 1;
	
	public StateBasedRunner(String name) throws SlickException {
		super(name);
		jojoGameState = new JojoGame();
		menuState = new MenuState();
	}

	@Override
	public void initStatesList(GameContainer c) throws SlickException {
		addState(menuState);
		addState(jojoGameState);
	}

}
