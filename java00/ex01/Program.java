import java.util.Scanner;

public class Program {

	public static boolean isInteger(Scanner scanner){
		return scanner.hasNextInt();
	}

	public static void isPrime(int input){
		int steps = 1;
		for (int i = 2; i * i <= input; i++){
			if (input % i == 0){
				System.out.println("false" + " " + steps);
				return;
			}
			steps++;
		}
		System.out.println("true" + " " + steps);
	}

	public static boolean isValidInput(int input){
		return input >= 2;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("-> ");
		if (!isInteger(scanner)){
			System.out.println("Invalid Integer");
			scanner.close();
			System.exit(0);
		}
		int input = scanner.nextInt();
		if (!isValidInput(input)){
			System.out.println("IllegalArgument");
			scanner.close();
			return;
		}
		isPrime(input);
		scanner.close();
	}
}
