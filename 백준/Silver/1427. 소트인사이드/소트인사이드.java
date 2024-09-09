import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = in.nextLine();

        List<String> store = new ArrayList<>();

        for(int i = 0; i < number.length(); i++){
            store.add(number.substring(i, i+1));
        }

        Collections.sort(store, Comparator.reverseOrder());


        int[] result = store.stream().
                        mapToInt(Integer::parseInt)
                        .toArray();

        for(int num : result){
            System.out.print(num);
        }
        
    }
}
