import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String compare = in.nextLine();
        int test = in.nextInt();
        in.nextLine();
        int result = 0;
        
        for(int i = 0; i < test; i++){
            String word = in.nextLine();
            // 시작과 끝이 연결되어있어도 카운팅
            word += word;
            if(word.contains(compare)) {
                result++;
            }
        }
        
        System.out.println(result);
    }
}
