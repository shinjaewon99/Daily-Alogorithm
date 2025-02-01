import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] w = new int[10];
        int[] k = new int[10];

        for(int i = 0; i < 10; i++){
            w[i] = in.nextInt();
        }

        for(int i = 0; i < 10; i++){
            k[i] = in.nextInt();
        }

        Arrays.sort(w);
        Arrays.sort(k);

        int result1 = w[9] + w[8] + w[7];
        int result2 = k[9] + k[8] + k[7];

        System.out.println(result1 + " " + result2);
    }
}