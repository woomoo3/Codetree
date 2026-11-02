import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] time = str.split(":");
        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);
        System.out.println((h+1)+":"+m);
    }
}