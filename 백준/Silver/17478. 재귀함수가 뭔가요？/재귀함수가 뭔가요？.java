import java.util.*;

class Main {
    private static StringBuilder output = new StringBuilder();
	private static String underBar = "";
	private static int number;
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        output.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");

        loop(0);
        System.out.println(output.toString());
        
    }

    private static void loop(int count) {
        String temp = underBar;
		if (count == number) {
			output.append(temp).append("\"재귀함수가 뭔가요?\"\n");
			output.append(temp).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
			output.append(temp).append("라고 답변하였지.\n");
			return;
		}
		
		output.append(temp).append("\"재귀함수가 뭔가요?\"\n");
		output.append(temp).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
		output.append(temp).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
		output.append(temp).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
		
		underBar += "____";
		loop(count + 1);
		output.append(temp).append("라고 답변하였지.\n");
    }
}
