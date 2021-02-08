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
	}

}
