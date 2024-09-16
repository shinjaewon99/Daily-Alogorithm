import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.nextLine(); // 개행 제거
        Map<String, String> store = new HashMap<>();

        for(int i = 0; i < number; i++){
            String name = in.next();
            String status = in.next();


            if(status.equals("enter")){
                store.put(name, status); // 이름, 출근 여부 저장
            }else{
                store.remove(name);
            }
        }

        List<String> result = new ArrayList<>();

        for(String name : store.keySet()){
            result.add(name);
        }

        Collections.sort(result, Collections.reverseOrder());
        
        for(String name : result){
            System.out.println(name);
        }
    }
}