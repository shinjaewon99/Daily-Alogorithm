import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        Set<Integer> store1 = new HashSet<>();
        Set<Integer> store2 = new HashSet<>();

        for(int i = 0; i < n; i++){
            store1.add(in.nextInt());
        }

        for(int i = 0; i < m; i++){
            store2.add(in.nextInt());
        }

        // store1 객체를 기준으로 store2의 원소를 지운다
        store1.removeAll(store2);

        if(store1.isEmpty()){
            System.out.println(0);
        }else{
            List<Integer> answer = new ArrayList<>(store1);
            Collections.sort(answer);
            System.out.println(store1.size());

            for(int result : answer){
                System.out.print(result + " ");
            }
        }
        
    }
}