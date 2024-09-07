import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        in.nextLine();
        
        Set<String> words = new HashSet<>();
        for(int i = 0; i < number; i++){
            words.add(in.nextLine());
        }

        List<String> store = new ArrayList<>(words);


        Collections.sort(store, (o1, o2) -> {
            if(o1.length() == o2.length()){
                return o1.compareTo(o2); // 길이가 같으면 사전순 정렬
            }else{
                return Integer.compare(o1.length(), o2.length());
            }
        });

        for(String result : store){
            System.out.println(result);
        }
    }
}