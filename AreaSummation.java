package shapeImplementation;

public class AreaSummation {

	public static int biggerArea (Rectangle obj1, Rectangle obj2) {
		int length = obj1.length + obj2.length;
		int breadth = obj1.breadth + obj2.breadth;
		int area = length * breadth;
		return area;
	}
	
	public static void main(String[] args) {
		Rectangle s2 = new Rectangle();
		s2.breadth = 10;
		s2.length = 5;
		
		Rectangle s4 = new Rectangle();
		s4.length = 3;
		s4.breadth = 6;
		
		System.out.println(biggerArea(s2, s4));
	}

}
