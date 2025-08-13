import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 문자 갯수
        in.nextLine();

        StringBuilder result = new StringBuilder();
        String word = in.nextLine();

        String[] codes = new String[]{
            "000000", "001111", "010011", "011100",
            "100110", "101001", "110101", "111010"
        };

        for(int i = 0; i < t; i++){
            String cutWord = word.substring(i * 6, (i * 6) + 6);

            String matched = " ";

            switch (cutWord) {
                case "000000": matched = "000000"; break;
                case "001111": matched = "001111"; break;
                case "010011": matched = "010011"; break;
                case "011100": matched = "011100"; break;
                case "100110": matched = "100110"; break;
                case "101001": matched = "101001"; break;
                case "110101": matched = "110101"; break;
                case "111010": matched = "111010"; break;
            }

            // 빈 문자열이지만, 한자리 수만 다른경우
            if(matched.equals(" ")){
                for(String code : codes){
                    int temp = 0;

                    for(int j = 0; j < 6; j++){
                        if(code.charAt(j) != cutWord.charAt(j)){
                            temp++;
                        }
                    }

                    if(temp == 1){
                        matched = code;
                        break;
                    }
                }
            }

            if(matched.equals(" ")){
                System.out.println(i + 1);
                return;
            }

            switch (matched) {
                case "000000": result.append('A'); break;
                case "001111": result.append('B'); break;
                case "010011": result.append('C'); break;
                case "011100": result.append('D'); break;
                case "100110": result.append('E'); break;
                case "101001": result.append('F'); break;
                case "110101": result.append('G'); break;
                case "111010": result.append('H'); break;
            }
        }
        System.out.println(result.toString());
    }
}