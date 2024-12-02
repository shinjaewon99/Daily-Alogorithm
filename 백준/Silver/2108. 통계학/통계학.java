import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        int[] numbers = new int[test];
        for (int i = 0; i < test; i++) {
            numbers[i] = in.nextInt();
        }

        // 1. 산술평균
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double mean = (double) sum / test;
        System.out.println(Math.round(mean));

        // 2. 중앙값
        Arrays.sort(numbers);
        System.out.println(numbers[test / 2]);

        // 3. 최빈값
        Map<Integer, Integer> store = new HashMap<>();
        for (int num : numbers) {
            store.put(num, store.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = Collections.max(store.values());
        List<Integer> mostFrequent = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                mostFrequent.add(entry.getKey());
            }
        }
        Collections.sort(mostFrequent);
         if (mostFrequent.size() > 1) {
            System.out.println(mostFrequent.get(1));
        } else {
            System.out.println(mostFrequent.get(0));
        }

        // 4. 범위
        int range = numbers[test - 1] - numbers[0];
        System.out.println(range);
    }
}
