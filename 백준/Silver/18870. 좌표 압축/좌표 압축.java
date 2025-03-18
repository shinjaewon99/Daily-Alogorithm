import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Map<Integer, Integer> store = new HashMap<>();
        StringBuilder output = new StringBuilder();
        int[] numbers = new int[n];
        int[] plain = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        plain = numbers.clone(); // 기본 배열 복사
        int rank = 0;
        Arrays.sort(numbers);

        for(int i = 0; i < n; i++){
            if(!store.containsKey(numbers[i])){
                store.put(numbers[i], rank);
                rank++;
            }
        }

        for(int index : plain){
            int find = store.get(index);
            output.append(find).append(" ");
        }

        System.out.println(output.toString());
    }
}