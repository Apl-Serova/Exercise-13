import java.util.Scanner;
public class Exercise13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число (string): ");
        String S = sc.nextLine();
        int X = Integer.valueOf(S);
        double Y = (double) X;
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }
}
