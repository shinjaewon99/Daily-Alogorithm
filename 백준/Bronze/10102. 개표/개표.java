import java.util.*;
    
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        String word = in.nextLine();
        
        String[] words = word.split("");

        int aCnt = 0;
        int bCnt = 0;
        
        for(int i = 0; i < n; i++){
            if(words[i].equals("A")){
                aCnt++;
            }else{
                bCnt++;
            }
        }

        if(aCnt > bCnt){
            System.out.println("A");
        }else if(aCnt < bCnt){
            System.out.println("B");
        }else{
            System.out.println("Tie");
        }
    }
}
