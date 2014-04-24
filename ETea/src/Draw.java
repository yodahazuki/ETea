import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.applet.*;
import java.util.Random;
import java.util.Vector;


public class Draw extends Applet implements MouseListener, MouseMotionListener{
	int x1, x2;
	int y1, y2;
	Vector shapes = new Vector();
	
	public Draw(){
		setForeground(Color.gray);
		setBackground(Color.white);
		addMouseMotionListener(this);
	    addMouseListener(this);
	}
	
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		arg0.consume();
		
		drawLine(x1,y1,arg0.getX(),arg0.getY());
		
		x1 = arg0.getX();
		y1 = arg0.getY();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		arg0.consume();
		
		x1 = x2 = arg0.getX();
		y1 = y2 = arg0.getY();
		drawLine(x1,y1,x1,y1);
	
		paint(getGraphics());
		
	}
	
	public void drawLine(int x1,int y1,int x2,int y2){
		Random rnd = new Random();
		int R = rnd.nextInt(255);
		int G = rnd.nextInt(255);
		int B = rnd.nextInt(255);
		int width = rnd.nextInt(5);
		VecLine newLine = new VecLine(x1,y1,x2,y2);
		newLine.setColor(new Color(R,G,B));
		newLine.setStroke(width);
		shapes.addElement(newLine);
		paint(getGraphics());
	}

	@Override
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
