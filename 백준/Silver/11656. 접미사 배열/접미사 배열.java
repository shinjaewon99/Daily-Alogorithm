import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        List<String> store = new ArrayList<>();

        for(int i = 0; i < word.length(); i++){
            store.add(word.substring(i));
        }

        Collections.sort(store);

        for(String s : store){
            System.out.println(s);
        }
    }
}