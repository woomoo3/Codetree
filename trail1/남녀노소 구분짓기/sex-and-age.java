import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int gen = sc.nextInt();
        int age = sc.nextInt();

        if((gen == 0) && (age >= 19)) {
            System.out.println("MAN");
        } else if ((gen == 0) && (age <= 19)) {
            System.out.println("BOY");
        } else if ((gen == 1) && (age >= 19)) {
            System.out.println("WOMAN");
        } else if ((gen == 1) && (age <= 19)) {
            System.out.println("GIRL");
        }
    }
}