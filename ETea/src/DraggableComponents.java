import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;


public class DraggableComponents extends JLabel implements MouseMotionListener, MouseListener{

	private Point origin = new Point(0,0);
	private Point current = new Point(0,0);
	
	public DraggableComponents(String text) {
		setText(text);
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		origin.x = arg0.getX();
		origin.y = arg0.getY();
		System.out.println(origin.x);
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		current.x = arg0.getX();
		current.y = arg0.getY();
		Point p = new Point(current.x-origin.x,current.y-origin.y);
		setLocation(p);
		System.out.println(p.x);
	}

	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
