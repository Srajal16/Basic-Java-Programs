import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the values of a b");
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println(c);

    }
}
