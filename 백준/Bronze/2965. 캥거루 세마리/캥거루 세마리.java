import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(Math.max(b - a, c - b) - 1);
    }
}
