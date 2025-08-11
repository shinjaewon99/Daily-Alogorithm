import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();
        
        List<String> words = new ArrayList<>();

        for(int i = 0; i < t; i++){
            words.add(in.nextLine());
        }

        Collections.sort(words, (s1, s2) -> s2.length() - s1.length());

        int result = 0;

        for(int i = 0; i < t; i++){
            boolean flag = false;

            // 접두사 인지 확인
            for(int j = 0; j < i; j++){
                if(words.get(j).startsWith(words.get(i))){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                result++;
            }
        }

        System.out.println(result);
    }
}