import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        if(1<=a || a<=100) {
            if(1<=b || b<=100) {
                System.out.println(a+" "+b);
            }
        }
    }
}