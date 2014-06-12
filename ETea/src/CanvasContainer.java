import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.applet.*;
import java.util.Random;
import java.util.Vector;

import javax.swing.*;


public class CanvasContainer extends JApplet implements MouseListener, MouseMotionListener,KeyListener{
	int x1, x2;
	int y1, y2;
	private JLayeredPane pane;
	final private int WIDTH = 1200;
	final private int HEIGHT = 700;
	
	public CanvasContainer(){
		
		
		setBackground(new Color(160,160,160));
		pane = new JLayeredPane();
        pane.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        DrawingCanvas myCanvas = new DrawingCanvas(WIDTH-20,HEIGHT-20);
        pane.add(myCanvas);
        pane.addMouseMotionListener(this);
        
        JLabel label = createColoredLabel("E-Tea",
                new Color(100,100,100),new Point(200,300));
        pane.add(label, new Integer(100));
        
	    Container contentPane = getContentPane();
	    contentPane.add(pane);
	    
	}
	 //Create and set up a colored label.
    private DraggableComponents createColoredLabel(String text,
                                      Color color,
                                      Point origin) {
    	DraggableComponents label = new DraggableComponents(text);
        label.setVerticalAlignment(DraggableComponents.TOP);
        label.setHorizontalAlignment(DraggableComponents.CENTER);
        label.setOpaque(true);
        label.setBackground(color);
        label.setForeground(Color.black);
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        label.setBounds(origin.x, origin.y, 140, 140);
        return label;
    }

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
