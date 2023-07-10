import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[3];


        for (int i = 1; i <= size; i++) {
            arr[0] = in.nextInt();
            arr[1] = in.nextInt();
            arr[2] = in.nextInt();

            System.out.println("Scenario #" + i + ":");

            Arrays.sort(arr);

            int total = arr[0] * arr[0] + arr[1] * arr[1];
            int compare = arr[2] * arr[2];
            if(total == compare){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

            System.out.println();
        }
    }
}
