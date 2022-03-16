package Basiccommands;
import java.util.Scanner;

public class SwapExample {

	public static void main(String[] args) {

	int a;
	int b;
	int temp;
	Scanner s= new Scanner(System.in);
	System.out.println("enter two numbers");
	a= s.nextInt();
	b= s.nextInt();

	System.out.println(" before  swap ="+ a+ "  " + b);
	
 	temp =a;
     a=b;
     b= temp;

    System.out.println(" after  swap ="+ a+ "  " + b);

	}

}
