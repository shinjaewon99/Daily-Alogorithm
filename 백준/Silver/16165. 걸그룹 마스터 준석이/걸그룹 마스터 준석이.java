import java.util.*;

class Main {
    private static Map<String, List<String>> teamToMembers;
    private static Map<String, String> memberToTeam;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 걸그룹 수
        int m = in.nextInt(); // 맞혀야될 문제 수
        in.nextLine();

        teamToMembers = new HashMap<>();
        memberToTeam = new HashMap<>();
        
        // 팀 정보 입력
        for(int i = 0; i < n; i++){
            String teamName = in.nextLine(); // 팀 이름
            int memberNumber = in.nextInt(); // 멤버 수
            in.nextLine();

            List<String> members = new ArrayList<>();
            for(int j = 0; j < memberNumber; j++){
                String memberName = in.nextLine();
                members.add(memberName);
                memberToTeam.put(memberName, teamName); 
            }

            Collections.sort(members);
            teamToMembers.put(teamName, members);
        }

        // 퀴즈 풀이
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < m; i++){
            String type = in.nextLine();
            int quizType = in.nextInt();
            in.nextLine();

            // 0일 경우 팀의 멤버 전체 출력
            if(quizType == 0){
                List<String> members = teamToMembers.get(type);
                for(String member : members){
                     output.append(member).append("\n");   
                }
            }
            // 1일 경우 해당 멤버의 팀이름
            else if(quizType == 1){
                String team = memberToTeam.get(type);
                output.append(team).append("\n");
            }
        }
        System.out.println(output.toString());
    }
}