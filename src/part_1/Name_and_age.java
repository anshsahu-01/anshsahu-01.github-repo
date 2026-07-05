package part_1;
import java.util.Scanner;

public class Name_and_age {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name = sc.nextLine();
        System.out.println("Enter Your Age :");
        int age = sc.nextInt();
        System.out.println("Hello Your Name Is " + name + " and your age is " + age);
    }
}
