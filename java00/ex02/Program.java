import java.util.Scanner;

class Program{
	public static int sumInput(int input){
		int result = 0;
		while (input > 0){
			result += input % 10;
			input /= 10;
		}
		return result;
	}

	public static boolean  isPrime(int sum){
		if (sum < 2)
			return false;
		for (int i = 2; i * i <= sum; i++){
			if (sum % i == 0)
				return false;
		}
		return true;
	}
	public static boolean isQuery(int input){
		int sum = sumInput(input);
		return isPrime(sum);
	}
	public static void main(String[] args){
		int queryCount = 0;
		Scanner scanner = new Scanner(System.in);
		while (true){
			System.out.print("-> ");
			if (!scanner.hasNextInt()){
				scanner.close();
				return;
			}
			int input = scanner.nextInt();
			if (input == 42)
				break;
			if (isQuery(input))
				queryCount++;
		}
		System.out.println("Count of coffee-request : " + queryCount);
		scanner.close();	
	}
}