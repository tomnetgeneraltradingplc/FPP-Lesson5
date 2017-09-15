package problem1;

public class TestShape {

	public static void main(String[] args) {
		Shape [] shapeList = new Shape[5];
		shapeList[0]=new Rectangle("Red", 10.5, 5.5);
		shapeList[1]=new Circle("Green",100.30);
		shapeList[2]=new Rectangle("Yello", 50, 30);
		shapeList[3]=new Circle("Black", 90);
		shapeList[4]=new Square("Red", 1.5);

		printTotal(shapeList);
		
	}
public static void printTotal(Shape[] shapes){
	
		double totalArea=0.0;
		double totalPerimeter=0.0;
		for (Shape shape : shapes) {
		totalArea += shape.calculateArea();
		totalPerimeter +=shape.calculatePerimeter();
		
	}
	System.out.println("Total Area is: " + (double) Math.round(totalArea*100)/100);
	System.out.println("Total Perimeter is: " + (double) Math.round(totalPerimeter*100)/100);
}
}
