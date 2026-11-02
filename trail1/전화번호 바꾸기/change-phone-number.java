import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("-");
        String xxxx = arr[1];
        String yyyy = arr[2];
        System.out.println(arr[0]+"-"+yyyy+"-"+xxxx);
    }
}