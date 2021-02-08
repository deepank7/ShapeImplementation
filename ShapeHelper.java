package shapeImplementation;

import java.util.Scanner;

public class ShapeHelper extends Shape{

	public static Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equals("circle")){
	         return new Circle();
	         
	      } else if(shapeType.equals("rectangle")){
	         return new Rectangle();
	         
	      } else if(shapeType.equals("triangle")){
	         return new Triangle();
	      }
	      
	      return null;
	   }
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		Shape s =  ShapeHelper.getShape(str);
		s.getArea();	
		s.getPerimeter();
	}

	@Override
	public void getArea() {}

	@Override
	public void getPerimeter() {}

}
