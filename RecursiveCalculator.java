import java.util.Scanner;

public class RecursiveCalculator  {


public static void main(String[]args) {
		
		long num1=0;
		long num2=0;
		long answer=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter numbers one at a time. If looking for factorial or Fibonacci, enter -0 for your second integer");
		num1=input.nextLong();
		num2=input.nextLong();
	
		if(num2!=-0) {
			System.out.println("Enter +, -, /, or *");
				char operator=input.next().charAt(0);
				
				if(operator=='+') {
					answer=num1+num2;
				}
				else if(operator=='-') {
					answer=num1-num2;
				}
				else if(operator=='/') {
					answer=num1/num2;
				}
				else if(operator=='*') {
					answer=num1*num2;
				}
				
				System.out.println(num1+" "+operator+" "+num2+" = "+answer);
				
		}
		else {
			System.out.println("Enter 'f' for factorial or 'F' for Fibonacci");
				char operator=input.next().charAt(0);
				
			
				if(operator=='f') {
					answer= (int)(factorial(num1));
					System.out.println(num1+" factorial is "+answer);
				}
				else if(operator=='F') {
					answer= Fibonacci(num1);
					System.out.println("The Fibonacci number for "+num1+" is "+answer);
				}
				
			
				
			
		}
	}

public static int Fibonacci(long num1) {
	if(num1==0) {
		return 0;
	}
	else if(num1==1) {
		return 1;
	}
	else {
		return Fibonacci(num1-1)+Fibonacci(num1-2);
	}
}

	public static int factorial(long num1) {
		
		
		if (num1==1) {
			return 1;
		}
		else {
			return (int) (num1*factorial(num1-1));
		}
	}
}
		
	