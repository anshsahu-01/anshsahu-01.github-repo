package problems_part_2;
import java.util.Scanner;

public class Prime_Number {

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int num = sc.nextInt();
        System.out.println(isPrime(num) ? "Prime Number" : "Not a Prime Number");
        sc.close();
    }
}
