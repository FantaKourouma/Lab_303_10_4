
public class Triangle extends Shape implements Movable {
    private double x, y;  // Coordinates of the top-left corner of the triangle

    // Constructor to initialize triangle with base, height, position (x, y), and color
    public Triangle(double base, double height, double x, double y, String color) {
        setBase(base);
        setHeight(height);
        this.x = x;
        this.y = y;
        setColor(color);  // Set the color using the inherited method from Shape
    }

    // Implement methods from the Movable interface to move the triangle
    @Override
    public void moveUp() {
        this.y++;  // Move the triangle up by increasing y-coordinate
    }

    @Override
    public void moveDown() {
        this.y--;  // Move the triangle down by decreasing y-coordinate
    }

    @Override
    public void moveLeft() {
        this.x--;  // Move the triangle left by decreasing x-coordinate
    }

    @Override
    public void moveRight() {
        this.x++;  // Move the triangle right by increasing x-coordinate
    }

    // Return the current coordinates of the triangle
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

