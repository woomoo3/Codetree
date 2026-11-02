import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("\\.");
        String yyyy = arr[0];
        String mm = arr[1];
        String dd = arr[2];
        System.out.println(mm+"-"+dd+"-"+yyyy);
    }
}