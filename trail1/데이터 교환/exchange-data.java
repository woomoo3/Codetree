public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 5, b = 6, c = 7;
        int temp1 = a ;
        int temp2 = c ;
        a = c ;
        c = b ;
        b = temp1 ;
        
        System.out.println(a + "\n" + b + "\n" + c);
    }
}