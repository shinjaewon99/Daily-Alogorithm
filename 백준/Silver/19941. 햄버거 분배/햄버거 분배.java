import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 식탁의 길이
        int k = in.nextInt(); // 햄버거를 선택할 수 있는 거리
        in.nextLine();
        
        String word = in.nextLine();

        // 사람과 햄버거의 위치 인덱스를 저장
        List<Integer> people = new ArrayList<>();
        List<Integer> ham = new ArrayList<>();

        
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'P'){
                people.add(i);
            }else if(word.charAt(i) == 'H'){
                ham.add(i);
            }
        }

        int count = 0;
        boolean[] checkHam = new boolean[ham.size()]; // 햄버거를 먹었는지 안먹었는지 확인

        for(int index : people){
             for(int i = 0; i < ham.size(); i++){
                if(!checkHam[i] && Math.abs(index - ham.get(i)) <= k){
                    checkHam[i] = true;
                    count++;
                    break;
                }
            }
        }
        

        System.out.println(count);
    }
}
