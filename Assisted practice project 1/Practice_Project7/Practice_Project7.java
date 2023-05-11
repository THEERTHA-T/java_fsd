package assistedPracticeProject;
class Outer_class //outer class
{
   private int m=4;
   private int n=10;
   public int display()
   {
	   System.out.println("---OUTER CLASS---");
	   return m;
   }
   public class Inner_class    // inner class
   {
      public int display() {
         System.out.println("\n---INNER CLASS---");
         return n;
      }
   }
}
public class Practice_Project7
{
	   public static void main(String args[]) {
	      // Instantiating  outer class
	      Outer_class outer = new Outer_class();
	      System.out.println("NUMBER = "+outer.display());
	      // Instantiating  inner class
	      Outer_class.Inner_class inner = outer.new Inner_class();
	      System.out.println("NUMBER = "+inner.display());
	   }
	}