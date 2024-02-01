import java.util.Scanner;
 
public class plusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
 
        while (N > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
 
            if (a + b == c) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
            N--;
        }
    }
 
}