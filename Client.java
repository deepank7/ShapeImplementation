package shapeImplementation;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		Shape s =  ShapeHelper.getShape(str);
		s.getArea();	
		s.getPerimeter();
		
// 		We do not want to give access for directly creating the instance of Rectangle class (Encapsulation).	
//		Shape so = new Rectangle();
//		so.getArea();
//		so.getPerimeter();
		
//		Not possible to create an instance of an abstract class.
//		Shape so = new Shape();
//		so.getPerimeter();
//		so.getArea();
	}

}
