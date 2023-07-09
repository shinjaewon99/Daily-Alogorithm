import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] inputs = new String[6];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            inputs[i] = in.nextLine();
            if(inputs[i].contains("FBI")){
                list.add(i);
            }
        }

        if(list.size() == 0){
            System.out.println("HE GOT AWAY!");
        }else{
            for (int result : list) {
                System.out.print(result + " ");
            }
        }
    }
}
