//Program to check pass or fail

package Basiccommands;
import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		String result;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your marks");
		marks= s.nextInt();
		result= marks>= 40 ? "Pass" : "Fail";
		System.out.println(result);
	}

}
