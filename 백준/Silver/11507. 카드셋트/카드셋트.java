import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();
        int[] numbers = new int[4];
        Set<String> store = new HashSet<>();

        for(int i = 0; i < word.length(); i+=3){
            String type = word.substring(i, i + 3);

            if(store.contains(type)){
                System.out.println("GRESKA");
                return;
            }
            store.add(type);

            if(type.charAt(0) == 'P'){
                numbers[0]++;
            }else if(type.charAt(0) == 'K'){
                numbers[1]++;
            }else if(type.charAt(0) == 'H'){
                numbers[2]++;
            }else if(type.charAt(0) == 'T'){
                numbers[3]++;
            }
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.print(13 - numbers[i] + " ");
        }
    }
}