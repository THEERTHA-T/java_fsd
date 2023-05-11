//implementation of maps

package assistedPracticeProject;
import java.util.*; //importing classes

public class Practice_Project6 
{
	public static void main(String args[])
    {
        // Creating HashMap
        Map<String, Integer> hm= new HashMap<String, Integer>();
        System.out.println("\n---ASCII TABLE--\n");
        // using put() method inserting items
        hm.put("A", new Integer(65));
        hm.put("B", new Integer(66));
        hm.put("C", new Integer(67));
        hm.put("D", new Integer(68));
       
          for (Map.Entry<String, Integer> pp1 : hm.entrySet()) //iterate
          {
              System.out.print(pp1.getKey() + ":"); //displaying keys
            System.out.println(pp1.getValue());//displaying values
        }
          
       // Creating  LinkedHashMap
          Map<String, Integer> lhm = new LinkedHashMap<>();
          System.out.println("\n---NUMBERS--\n");
          // Inserting using put()
          lhm.put("ONE", 1);
          lhm.put("TWO", 2);
          lhm.put("THREE",3);
          lhm.put("FOUR", 4);
    
          // Iterating
          for (Map.Entry<String, Integer> i : lhm.entrySet())
    
         // Printing key-value 
          System.out.println(i.getKey() + " " + i.getValue());
      
    }

}
