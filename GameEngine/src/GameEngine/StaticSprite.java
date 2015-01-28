package GameEngine;

public abstract class StaticSprite extends GameObject {
	
	private String fileName;
	
	public StaticSprite(int xPos, int yPos, String name, String fileName) {
		super(xPos, yPos, name);
		this.setFileName(fileName);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
