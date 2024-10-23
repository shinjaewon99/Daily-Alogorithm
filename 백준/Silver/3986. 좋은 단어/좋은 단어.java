import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        in.nextLine();
        int result = 0;

        for(int i = 0; i < n; i++){
            Stack<Character> store = new Stack<>();

            String word = in.nextLine();

            for(int j = 0; j < word.length(); j++){
                char alpha = word.charAt(j);
                
                if(!store.isEmpty() && store.peek() == alpha){
                    store.pop();
                }else{
                    store.push(alpha);
                }
            }
                
            if(store.isEmpty()){
                result++;
            }
        }

        System.out.println(result);
    }
}
