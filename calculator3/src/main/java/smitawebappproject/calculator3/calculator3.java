package smitawebappproject.calculator3;


import java.util.Scanner;

public class calculator3 {
	
	public static int add(int num1,int num2)
	{
		return num1 + num2;
	}
	
	public static int sub(int num1 , int num2)
	{
		return num1 - num2;
	}
	
	public static int mul(int num1 , int num2)
	{
		return num1 * num2;
	}
	
	public static double div(double num1 , double num2)
	{
		/*if (num2 == 0)
				{
			throw new IllegalArgumentException("Number cannot divide by zero")
				}*/
		return num1 / num2;
	}
	


public static void main (String[] args) {
	Scanner sc1 = new Scanner (System.in);
	System.out.println("Enter first number :");
	int input1 = sc1.nextInt();
	
	Scanner sc2 = new Scanner (System.in);
	System.out.println("Enter second number :");
	int input2 = sc2.nextInt();
	
	System.out.println("The Addition is :" + calculator3.add(input1,input2));
	System.out.println("The Subtraction is :" + calculator3.sub(input1,input2));
	System.out.println("The Multiplication is :" + calculator3.mul(input1,input2));
	System.out.println("The Division is :" + calculator3.div(input1,input2));
}

}

