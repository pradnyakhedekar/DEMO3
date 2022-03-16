package Basiccommands;
//wap to ask student name and his marks 
//if marks >=90 then print A grade 
//if marks >= 80 then print B grade 
//if marks >= 70 then print C grade 
//if marks >= 60 then print D grade 
//else   print fail

import java.util.Scanner;
public class StudentGrading 
{

	public static void main(String[] args)
	{
		
  String name ;
   int marks ;
   Scanner s= new Scanner(System.in);
   System.out.println("enter name and marks");
   name= s.next(); 
   marks=   s.nextInt();  
    if(marks>=90)    
	  System.out.println(" A grade");
   else if(marks>=80)
	  System.out.println(" b grade");
   else  if(marks>=70)
	  System.out.println(" c grade");
   else  if(marks>=60)
	  System.out.println(" D grade");
  else 
	  System.out.println(" fail");
	}

}
