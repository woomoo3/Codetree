import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] arr = date.split("-");
        String mm = arr[0];
        String dd = arr[1];
        String yyyy = arr[2];

        System.out.println(yyyy+"."+mm+"."+dd);
    }
}