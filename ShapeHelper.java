package shapeImplementation;

import java.util.Scanner;

public class ShapeHelper {

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

}
