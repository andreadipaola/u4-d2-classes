
public class Esercizio1 {
	public static void main(String[] args) {
		Rectangle firstRect = new Rectangle("primo", 12.5, 7.5);
		Rectangle secondRect = new Rectangle("secondo", 7.5, 2.5);
		System.out.println("############################################\n");
		printRectangle(firstRect);
		printRectangle(secondRect);
		System.out.println("############################################\n");
		printTwoRects(firstRect, secondRect);
	}

	public static void printRectangle(Rectangle rect) {
		System.out.println("Il perimetro del " + rect.order + " rettangolo è: " + rect.rectanglePerimeter()
				+ "\nL'area del " + rect.order + " rettangolo è: " + rect.rectangleArea() + "\n");
	}

	public static void printTwoRects(Rectangle rect1, Rectangle rect2) {
		printRectangle(rect1);
		printRectangle(rect2);
		double perimeterSum = rect1.rectanglePerimeter() + rect2.rectanglePerimeter();
		double areaSum = rect1.rectangleArea() + rect2.rectangleArea();
		System.out.println(
				"La somma dei loro perimetri è: " + perimeterSum + "\nLa somma delle loro aree è: " + areaSum + "\n");

	}
}
