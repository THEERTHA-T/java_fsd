package rentmycam.io;

//importing scanner class
import java.util.Scanner;

//main camera class
public class CameraMain 
{
	//create object for myCamera
	MyCamera cam2=new MyCamera();
	
	//creating Scanner object
	Scanner sc=new Scanner(System.in);
	
	public void login()
	{
		//initially set user name and password to null
		String user_name=" ";
		String password=" ";
		
		System.out.println("\n+--------------------------------------+");
		System.out.println("| WELCOME TO CAMERA RENTAL APPLICATION |");
		System.out.println("+--------------------------------------+");
		
		System.out.println("\n***Please Login to Continue***");
		
		//read user name from user
		System.out.print("\nEnter your username : ");
		user_name=sc.nextLine();
		
		//read password from user
		System.out.print("\nEnter your password : ");
		password=sc.nextLine();

		//displaying login details
		System.out.println("\nHAI "+user_name.toUpperCase()+"..!! WELCOME TO CAMERA RENTAL APP");
		
		//go to menu section
		//invoke method in class myCamera
		cam2.menu();

	}	
	
	public static void main(String[] args)
	{
		//object for main class
		CameraMain camMain=new CameraMain();
		//invoke login() from main method
		camMain.login(); 
	}
}
