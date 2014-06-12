import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.applet.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

import javax.swing.JPanel;


class DrawingCanvas extends Canvas implements MouseListener, MouseMotionListener{
	int x1, x2;
	int y1, y2;
	int R, G, B;
	ArrayList shapes = new ArrayList();
	int width;
	int height;
	private BufferedImage bImage;
    Graphics bfg;
    Color bgcolor = new Color(255,255,255);
    private Image offImage;
	
	public DrawingCanvas(int w, int h){
		width = w;
		height = h;
		offImage = createImage(width, height);
		bImage = new BufferedImage(width, height,
	            BufferedImage.TYPE_INT_RGB);
		bImage.setRGB(255, 255, 255);
		 setPreferredSize(new Dimension(width,height));
         bfg = bImage.createGraphics();
         bfg.setColor(bgcolor);
         bfg.fillRect(0, 0, width, height);
         
		setSize(width,height);
		setLocation(new Point(0,0));
		setBackground(Color.white);
		addMouseMotionListener(this);
	    addMouseListener(this);
	    
	}
	
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		arg0.consume();
		
		drawLine(x1,y1,arg0.getX(),arg0.getY());
		
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
		
		//TODO: ƒ}ƒEƒX‚ª‰Ÿ‚³‚ê‚½Žž‚Ìˆ—‚ð‘‚¢‚Ä‚­‚¾‚³‚¢
		if ((arg0.getModifiers() & MouseEvent.BUTTON1_MASK) != 0) {
			x1 = x2 = arg0.getX();
			y1 = y2 = arg0.getY();
			drawLine(x1,y1,x1,y1);
			paint(getGraphics());
		}
		if ((arg0.getModifiers() & MouseEvent.BUTTON2_MASK) != 0) {
			//’†‰›

		}
		if ((arg0.getModifiers() & MouseEvent.BUTTON3_MASK) != 0) {
			BufferedImage image = (BufferedImage) this.createImage(this.width,this.height);
			if (bImage != null) {
//	            g2 = offImg.createGraphics();
//	            g2.setBackground(getBackground());
				int color = bImage.getRGB(arg0.getX(),arg0.getY());
				
				if(color>=0){
					B = color/0x10000;
					G = (color/0x100) & 0xFF;
					R = color & 0xFF;
				}else{
					B = 255; G=255; R=255;
				}
				
				System.out.println("P("+arg0.getX()+","+arg0.getY()+") color:"+color +"=RGB(" + R+","+G+","+B+")");
	        }
			

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
		shapes.add(newLine);
		paint(getGraphics());
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void paint(Graphics g){
		
        g.drawImage(offImage, 0, 0, width, height, this);
        
		int number = shapes.size();
		for (int i = 0; i < number; i++){
			VecLine data = (VecLine) shapes.get(i);
			g.setColor(data.getColor());
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(data.getWidth()));
			g2.drawLine(data.x1, data.y1, data.x2, data.y2);
		}
		
		repaint();
	}
	public void update(Graphics g)
	{
		paint(g);
	}

}
