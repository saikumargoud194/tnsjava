
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector vec =new Vector<>();
		
		vec.add("RCB");
		vec.add("TT");
		vec.add("GT");
		vec.add("RR");
		
		System.out.println("Vector Elements: "+vec);
		
		vec.remove(1);
		vec.remove(2);

		System.out.println("Vector Elements: "+vec);
		vec.addFirst("CSK");
		System.out.println("Vector Elements: "+vec);
		
	}

}
