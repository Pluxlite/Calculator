import java.util.Scanner;
//Scanner = for keyboard use

public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // get input from keyboard 
		
		int option = 0;
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("input number for calculation option\n1: Addition\n2: Subtration\n3: Mutliply\n4: Divide");
		option = input.nextInt();// setting option from the switch
		
		System.out.println("Enter first number");
		num1 = input.nextInt();// getting number from keyboard
		
		System.out.println("Enter second number");
		num2 = input.nextInt();
		
		switch(option){
		case 1: System.out.println(num1 + num2);
		break;
		case 2: System.out.println(num1 - num2);
		break;
		case 3: System.out.println(num1 * num2);
		break;
		case 4: System.out.println(num1 / num2);
		}
		
		}

}
