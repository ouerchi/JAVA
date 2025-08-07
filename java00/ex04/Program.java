import java.util.Scanner;
// not done yet
public class Program {

	public static void sortFreq(int[] freq, char[] letters){
		for (int i = 0; i < 25; i++){
			for (int j = i + 1; j < 26; j++){
				if (freq[j] > freq[i]){
					int tempFreq = freq[i];
					freq[i] = freq[j];
					freq[j] = tempFreq;
					char tempLetter = letters[i];
					letters[i] = letters[j];
					letters[j] = tempLetter;
				}
			}
		}
	}

	public static void printFreq(int[] freq, char[] letters){
		
		int maxFreq = freq[0];

		int numFreq = 0;
		for (int i = 0; i < freq.length; i++){
			if (freq[i] > 0)
				numFreq++;
		}
		for (int i = 0; i < numFreq; i++){
			System.out.println(freq[i]);
			
			for (int j = 0; j < (freq[i] / 4); j++){
				System.out.println("#");
			}
			if (i < numFreq - 1)
				System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] freq = new int[26];
		char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		Scanner scanner = new Scanner(System.in);
		System.out.print("-> ");
		if (!scanner.hasNextLine()){
			scanner.close();
			return;
		}

		char[] characters = scanner.nextLine().toCharArray();
		for (char character : characters){
			if (character >= 'a' && character <= 'z')
				freq[(int)(character - 'a')]++;
			else if (character >= 'A' && character <= 'Z')
				freq[(int)(character - 'A')]++;
		}
		sortFreq(freq, letters);
		printFreq(freq, letters);
		scanner.close();
	}
}
