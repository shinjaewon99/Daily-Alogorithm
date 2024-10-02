import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int[] store = new int[number];

        for(int i = 0; i < number; i++){
            store[i] = in.nextInt();
        }

        Arrays.sort(store);

        int max = 0;
        for(int i = 0; i < number; i++){
            max = Math.max(max, store[number - i - 1] + i + 1);
        }

        System.out.println(max + 1);
    }
}
