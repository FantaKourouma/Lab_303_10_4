
public class Rectangle extends Shape implements Movable {
    private double x, y;  // Coordinates of the top-left corner of the rectangle

    // Constructor to initialize rectangle with width, height, position (x, y), and color
    public Rectangle(double width, double height, double x, double y, String color) {
        setWidth(width);
        setHeight(height);
        this.x = x;
        this.y = y;
        setColor(color);  // Set the color using the inherited method from Shape
    }

    // Implement methods from the Movable interface to move the rectangle
    @Override
    public void moveUp() {
        this.y++;  // Move the rectangle up by increasing y-coordinate
    }

    @Override
    public void moveDown() {
        this.y--;  // Move the rectangle down by decreasing y-coordinate
    }

    @Override
    public void moveLeft() {
        this.x--;  // Move the rectangle left by decreasing x-coordinate
    }

    @Override
    public void moveRight() {
        this.x++;  // Move the rectangle right by increasing x-coordinate
    }

    // Return the current coordinates of the rectangle
    @Override
    public String getCoordinate() {
        return "(" + x + ", " + y + ")";
    }

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}

