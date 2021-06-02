
import java.util.*;

public class collectionAssisted {
	
	public static void main(String[] args) {
		
		//Creating ArrayList
		
		System.out.println("ArrayList: ");
		
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Bangalore");
		cities.add("Delhi");
		
		System.out.println(cities);
		
		//Creating Vectors
		
		System.out.println("\n");
		
		System.out.println("Vector: ");
		
		Vector<Integer> vector = new Vector<Integer>();
		
		vector.addElement(15);
		vector.addElement(30);
		
		System.out.println(vector);
		
		//Creating LinkedList
		
		System.out.println("\n");
		
		System.out.println("LinkedList: ");
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Alex");  
	    names.add("John"); 
	    
	    Iterator<String> itr = names.iterator();
	    
	    while(itr.hasNext()) {System.out.println(itr.next());}
	    
	    //Creating HashSet
	    
	    System.out.println("\n");
	    
	    System.out.println("HashSet");
	    
	    HashSet<Integer> hashset = new HashSet<Integer>();
	    
	    hashset.add(101);
	    hashset.add(103);  
	    hashset.add(102);
	    hashset.add(104);
	    
	    System.out.println(hashset);
	    
	    //Creating LinkedHashSet
	    
	    System.out.println("\n");
	    
	    System.out.println("LinkedHashSet");
	    
	    LinkedHashSet<Integer> linkedhashset=new LinkedHashSet<Integer>();  
	    linkedhashset.add(11);  
	    linkedhashset.add(13);  
	    linkedhashset.add(12);
	    linkedhashset.add(14);	       
	    System.out.println(linkedhashset);

	}
}
