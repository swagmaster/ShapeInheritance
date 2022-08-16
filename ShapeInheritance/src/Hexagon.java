

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * Adam Atienza
 * 
 * Hexagon class creates the shape of a hexagon using the
 * instance variable of a side length
 */
public class Hexagon extends Shape {
	
	private int sideLength;
	private Color myColor;
	
	/*
	 * Constructor that takes in x, y, and sideLengths but without color.
	 */
	public Hexagon(int x, int y, int sideLength){
        super(x,y);
        this.sideLength = sideLength;
        this.myColor = Color.RED;
        
    }
	
	/*
	 * Constructor that utilizes super constructor 
	 */
	public Hexagon(int x, int y, int sideLength, Color c){
		super(x, y); 
		setSideLength(sideLength);
		setColor(c);
		
	}

	/**
     * getArea()
     * ---------
     * This returns a the area of the hexagon.
     */
	 public double getArea() {
    	 return (((double) 3 * Math.sqrt(3))/2) * ((double) sideLength * (double) sideLength);
     }
     
	 /**
	     * setSideLength()
	     * ----------
	     * This sets the side length of the hexagon;
	     * PRECONDITION: sideLength should be smaller than the width of the JFrame that the star is to be drawn inside
	     *               or else it might not be visible.
	     *               sideLength needs also to be greater than 0.
	     */
     public void setSideLength(int sideLength) {
    	 this.sideLength = sideLength;
     }
     
     /**
      * getSideLength()
      * ----------
      * This returns the side length of the hexagon.
      */
     public int getSideLength() {
    	 return this.sideLength;
    	 
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
	 * Overrides draw method to draw a hexagon
	 */
	public void draw(Graphics g) {

		int[] xCoords = {
				getX(),
				getX() + getSideLength(),
				getX() + getSideLength() + (getSideLength()/2),
				getX() + getSideLength(),
				getX(),
				getX() - (getSideLength()/2)		
			};

		int[] yCoords = {		 
				getY(),
				getY(),
				getY() + getSideLength(),
				getY() + (2 * getSideLength()),
				getY() + (2 * getSideLength()),
				getY() + getSideLength()
		};
		
		g.setColor(myColor); 
		g.fillPolygon(xCoords, yCoords, 6); //draw and fill 
			
		}
	
}