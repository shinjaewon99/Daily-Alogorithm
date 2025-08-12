import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();

        int count = 0;
        
        for(int i = 0; i < t; i++){
            String[] words = in.nextLine().split("-");

            if(Integer.valueOf(words[1]) <= 90){
                count++;
            }
        }

        System.out.println(count);
    }
}