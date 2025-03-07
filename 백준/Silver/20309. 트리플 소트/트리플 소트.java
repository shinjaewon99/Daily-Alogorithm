import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        int[] numbers = new int[t];

        for(int i = 0; i < t; i++){
            numbers[i] = in.nextInt();
        }

        int[] sortNumbers = numbers.clone();
        Arrays.sort(sortNumbers);

        Map<Integer, Integer> store = new HashMap<>();

        for (int i = 0; i < t; i++) {
            store.put(sortNumbers[i], i);
        }
        
        for(int i = 0; i < t; i++){
            if(i % 2 != (store.get(numbers[i]) % 2)){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}