import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        in.nextLine();
        int max = Integer.MIN_VALUE;
        Map<String,Integer> store = new HashMap<>();
        
        for(int i = 0; i < number; i++){
            String word = in.nextLine();
            store.put(word, store.getOrDefault(word, 0) + 1);

            if(store.get(word) > max){
                max = store.get(word);
            }
        }

        List<String> output = new ArrayList<>();

        // Map의 entrySet() 메소드를 통해 Map 객체 탐색
        for(Map.Entry<String,Integer> compare : store.entrySet()){
            if(compare.getValue() == max) output.add(compare.getKey());
        }

        Collections.sort(output);
        System.out.println(output.get(0));
    }
}