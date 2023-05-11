package assistedPracticeProject2;

public class Practice_Project5_2 
{
	void disp(int num1,int num2) throws ArithmeticException //throws arithmetic expression
        {
            System.out.print("\nThe result is : " + (num1/num2)); //printing result
        }
         public static void main(String[] args)
        {
        	 Practice_Project5_2 p = new Practice_Project5_2(); //create class object
             try
            {
                p.disp(10,5); //invoke 10,5
                p.disp(10,0); //invoke 10,0
            }
            catch(ArithmeticException ae)
            {
                System.out.print("\nError : " +ae); //display exception
            }
        }
    }


