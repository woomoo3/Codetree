import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        if(0<=N || N<=50) {
            System.out.printf("%.2f", N);
        }
    }
}