import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수

        while(t --> 0){
            int length = in.nextInt();
            String[] cards = new String[length];

            for(int i = 0 ; i < length; i++){
                cards[i] = in.next();
            }

            Deque<String> store = new LinkedList<>();
            store.add(cards[0]); // 첫번째 카드는 넣는다.

            for(int j = 1; j < length; j++){
                String current = cards[j];

                // true
                if(current.compareTo(store.peekFirst()) <= 0){
                    store.addFirst(current);
                }else{
                    store.addLast(current);
                }
            }

            StringBuilder result = new StringBuilder(); 
            for (String s : store) { 
                result.append(s); 
            } 
            System.out.println(result);
        }
    }
}