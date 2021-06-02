
public class methodExecution {
	
public int multiplynumbers(int a, int b) {
	
	int z = a*b;
	
	return z;
}

public static void main(String[] args) {
	
	methodExecution me = new methodExecution();
	
	int out = me.multiplynumbers(2, 3);
			
	System.out.println("Multiplication result is " + out);
}

}
