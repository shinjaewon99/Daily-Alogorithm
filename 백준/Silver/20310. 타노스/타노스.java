import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        List<String> store0 = new ArrayList<>();
        List<String> store1 = new ArrayList<>();

        for(int i = 0; i < word.length(); i++){
            String[] words = word.split("");

            if(words[i].equals("0")){
                store0.add(words[i]);
            }else{
                store1.add(words[i]);
            }
        }

        StringBuilder output = new StringBuilder();

        for(int i = 0; i < store0.size() / 2; i++){
            output.append(store0.get(i));
        }

        for(int i = 0; i < store1.size() / 2; i++){
            output.append(store1.get(i));
        }

        System.out.println(output.toString());

    }
}