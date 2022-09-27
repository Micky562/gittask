package ttn;

public class Employee
{
	  public String FirstName;
	  public String LastName;
	  public int Age;
	  public String Designation;
	  
	  Employee()  //initializing using default constructor
	  {
		 FirstName="sam";
		 LastName="john";
		 Age=32;
		 Designation="CEO";
	  }
	  public void Display()
	  {
		  System.out.println("FirstName: "+FirstName);
		  System.out.println("LastName: "+LastName);
		  System.out.println("Age: "+Age);
		  System.out.println("Designation: "+Designation);
	  }
	  //initializing using parameterized constructor
     Employee(String FirstName,String LastName,int Age,String Designation)
     {
    	this.FirstName=FirstName;
    	this.LastName=LastName;
    	this.Age=Age;
    	this.Designation=Designation;	
     }
     public void Setter()
     {
    	 this.Age=40;
     }
     public String toString() //toString override
     {
    	 return "FirstName: "+FirstName +" LastName: "+LastName;
     }
	public static void main(String[] args) 
	{
	  Employee emp=new Employee();
	  emp.Display();//print values initialized by default constructor
	  Employee emp1=new Employee("Nitin","john",36,"Chairman");
	  emp1.Display(); //print values initialized by parameterized constructor
      emp1.Setter(); //Age will be updated using Setter method
      emp1.Display();
      System.out.println(emp);
	}

}