import java.util.Scanner;
public class Main{
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        in.close();

        int count = 0;
        int copy = number;

        while (true) {
            number = ((number % 10) * 10) + (((number / 10) + (number % 10)) % 10);
            count++;

            if (copy == number) {
                break;
            }
        }
        System.out.println(count);
    }
}