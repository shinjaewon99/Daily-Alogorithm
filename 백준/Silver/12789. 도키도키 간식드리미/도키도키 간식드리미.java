import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 학생들의 수
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        // 현재 줄 서 있는 곳
        for(int i = 0; i < n; i++){
            int number = in.nextInt();
            queue.add(number);
        }

        // 번호표 순서
        int target = 1;
        
        while(!queue.isEmpty() || !stack.isEmpty()){
            // 현재 줄 서 있는 곳에서 번호표 순서가 일치할 경우
            if(!queue.isEmpty() && queue.peek() == target){
                queue.poll();
                target++;
            }

            // 한명씩 설수 있는 공간에서 번호표 순서가 일치할 경우
            else if(!stack.isEmpty() && stack.peek() == target){
                stack.pop();
                target++;
            }
            // 한명씩 설수 있는 곳으로 이동
            else if(!queue.isEmpty()){
                stack.push(queue.poll());
            }
            else{
                break;
            }
        }

        if(n + 1 == target){
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
        }
    }
}