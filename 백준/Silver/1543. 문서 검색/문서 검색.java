import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        String compare = in.nextLine();

        int count = 0;

        word = word.replaceAll(compare, "1");

        for(char result : word.toCharArray()){
            if(result == '1'){
                count++;
            }
        }

        System.out.println(count);
       
    }
}
