import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.applet.*;
import java.util.Random;
import java.util.Vector;


class DrawingCanvas extends Canvas implements MouseListener, MouseMotionListener{
	int x1, x2;
	int y1, y2;
	
	int R, G, B;
	Vector shapes = new Vector();
	BufferedImage img;
	
	public DrawingCanvas(int w, int h){
		setSize(w,h);
		setForeground(Color.gray);
		setBackground(Color.white);
		addMouseMotionListener(this);
	    addMouseListener(this);
	}
	
	
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		arg0.consume();
		if ((arg0.getModifiers() & MouseEvent.BUTTON1_MASK) != 0) {
		x2=arg0.getX();
		y2=arg0.getY();
			
		}
		drawing(arg0);
		x1 = arg0.getX();
		y1 = arg0.getY();
	}

	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		arg0.consume();
		
		//TODO: マウスが押された時の処理を書いてください
		if ((arg0.getModifiers() & MouseEvent.BUTTON1_MASK) != 0) {
			x1 = x2 = arg0.getX();
			y1 = y2 = arg0.getY();
		}
		
		drawing(arg0);
		
	}
	
	public void drawing(MouseEvent arg0){
		if ((arg0.getModifiers() & MouseEvent.BUTTON2_MASK) != 0) {
			//中央
		}
		if ((arg0.getModifiers() & MouseEvent.BUTTON3_MASK) != 0) {
			
			System.out.println("スポイト機能 (" + arg0.getX() + "," + arg0.getY() + ")");
		}else{
			drawLine(x1,y1,x2,y2);
			paint(getGraphics());
		}
	}
	
	public void drawLine(int x1,int y1,int x2,int y2){
		Random rnd = new Random();
//		int R = rnd.nextInt(255);
//		int G = rnd.nextInt(255);
//		int B = rnd.nextInt(255);
		int width = rnd.nextInt(5);
		VecLine newLine = new VecLine(x1,y1,x2,y2);
		newLine.setColor(new Color(R,G,B));
		newLine.setStroke(width);
		shapes.addElement(newLine);
		paint(getGraphics());
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void paint(Graphics g){
		int number = shapes.size();
		for (int i = 0; i < number; i++){
			VecLine data = (VecLine) shapes.elementAt(i);
			
			g.setColor(data.getColor());
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(data.getWidth()));
			g2.drawLine(data.x1, data.y1, data.x2, data.y2);
		}
		
	}

}
