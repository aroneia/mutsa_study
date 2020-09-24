package sorting;

import java.util.Arrays;

public class H_index {
	 public int solution(int[] citations) {
	        int answer = 0;
	        
	        Arrays.sort(citations);
	        int le = citations.length;
	        
	        for(int i=0;i<le;i++){
	            if((((le-1)-i)+1)<=citations[i]){
	                answer=((le-1)-i)+1; //citations[i]가 되지 않는 이유는?
	                break;}
	        }
	        
	        
	        return answer;
	    }
}
