package rg;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Setup {

	public static void main(String[] args) throws SlickException {
		AppGameContainer game = new AppGameContainer(new StateBasedRunner("Erik Nygren's Bizarre Adventure"));
		game.setDisplayMode(680, 480, false);
		game.setMaximumLogicUpdateInterval(60);
		game.setAlwaysRender(true);
		
		game.start();
	}
}
