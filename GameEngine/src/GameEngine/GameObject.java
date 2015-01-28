package GameEngine;

public abstract class GameObject {
	
	private int xPos;
	private int yPos;
	private String name;
	
	public GameObject(int xPos, int yPos, String name){
		this.xPos = xPos;
		this.yPos= yPos;
		this.name = name;
	}
	
	abstract void draw();
	
	abstract void update();
	
	public int getXPos(){
		return xPos;
	}
	public int getYPos(){
		return yPos;
	}
	public String getName(){
		return name;
	}
}
