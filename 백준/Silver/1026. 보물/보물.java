import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        List<Integer> store = new ArrayList<>();
        List<Integer> compare = new ArrayList<>();

        for(int i = 0; i < number; i++){
            store.add(in.nextInt());
        }

        for(int i = 0; i < number; i++){
            compare.add(in.nextInt());
        }

        Collections.sort(store);
        Collections.sort(compare, Collections.reverseOrder());

        int result = 0;

        for(int i = 0; i < number; i++){
            result += (store.get(i) * compare.get(i));
        }

        System.out.println(result);
    }
}