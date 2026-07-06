package problems_part_2;
import java.util.Scanner;

public class Strong_Number {
    public static int factorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;

        while(num > 0){
            int lastDigit = num % 10;
            sum += factorial(lastDigit);
            num /= 10;
        }
        System.out.println(originalNum == sum ? "Strong" : "Not Strong");

        sc.close();
    }
}
