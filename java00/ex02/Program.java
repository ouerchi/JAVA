import java.util.Scanner;

class Program {

    public static void main(String[] args){
        int countPrime = 0;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("-> ");
            int number = sc.nextInt();
            if (number == 42){
                sc.close();
                break;
            }
            int sum = 0;
            while(number > 0){
                sum += number %10;
                number /= 10;
            }
            boolean isPrime = true;
            for (int i = 2; i * i <= sum; i++){
                if (sum % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                countPrime++;
        }
        System.out.println("Count of coffee-request : " + countPrime);
    }
}