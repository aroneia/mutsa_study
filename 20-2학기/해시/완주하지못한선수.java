import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        //오름차순으로 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        String tmp="";  //초기화 필수
        
        for(int i=0;i<completion.length;i++){
            if(!completion[i].equals(participant[i])){
                tmp=participant[i];
                break;
            }
        }
        if(!tmp.equals(""))
            answer=tmp;
        else
            answer=participant[participant.length-1];
        return answer;
    }
}