 

import java.util.HashSet;

public class HashsetDemo {

    public static void main(String[] args) {
      
        HashSet<Object> hset = new HashSet<>();

      
        hset.add(44);
        hset.add("Saikumar");
        hset.add(22);
        hset.add("Vamshi");
        hset.add("VamshiBittu");

        
        System.out.println("HashSet elements: " + hset);

        
        hset.remove(22);

         
        System.out.println("HashSet contains 'Saikumar': " + hset.contains("Saikumar"));
 
        System.out.println("Updated HashSet: " + hset);
    }
}
