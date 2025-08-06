import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Program {
	public static int targetWeek = 1;
	public static int maxWeek = 18;

	public static int getMinNote(String weekNotes)
	{
		String[] notes = weekNotes.split(" ");
		if (notes.length != 5)
			return -1;
		int min = 10;
		for (String note : notes)
		{
			int grade = Integer.parseInt(note);
			if (grade < 1 || grade > 9)
				return -1;
			if (grade < min)
				min = grade;
		}
		return min;
	}

	public static void visual(int i, Map<Integer, Integer> weekMins){
		System.out.print("Week ");
		int num = weekMins.get(i);
		System.out.print(num + " ");
		for (int k = 0; k < num; k++){
			System.out.print("=");
		}
		System.out.println(">");
	}
	public static void main(String[] args){
		Map<Integer, Integer> weekMins = new HashMap<>();
		
		Scanner scanner = new Scanner(System.in);
		while (true)
		{
			System.out.print("-> ");
			if (!scanner.hasNextLine() && !scanner.hasNextInt())
				return;
			String week = scanner.nextLine().trim();
			if (week.equals("42")){
				break;
			}
			if (!week.matches("Week \\d+")){
				System.err.println("Invalid Input");
				return;
			}
			int weekNum = Integer.parseInt(week.split(" ")[1]);
			if (weekNum != targetWeek){
				scanner.close();
				System.err.println("IllegalArgument");
				System.exit(-1);
			}
			System.out.print("-> ");
			String weekNotes = scanner.nextLine().trim();
			int minNote = getMinNote(weekNotes);
			if (minNote == -1){
				scanner.close();
				System.err.println("InvalidArgument");
				System.exit(-1);
			}
			weekMins.put(weekNum, minNote);

			if (weekNum == maxWeek)
				break;
			targetWeek++;
		}
		for (int i = 1; i <= weekMins.size(); i++)
			visual(i, weekMins);
		scanner.close();
	}	
}
