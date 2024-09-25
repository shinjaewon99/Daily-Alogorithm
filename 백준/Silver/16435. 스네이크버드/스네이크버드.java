import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int bird = in.nextInt();

        int[] store = new int[number];
        
        for(int i = 0; i < number; i++){
            store[i] = in.nextInt();
        }

        Arrays.sort(store);

        for(int i = 0; i < number; i++){

            if(store[i] <= bird){
                bird++;
            }
        }

        System.out.println(bird);
    }
}
