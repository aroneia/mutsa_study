import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> cl = new HashMap<String,Integer>();
        
        for(int i=0 ; i<clothes.length ; i++){
            if(cl.containsKey(clothes[i][1]))
                cl.replace(clothes[i][1],cl.get(clothes[i][1])+1 );
            else
                cl.put(clothes[i][1],1);
        }
        
         for(int values : cl.values()){
             answer*=(values+1);
         }
        answer=answer-1;
        return answer;
    }
}