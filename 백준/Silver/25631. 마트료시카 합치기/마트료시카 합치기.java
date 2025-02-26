import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);

        Map<Integer, Integer> store = new HashMap<>();
        int max = 0;

        for(int number : numbers){
            store.put(number, store.getOrDefault(number, 0) + 1);
            max = Math.max(max, store.get(number));
        }

        System.out.println(max);

    }
}