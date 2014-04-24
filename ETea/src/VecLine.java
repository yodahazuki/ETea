import java.awt.Color;


public class VecLine{

	public int x1, x2;
	public int y1, y2;
	public Color color;
	public int width;
	
	public VecLine(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated constructor stub
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	public void setStroke(int width){
		this.width = width;
	}
	
	public int getWidth(){
		return this.width;
	}
	

	
	
}
