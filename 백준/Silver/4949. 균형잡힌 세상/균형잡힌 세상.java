import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        StringBuilder result = new StringBuilder();
        while(true){

            String word = in.nextLine();
            if(word.equals(".")) break;

            if(checkBalance(word)){
                result.append("yes").append("\n");
            }else{
                result.append("no").append("\n");
            }
            
        }

        System.out.println(result.toString());
    }

    private static boolean checkBalance(final String word){
        Stack<Character> store = new Stack<>();

        for(char ch : word.toCharArray()){

            // 여는 괄호 일경우
            if(ch == '(' || ch == '['){
                store.push(ch);
            }
            // 닫는 괄호 일 경우
            else if(ch == ')'){
                if(store.isEmpty() || store.pop() != '('){
                    return false; // 짝이 맞지 않을 경우
                }
            }else if(ch == ']'){
                if(store.isEmpty() || store.pop() != '['){
                    return false; // 짝이 맞지 않을 경우
                }
            }
        }

        return store.isEmpty();
    }
}