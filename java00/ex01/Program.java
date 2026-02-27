import java.util.Scanner;

class Program{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("-> ");
        if (!sc.hasNextInt()){
            System.out.println("IllegalArgument");
            System.exit(1);
        }
        int num = sc.nextInt();
        if (num <= 1){
            System.out.println("IllegalArgument");
            System.exit(1);
        }
        boolean isPrime = true;
        int iterations = 0;
        for (int i = 2; i * i <= num; i++){
            iterations++;
            if (num % i == 0){
                isPrime = false;
                System.out.println(false + " " + iterations);
                System.exit(1);
            }
        }
        iterations++;
        System.out.println(isPrime + " " + iterations);
    }
}