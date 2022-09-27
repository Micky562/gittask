package code;

public class Program 
{
 public static String FirstName; 
 public static String LastName;
 public static int Age;	
 static //static block will execute first then main method,static block is used to initialize static variable
 {
	 FirstName="Micky";
	 LastName="Kumar";
	 Age=24;
 }
 public static void Display() //static method
 {
	 System.out.println("FirstName: "+ FirstName);
	 System.out.println("LastName: "+LastName);
	 System.out.println("Age: "+Age);
 }
 public static void main(String args[])
 {
	System.out.println("Details are:"); 
	System.out.println("FirstName: "+ FirstName);
	System.out.println("LastName: "+LastName);
	System.out.println("Age: "+Age);
	System.out.println("-------Static method output-----------");
	//below method will call static method Display
	Program.Display();
	Age=30;//Age changes here
	System.out.println("-------------Accessing static variables----------------");
	//we can access static variable using class name directly no need to create object
	System.out.println("FirstName: "+FirstName); //we can also access with variable name because we are in same class 
	System.out.println("LastName: "+Program.LastName);
	System.out.println("Age: "+ Program.Age);
 }
}
