
public class Rectangle {
	//attributes
	private double width;
	private double height;
	
	//methods
	
	public Rectangle() {
		width = 10;
		height = 10;
	}
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public void setWidth(double w) {
		if (w > 0) {
			width = w;
		} else {
			System.out.println("Width must be positive. Width not set.");
		}
	}
	
	public void setHeight(double h) {
		if (h > 0) {
			height = h;
		} else {
			System.out.println("Height must be positive. Height not set.");
		}
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double calcArea(double w, double h) {
		double area = w * h;
		return area;
	}
	
	public double getArea() {
		double area = width * height;
		return area;
	}
	
	
	
	public String toString() {
		String rectangleInfo = width + "ft by " + height + "ft rectangle";
		return rectangleInfo;
	}
}
