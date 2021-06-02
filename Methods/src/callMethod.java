public class callMethod {
	
	int value = 150;
	
	int operation(int value) {
		
		value = value*10/100;
		
		return value;
	
	}
	
	public static void main(String[] args){
		
		callMethod cm = new callMethod();
		
		System.out.println("Before the operation the value is " + cm.value);
		
		cm.operation(10);
		
		System.out.println("After the operation the value is " + cm.value);
	}
}
