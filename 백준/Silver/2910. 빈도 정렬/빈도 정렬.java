import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int c = in.nextInt();
        List<Integer> numbers = new ArrayList<>();

        Map<Integer, Integer> store = new HashMap<>();
        List<Integer> indexs = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            numbers.add(in.nextInt());
            indexs.add(numbers.get(i));
            store.put(numbers.get(i), store.getOrDefault(numbers.get(i), 0) + 1);
        }

        // 빈도수로 정렬
        Collections.sort(numbers, (o1,o2) -> {
            // 빈도수가 같을 경우
            if(store.get(o1) == store.get(o2)){
                return indexs.indexOf(o1) - indexs.indexOf(o2);
            }else { // 빈도수가 다른 경우, 빈도수를 기준으로 내림차순 정렬
                return Integer.compare(store.get(o2), store.get(o1));
            }
        });

        StringBuilder output = new StringBuilder();
        for(int result : numbers){
            output.append(result).append(" ");
        }
        
        System.out.println(output.toString());
    }
}