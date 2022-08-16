import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * Adam Atienza
 * 
 * Chess class creates a chess board in the draw method.
 * 
 */
public class Chess extends Shape{

	private Color myColor;
	
	/*
	 * Constructor that utilizes super constructor 
	 */
	public Chess(int x, int y, Color c){
		super(x, y); 
		setColor(c);
	}

	/**
     * getArea()
     * ---------
     * This returns a the area of the chess board.
     */
	 public double getArea() {
    	 return 64.0;
     }
     
	/**
     * setColor()
     * ----------
     * This sets the color using a Color object from the java.awt.Color class
     */
    public void setColor(Color c){ this.myColor = c; }
    
    /**
     * getColor()
     * ----------
     * This returns the color of the star as a Color object from the java.awt.Color class
     */
    public Color getColor(){ return this.myColor;  }
	
	/*
	 * Overrides draw method to draw a chess board.
	 */
	public void draw(Graphics g) {
		int x, y;
		
        for (int row = 0; row <= 8; row++) {
 
            for (int col = 0; col <= 8; col++) {
 
                // Set x coordinates of rectangle
                // by 20 times
                x =  row * 20;
 
                // Set y coordinates of rectangle
                // by 20 times
                y = col * 20;
 
                // Check whether row and column
                // are in even position
                // If it is true set Black color
                if ((row % 2 == 0) == (col % 2 == 0))
                    g.setColor(myColor);
                else
                    g.setColor(Color.WHITE);
 
                // Create a rectangle with
                // length and breadth of 20
                g.fillRect(x, y, 20, 20);
            }
        }
		
	}
}
