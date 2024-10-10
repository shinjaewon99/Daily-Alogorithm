import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        in.nextLine();
        
        for(int i = 0; i < number; i++){
            Stack<Character> store = new Stack<>();
            String word = in.nextLine();
            boolean flag = true;

            for(int j = 0; j < word.length(); j++){
                char ch = word.charAt(j);

                // 여는 괄호 일경우
                if(ch == '('){
                    store.push(ch);
                }
                // 첫번째 단어가 닫는 괄호 일 경우 false
                else if(ch == ')'){
                    if(store.isEmpty()){
                        flag = false;
                        break;
                    }else {
                        store.pop();
                    }
                }
            }

            if(!store.isEmpty()){
                flag = false;
            }

            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}