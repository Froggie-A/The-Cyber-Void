import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;

public class Draggable extends MouseAdapter {
	
	    private final JComponent label;
	    private final int minX, minY, maxX, maxY;
	    private Point initialClick;
	    private static boolean inPositionSnake,inPositionWing,inPositionHorn,inPositionClaw,inPositionMice;

	    public Draggable(JComponent label, int minX, int minY, int maxX, int maxY, String name) {
	        this.label = label;
	        this.minX = minX;
	        this.minY = minY;
	        this.maxX = maxX;
	        this.maxY = maxY;
	        this.label.setName(name);
	    }
	    @Override
	    public void mousePressed(MouseEvent e) {
	        initialClick = e.getPoint();
	        label.getComponentAt(initialClick);
	    }

	    @Override
	    public void mouseDragged(MouseEvent e) {
	        JComponent label = (JComponent) e.getSource();
	        Point location = label.getLocation();

	        int xMoved = e.getX() - initialClick.x;
	        int yMoved = e.getY() - initialClick.y;

	        int x = location.x + xMoved;
	        int y = location.y + yMoved;

	        if (x < minX)
	        	x = minX;
	        if (y < minY) 
	        	y = minY;
	        if (x > maxX)
	        	x = maxX;
	        if (y > maxY)
	        	y = maxY;

	        label.setLocation(x, y);
	        
	        if(label.getName() == "snakes") {
	        	if(label.getX() > 210 && label.getX() <260) {
	        		inPositionSnake = true;
	        	}
	        	else {
	        		inPositionSnake = false;
	        	}
	        }

	        if(label.getName() == "wings") {
	        	if(label.getX() > 70 && label.getX() <130) {
	        		inPositionWing = true;
	        	}
	        	else {
	        		inPositionWing = false;
	        	}
	        }
	        
	        if(label.getName() == "horns") {
	        	if(label.getX() > 380 && label.getX() <430) {
	        	
	        		inPositionHorn = true;
	        	}
	        	else {
	        		inPositionHorn = false;
	        	}
	        }
	        
	        if(label.getName() == "claws") {
	        	if(label.getX() > 700 && label.getX() <750) {
	        	
	        		inPositionClaw = true;
	        	}
	        	else {
	        		inPositionClaw = false;
	        	}
	        }
	        
	        if(label.getName() == "mice") {
	        	if(label.getX() > 530 && label.getX() <580) {
	        		
	        		inPositionMice = true;
	        	}
	        	else {
	        		inPositionMice = false;
	        	}
	        }
	    }
	    
	   public static boolean getPositionSnake() {
		   return inPositionSnake;
	   }
	   
	   public static boolean getPositionWing() {
		   return inPositionWing;
	   }
	   
	   public static boolean getPositionHorn() {
		   return inPositionHorn;
	   }
	   
	   public static boolean getPositionClaw() {
		   return inPositionClaw;
	   }
	   
	   public static boolean getPositionMice() {
		   return inPositionMice;
	   }
	    
}
