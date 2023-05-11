//implementing regular expressions

package assistedPracticeProject;
import java.util.regex.*; //importing classes
public class Practice_Project10 
{
	public static void main(String args[])
	{
		String pattern = ".ava";  //pattern to check
		String check = "Java"; //string on which pattern to be checked
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		boolean b=c.matches(); //checking if match found or not
		//returns a boolean result and stores in b
		System.out.println("MATCH FOUND = "+b);
		
		String pattern1 = "[.ava]";
		String check1 = "amn";
		Pattern p1 = Pattern.compile(pattern1);
		Matcher c1 = p1.matcher(check1);
		boolean b1=c1.matches();
		System.out.println("MATCH FOUND = "+b1);
		
		
	}
}
