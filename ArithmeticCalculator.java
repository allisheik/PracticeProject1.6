package Calculator;
import java.util.*;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		int a,b,result;
		char operator;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Oparand :");
		a = sc.nextInt();
		System.out.print("Enter Second Oparand :");
		b = sc.nextInt();
		while(true) {
			System.out.println("Choose '+' For Addition");
			System.out.println("Choose '-' For Subtraction");
			System.out.println("Choose '*' For Multiplication");
			System.out.println("Choose '/' For Division");
			System.out.println("Choose '%' For Modular Division");
			System.out.println("Choose '$' For Exit");
			operator = sc.next().charAt(0);
			if(operator == '+') {
				result=a+b;
				System.out.println("Addition of "+a+" and "+b+" is "+result);
			}
			else if(operator == '-') {
				result=a-b;
				System.out.println("Subtraction of "+a+" and "+b+" is "+result);
			}
			else if(operator == '*') {
				result=a*b;
				System.out.println("Multiplication of "+a+" and "+b+" is "+result);
			}
			else if(operator == '/') {
				result=a/b;
				System.out.println("Division of "+a+" and "+b+" is "+result);
			}
			else if(operator == '%') {
				result=a%b;
				System.out.println("Modular Division of "+a+" and "+b+" is "+result);
			}
			else if(operator == '$'){
				break;
			}
			else {
				System.out.println("Choose Correct Choise");
			}
		}
		System.out.println("Thank You");


	}

}
