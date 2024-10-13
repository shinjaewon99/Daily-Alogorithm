import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        Stack<Integer> store = new Stack<>();

        for(int i = 0; i < number; i++){
            int compare = in.nextInt();

            // 1. 입력값이 0이 아닐경우
            if(compare != 0){
                store.push(compare);
            }
            // 2. 입력값이 0일 경우 이전 수를 지운다.
            else{
                store.pop();
            }
        }

        int sum = 0;
        for(int result : store){
            sum += result;
        }

        System.out.println(sum);
    }
}