import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수

        for(int i = 0; i < t; i++){
            int index = in.nextInt();
            int number = in.nextInt();

            System.out.println(index + " " + getResult(number));
        }
    }

    private static final int getResult(int number){
        int stNum = 1;
        int nextNum = 1;
        int count = 0;

        while(true){
            int next = (stNum + nextNum) % number;
            stNum = nextNum;
            nextNum = next; 
            
            count++;
            
            if(stNum == 1 && nextNum == 1){
                break;
            }
        }
       

        return count;
    }
}