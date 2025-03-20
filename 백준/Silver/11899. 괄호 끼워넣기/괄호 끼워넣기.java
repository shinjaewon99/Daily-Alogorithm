import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String word = in.nextLine();
        
        int open = 0; // 추가해야할 '(' 갯수
        int close = 0;  // 추가해야할 ')' 갯수
        
        int count = 0;
        
        for(char ch : word.toCharArray()){

            if(ch == '('){
                close++; // ')' 가 필요
            }else{
                if(close > 0){
                    close--;
                }else{
                    open++;
                }
            }
        }

        System.out.println(open + close);
    }
}