import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int[] store = new int[number + 1];

        for(int i = 2; i <= number; i++){
            store[i] = store[i - 1] + 1;

            // 2로 나누어 떨어지면
            if(i % 2 == 0){
                store[i] = Math.min(store[i], store[i / 2] + 1);
            }

            // 3로 나누어 떨어지면
            if(i % 3 == 0){
                store[i] = Math.min(store[i], store[i / 3] + 1);
            }
        }

    
        System.out.println(store[number]);
    }
}