import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);

		// Values of each digit
		int hundreds = 0;
		int tens = 0;
		int ones = 0;

		// Prompt user to input two, 3 digit numbers
		System.out.print("Enter a 3 digit number:");
		int number = input.nextInt();

		// Display hundreds place
		hundreds = number / 100;
		System.out.println("Hundreds place digit:" + hundreds);

		// Display tens digit
		tens = (number - hundreds * 100) / 10;
		System.out.println("\nTens place digit:" + tens);

		// Display ones digit
		ones = (number % 10);
		System.out.println("\nOnes place digit:" + ones);

		// Values of each digit
		int hundreds2 = 0;
		int tens2 = 0;
		int ones2 = 0;

		// Prompt user to input two, 3 digit numbers
		System.out.print("Enter another 3 digit number:");
		int number2 = input.nextInt();

		// Display hundreds place
		hundreds2 = number2 / 100;
		System.out.println("Hundreds place digit:" + hundreds2);

		// Display tens digit
		tens2 = (number2 - hundreds2 * 100) / 10;
		System.out.println("\nTens place digit:" + tens2);

		// Display ones digit
		ones2 = (number2 % 10);
		System.out.println("\nOnes place digit:" + ones2);

		Boolean cond = "hundreds + hundreds2 ==  tens + tens2 " == " ones + ones2";
		System.out.println(cond);

		// Values of each digit
		int hundreds3 = 0;
		int tens3 = 0;
		int ones3 = 0;

		// Prompt user to input two, 3 digit numbers
		System.out.print("Enter a 3 digit number:");
		int number3 = input.nextInt();

		// Display hundreds place
		hundreds3 = number3 / 100;
		System.out.println("Hundreds place digit:" + hundreds3);

		// Display tens digit
		tens3 = (number3 - hundreds3 * 100) / 10;
		System.out.println("\nTens place digit:" + tens3);

		// Display ones digit
		ones3 = (number3 % 10);
		System.out.println("\nOnes place digit:" + ones3);

		// Values of each digit
		int hundreds4 = 0;
		int tens4 = 0;
		int ones4 = 0;

		// Prompt user to input two, 3 digit numbers
		System.out.print("Enter another 3 digit number:");
		int number4 = input.nextInt();

		// Display hundreds place
		hundreds4 = number4 / 100;
		System.out.println("Hundreds place digit:" + hundreds4);

		// Display tens digit
		tens4 = (number4 - hundreds4 * 100) / 10;
		System.out.println("\nTens place digit:" + tens4);

		// Display ones digit
		ones4 = (number4 % 10);
		System.out.println("\nOnes place digit:" + ones4);

		Boolean cond2 = "hundreds + hundreds2 ==  tens + tens2 " == " ones + ones2";
		System.out.println(cond2);
		{

		}
	}
}
