import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        in.nextLine();
        Set<String> store = new HashSet<>();

        for(int i = 0; i < number; i++){
            String word = in.nextLine();

            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String sortWord = new String(chars);

            store.add(sortWord);
        }

        System.out.println(store.size());
    }
}