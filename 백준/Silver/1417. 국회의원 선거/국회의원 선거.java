import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] store = new int[number];
        int count = 0;
        
        for(int i = 0; i < number; i++){
            store[i] = in.nextInt();
        }
        
        int compare = store[0];

        if(number == 1){
            System.out.println("0");
            return;
        }
        while(true){
            int index = 1;

            // 다솜을 제외한 득표가 가장 많은 후보 찾기
            for(int i = 1; i < number; i++){
                if(store[i] > store[index]){
                    index = i;
                }
            }

            if(compare > store[index]){
                break;
            }
            
            store[index]--;
            compare++;
            count++;
            
        }

        System.out.println(count);
        
    }
}
