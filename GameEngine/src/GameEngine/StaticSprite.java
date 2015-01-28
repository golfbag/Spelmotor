package GameEngine;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public abstract class StaticSprite extends GameObject {
	
	private BufferedImage image;
	
	public StaticSprite(int xPos, int yPos, String name, BufferedImage image) {
		super(xPos, yPos, name);
		this.image = image;
	}

}
