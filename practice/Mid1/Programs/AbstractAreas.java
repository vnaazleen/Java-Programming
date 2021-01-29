abstract class Figure {
    double a, b;
    Figure(double i, double j) {
        a = i;
        b = j;
    }

    abstract double area();
}

class Rectangle extends Figure {

	Rectangle(double i, double j) {
        super(i, j);
    }

    public double area() {
		return a * b;
	}

}

class Triangle extends Figure {

    Triangle(double i, double j) {
        super(i, j);
    }
    
    public double area() {
		return (a * b) / 2;
	}

}

public class AbstractAreas {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(9, 5);
        Triangle tri = new Triangle(10, 8);

        System.out.println("Area is:" + rect.area());
        System.out.println("Area is:" + tri.area());
    }

    /*
    Area is: 45.0
    Area is: 40.0
    */
}
