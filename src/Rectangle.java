
public class Rectangle {
	String order;
	double length;
	double height;

	public Rectangle(String ord, double len, double hgt) {
		this.order = ord;
		this.length = len;
		this.height = hgt;
	}

	double rectanglePerimeter() {
		return 2 * this.length + 2 * this.height;
	}

	double rectangleArea() {
		return this.length * this.height / 2;
	}

}
