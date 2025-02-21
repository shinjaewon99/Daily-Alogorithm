import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            System.out.println(i);
        }
    }
}
