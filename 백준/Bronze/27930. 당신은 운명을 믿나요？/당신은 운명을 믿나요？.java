import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        String ko = "KOREA";
        String yo = "YONSEI";

        int kIndex = 0;
        int yIndex = 0;
        
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            // KOREA 추출 비교
            if(kIndex < word.length() && ch == ko.charAt(kIndex)){
                kIndex++;

                if(kIndex == ko.length()){
                    System.out.println("KOREA");
                    return;
                }
            }

            // YONSEI 추출 비교
            if(yIndex < word.length() && ch == yo.charAt(yIndex)){
                yIndex++;

                if(yIndex == yo.length()){
                    System.out.println("YONSEI");
                    return;
                }
            }
        }
    }
}