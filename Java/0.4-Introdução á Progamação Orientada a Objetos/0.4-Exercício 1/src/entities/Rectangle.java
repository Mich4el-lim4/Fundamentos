package entities;

public class Rectangle {

	public double width;
	public double heigt;
	
	public double area() {
		return this.width * this.heigt;
	}
	
	public double perimeter() {
		return 2 * (this.heigt + this.width);
	}
	
}
