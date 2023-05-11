//implementing encapsulation

package assistedPracticeProject2;
class employee 
{
	private String empname; //private variable
	public void read(String ename)
	{
		this.empname=ename; //read name
	}
	public String disp()
	{
		return empname; //display name
	}
}

 class Practice_Project8_5 
 {
	public static void main(String[] args) 
	{
		employee e=new employee(); //creating object for employee class
		e.read("Manu"); //passing value
		System.out.println("NAME OF THE EMPLOYEE = "+e.disp()); //printing name
	}

}
