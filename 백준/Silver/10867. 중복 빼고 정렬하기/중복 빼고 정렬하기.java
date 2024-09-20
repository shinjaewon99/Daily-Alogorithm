import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        Set<Integer> store = new HashSet<>();

        while(number --> 0){
            store.add(in.nextInt());
        }

        List<Integer> answer = new ArrayList<>(store);
        Collections.sort(answer);

        for(int result : answer){
            System.out.print(result + " ");
        }
    }
}
