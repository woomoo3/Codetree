import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 방법 1
        if  (a < b) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }

        if (a == b) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

        // 방법 2
        // int first = (a < b) ? 1 : 0 ;
        // int second = (a == b) ? 1 : 0 ;

        // System.out.println(first+" "+second);

    }
}