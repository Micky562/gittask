package ttn;

import java.util.Scanner;

public class Program 
{
 static Scanner sc=new Scanner(System.in);
 public static void main(String args[])
 {
	 StringBuilder st=new StringBuilder();
	 while(true) 
	 {
        System.out.println("Enter your text");
         st.append(sc.nextLine()); 
         st.append("\n");
         System.out.println("if done please type XDONE else type any anything");
         String s=sc.nextLine();
         if(s.equals("XDONE"))
          break;   
	 }
	 System.out.println("Text enterd by the user");
	 System.out.println(st);
 }
 
}
