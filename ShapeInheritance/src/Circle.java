import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * Adam Atienza
 * 
 * Circle class uses the shape class to draw either
 * a half or full circle.
 */
public class Circle extends Shape {
	
	private double radius;
	private Color firstColor;
	private Color secondColor;
	private String portion = "";
	 
	/*
	 * Constructor that uses shape superclass
	 */
	public Circle(int newX, int newY, int rad, Color one, Color two, String in){
		super(newX, newY); 
		setRadius(rad);
		setColor(one, two);
		setString(in);
	}
	
	/**
	 * getRadius()
	 * ------
	 * This returns the circle's radius.
	 */
	public double getRadius(){
		return radius;
	}
	
	/**
	 * setRadius()
	 * ------
	 * This sets the circle's radius.
	 * PRECONDITION: radius should not be negative, and should be less than the width of the enclosing JFrame
	 */
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	/**
     * setColor()
     * ----------
     * This sets the color using a Color object from the java.awt.Color class
     */
	public void setColor (Color one, Color two){
		this.firstColor = one; 
		this.secondColor = two; 
	}
	
	/**
     * setString()
     * ----------
     * This will determine if a half or full circle is drawn.
     */
	public void setString(String input) {
		this.portion = input;
	}
	
	/**
     * getArea()
     * ---------
     * This returns a the exact area of the triangle.
     */
	 public double getArea() {
    	 return (Math.PI*(radius*radius));
     }
	
	@Override
	/*
	 * This method overrides the Shape class draw method
	 * 
	 */
	public void draw(Graphics g) {
			
		if (portion.equals("half")){ //if the circle has been specified to half circle
			g.setColor(firstColor); 
			g.fillOval(getX(), getY(), (int)getRadius(), (int)getRadius()); 
			g.setColor(secondColor); //sets the second color
			g.setClip(getX(), getY(), (int)getRadius(), (int)(getRadius()/1.7));
			g.fillOval(getX(), getY(), (int)getRadius(), (int)getRadius());
			
		} else { 
			g.setColor(firstColor); 
			g.fillOval(getX(), getY(), (int)getRadius(), (int)getRadius());		
			
		}
		
	}
}