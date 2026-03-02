import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next(); 
        int q = in.nextInt(); // 질문의 수

        for(int i = 0; i < q; i++){
            int count = 0;
            
            String a = in.next(); 
            int b = in.nextInt();
            int c = in.nextInt();

            for(int j = b; j <= c; j++){
                char ch = input.charAt(j);

                if(ch == a.charAt(0)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}