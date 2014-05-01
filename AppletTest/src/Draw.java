import java.awt.*;
import java.util.Random;
import java.awt.event.*;
import java.applet.*;
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
		
		shapes.addElement(new VecLine(x1,y1,arg0.getX(),arg0.getY()));
		paint(getGraphics());
		
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
		shapes.addElement(new VecLine(x1,y1,x1,y1));
	
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
			Random rnd = new Random();
			int R = rnd.nextInt(100);
			int B = rnd.nextInt(100);
			int G = rnd.nextInt(100);
			System.out.println("COLOR" + R + "," + G + "," + B);
			g.setColor(new Color(30,230,20));
			g.drawLine(data.x1, data.y1, data.x2, data.y2);
		}
		
	}

}
