import java.util.*;
class Main {
    private static final List<Character> store = Arrays.asList('a','e','i','o','u');
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            String word = in.nextLine();

            boolean flag = isCompare(word);
            
            if(word.equals("end")){
                break;
            }
            
            if(flag){
                System.out.println("<" + word + "> " + "is acceptable.");
            }else{
                System.out.println("<" + word + "> " + "is not acceptable.");
            }
        }
    }

    // 입력에 대한 판별을 하는 메소드
    private static final boolean isCompare(final String word){
        boolean hasFlag = false;
        int seqA = 0; // 연속된 자음의 수
        int seqB = 0; // 연속된 모음의 수
        char prev = ' ';
        
        for(char compare : word.toCharArray()){

            if(store.contains(compare)){
                hasFlag = true; // 모음이 하나라도 존재하는지 확인
                seqB++;
                seqA = 0; // 자음 초기화
            }else{
                seqA++;
                seqB = 0; // 모음 초기화
            }

            // 연속으로 자음 / 모음이 오면 false
            if(seqA == 3 || seqB == 3){
                return false;
            }

            if(compare == prev && !(compare == 'e' || compare == 'o')){
                return false;
            }

            prev = compare;
        }

        return hasFlag;
    }
}
