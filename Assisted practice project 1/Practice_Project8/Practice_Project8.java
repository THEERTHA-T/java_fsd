//creating strings and converting to stringbuffer and stringbuilder
package assistedPracticeProject;

public class Practice_Project8 
{
	public static void main(String args[])
	{
		//creating string
		//method 1
		String str=new String("\nWelcome to Java Programming"); //creating string using "new"
		System.out.println(str);
		//method 2
		String str1="Hello World"; 
		System.out.println(str1);
		
		//conversion of string to StringBuffer
		
		System.out.println("\n---STRING BUFFER---\n");
		//creating stringbuffer object
		StringBuffer sb=new StringBuffer();
		//appending string
		sb.append(str);
		System.out.println("CONVERION OF STRING TO STRING BUFFER : "+sb);
		
		//conversion of string to StringBuilder
		
		System.out.println("\n---STRING BUILDER---\n");
		//creating string builder 
		StringBuilder sbb=new StringBuilder();
		sbb.append(str1); //adding string
		System.out.println("CONVERION OF STRING TO STRING BUILDER :\n"+sbb);
		
		
		
		
	}
}
