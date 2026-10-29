import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N ;
        N = sc.nextInt();
        if(1<=N || N<=1000) {
            System.out.println("Your score is "+ N +" point.");
        }
    }
}