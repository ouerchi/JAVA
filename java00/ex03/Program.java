
import java.util.LinkedList;
import java.util.Scanner;

class Program{

    public static void main(String[] args){
        int nextWeek = 1;
        LinkedList<Integer> note = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            if (nextWeek > 18){
                break;
            }
            System.out.print("-> ");
            String input = sc.nextLine();
            if (input.equals("42")){
                sc.close();
                break;
            }
            String[] parts = input.split(" ");
            if (!parts[0].equals("week")){
                System.out.println("IllegalArgument");
                sc.close();
                System.exit(1);
            }
            int weekNumber = Integer.parseInt(parts[1]);
            if (weekNumber != nextWeek){
                System.out.println("IllegalArgument");
                sc.close();
                System.exit(1);
            }
            nextWeek++;
            System.out.print("-> ");
            String[] notes = sc.nextLine().split(" ");
            int min = 9;
            for (int i = 0; i < 5; i++){
                int eachNote = Integer.parseInt(notes[i]);
                if (eachNote < min)
                    min = eachNote;
            }
            note.add(min);
        }
        for (int i = 0; i < note.size(); i++){
            System.out.print("week " + (i + 1) + " ");
            for (int j = 0; j < note.get(i); j++)
                System.out.print("=");
            System.out.println(">");
        }
    }
}