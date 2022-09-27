package ttn;

import java.util.Scanner;

public class Program 
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
      System.out.println("Enter the radius of circle");	
      int radius=sc.nextInt();
      while(true) 
      {
        System.out.println("1.Calculate Area of Circle");
        System.out.println("2.Calculate Circumference of a Circle");
        System.out.println("3.Exit");
        System.out.println("Enter your option");
        int option =sc.nextInt();
        switch(option)
        {
        case 1:
        	Area(radius);
        	break;
        case 2:
        	Circumference(radius);
            break;
        case 3:
        	 return;
        default:
        	System.out.println("wrong choice!");
        	break;	
        }
      }
      
	}
	public static void Area(int radius)
	{
		System.out.println("Area of circle :"+(22/7)*radius*radius);
	}
	public static void Circumference(int radius)
	{
		System.out.println("Circumference of circle :"+2*(22/7)*radius);
	}

}
