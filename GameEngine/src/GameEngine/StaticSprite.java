package GameEngine;

import javax.swing.ImageIcon;

public abstract class StaticSprite extends GameObject {
	
	private ImageIcon image;
	
	public StaticSprite(int xPos, int yPos, String name) {
		super(xPos, yPos, name);
	}

	

}
