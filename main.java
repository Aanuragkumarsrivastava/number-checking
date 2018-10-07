import java.util.Scanner;

//checking sum of first two entered number is same as third number

public class Main 
{
  
	public static void main(String[] args) 
	{  
  
		Scanner input = new Scanner(System.in);
  
		System.out.println("enter first number");
  
		int a = input.nextInt();
  //taking the first number as input
		System.out.println("enter the second number");
  
		int b= input.nextInt();
  //taking the second number as input
		System.out.println("enter the third number");
  
		int c = input.nextInt();
  //taking the third number as input
		int d= a+b;
 //adding first and second number and saving the value in a variable d 
		if(c==d)
  //now we are checking the sum of first two numbers are equal to third number or not
			System.out.println("sum of "+a+" and "+b+" is same as third number "+c);
  
		else
  
			System.out.println("not equal");  
  
	
}

}
