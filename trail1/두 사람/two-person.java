import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int fa = sc.nextInt();
        String fg = sc.next();
        int sa = sc.nextInt();
        String sg = sc.next();

        if((fa >= 19) && (fg.equals ("M")) 
            || (sa >= 19) && (sg.equals ("M"))) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        
    }
}