import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * Adam Atienza
 * 
 * Triangle class creates the shape of a triangle using the
 * instance variable of a side length
 */
public class Triangle extends Shape {
	
	private int sideLength;
	private Color myColor;
	
	/*
	 * Triangle constructor that uses shape class
	 */
	public Triangle(int x, int y, int sl, Color c){
		super(x, y); 
		setSideLength(sl);
		setColor(c);
		
	}
	
	/**
     * setSideLength()
     * ----------
     * This sets the side length of the triangle
     * PRECONDITION: sideLength should be smaller than the width of the JFrame that the star is to be drawn inside
     *               or else it might not be visible.
     *               sideLength needs also to be greater than 0.
     */
	public void setSideLength(int sl){
		this.sideLength = sl;
	}
	
	/**
     * getSideLegth()
     * ----------
     * This returns the side length of the triangle.
     */
	public int getSideLength(){
		return sideLength;
	}
	
	/**
     * setColor()
     * ----------
     * This sets the color using a Color object from the java.awt.Color class
     */
	public void setColor(Color c){
		this.myColor = c;
	}
	
	/**
     * getArea()
     * ---------
     * This returns a the exact area of the triangle.
     */
	 public double getArea() {
    	 return (Math.sqrt(3)/4) * (double) sideLength;
     }
	 
	/*
	 * Overrides draw method to draw triangle
	 */
	public void draw(Graphics g) {
			
		int[] xCoords = {getX(), (getX() + (getSideLength()/2)), getX() + getSideLength()}; 
		//array with x values for triangle 
		
		int[] yCoords = {getY(), (getY() - getSideLength()), getY()};
		//array with y values for triangle
		
		g.setColor(myColor); //set the color
		g.fillPolygon(xCoords, yCoords, 3); //draw and fill
		
	}
	
}