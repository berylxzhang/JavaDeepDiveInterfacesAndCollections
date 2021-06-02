
public class overloadMethod {
	
	public void area(int b, int h) {
		System.out.println("Area of the triangle is " + (0.5*b*h));
	}
	
	public void area(int r) {
		System.out.println("Area of the Circle is " + (3.14*r*r));
	}
	
	public static void main(String[] args) {
		overloadMethod om = new overloadMethod();
		
		om.area(10,12);
		om.area(5);
	}
}
