import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        PriorityQueue<Integer> store = new PriorityQueue<>();

        for(int i = 0; i < number; i++){
            int input = in.nextInt();

            if(input == 0){

                // 힙이 비어있는경우 0 출력
                if(store.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(store.poll());
                }
            }else{
                store.add(input);
            }
        }
    }
}