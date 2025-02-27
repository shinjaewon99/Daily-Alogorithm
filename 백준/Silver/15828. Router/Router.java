import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 버퍼의 크기
        Queue<Integer> store = new LinkedList<>();

        while(true){
            int number = in.nextInt();
            if(number == -1) break;

            if(number == 0){
                store.remove();
            }else if(n > store.size()){
                store.add(number);
            }
        }

        if(store.isEmpty()){
            System.out.println("empty");
        }else{
            for(int result : store){
                System.out.print(result + " ");
            }
        }
    }
}