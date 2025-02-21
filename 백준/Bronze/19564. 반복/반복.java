import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        char cur = s.charAt(0);
        int cnt = 1;
        
        for(int i = 1; i < s.length(); i++){
            char next = s.charAt(i);
            
            // 해당 문자가 다음 문자보다 순서가 다음일 경우
            if(next - 'a' <= cur - 'a'){
                cnt++;
            }
            cur = next;
        }
        System.out.println(cnt);
    }
}
