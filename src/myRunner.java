
public class myRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(1, 2, 2);
	    System.out.println("Area of Circle " + c1.getArea());
	    System.out.println("Coordinates are " + c1.getCoordinate());

	     c1.moveDown();
	     System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

	       c1.moveRight();
	       System.out.println("After move right, Coordinates are " + c1.getCoordinate());

	       c1.moveUp();
	       System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

	       c1.moveLeft();
	       System.out.println("After move left, Coordinates are " + c1.getCoordinate());
	    
	      // Create a Rectangle instance
	       
	       Rectangle rect1 = new Rectangle(5, 3, 0, 0, "Red");
	       System.out.println("Area of Rectangle: " + rect1.getArea());
	       System.out.println("Coordinates are " + rect1.getCoordinate());

	       rect1.moveDown();
	       System.out.println("After move Down, Coordinates are " + rect1.getCoordinate());

	       rect1.moveRight();
	       System.out.println("After move Right, Coordinates are " + rect1.getCoordinate());

	       rect1.moveUp();
	       System.out.println("After move Up, Coordinates are " + rect1.getCoordinate());

	       rect1.moveLeft();
	       System.out.println("After move Left, Coordinates are " + rect1.getCoordinate());

	       // Create a Triangle instance
	       Triangle tri1 = new Triangle(4, 6, 0, 0, "Blue");
	       System.out.println("Area of Triangle: " + tri1.getArea());
	       System.out.println("Coordinates are " + tri1.getCoordinate());

	       tri1.moveDown();
	       System.out.println("After move Down, Coordinates are " + tri1.getCoordinate());

	       tri1.moveRight();
	       System.out.println("After move Right, Coordinates are " + tri1.getCoordinate());

	       tri1.moveUp();
	       System.out.println("After move Up, Coordinates are " + tri1.getCoordinate());

	       tri1.moveLeft();
	       System.out.println("After move Left, Coordinates are " + tri1.getCoordinate());



	       System.out.println("--------Test Polymorphism-------");
	       Movable c2 = new Circle(5, 10, 200);  // upcast
	       c2.moveUp();
	       System.out.println("After move up , Coordinates are " + c2.getCoordinate());

	       c2.moveLeft();
	       System.out.println("After move Left , Coordinates are " + c2.getCoordinate());
	       
	       // Test Polymorphism with Rectangle
	       Movable m1 = new Rectangle(10, 5, 100, 100, "Green");  // Upcasting
	       m1.moveUp();
	       System.out.println("After move up, Coordinates are " + m1.getCoordinate());

	       m1.moveLeft();
	       System.out.println("After move Left, Coordinates are " + m1.getCoordinate());

	       // Test Polymorphism with Triangle
	       Movable m2 = new Triangle(8, 4, 50, 50, "Yellow");  // Upcasting
	       m2.moveDown();
	       System.out.println("After move down, Coordinates are " + m2.getCoordinate());

	       m2.moveRight();
	       System.out.println("After move right, Coordinates are " + m2.getCoordinate());
	     }
	

}
