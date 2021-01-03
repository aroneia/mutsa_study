package sorting;
import java.util.*;

public class K번째수 {
	 public static int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length]; 
	        
	      
	        
	        
	        for(int i=0;i<commands.length;i++){ //commands[i][0]~commands[i][1] 자르고 -> 정렬 -> commands[i][2]에 해당하는 값만 뽑아서 answer[]에 넣기
	        	int[] tmp = new int[commands[i][1]-commands[i][0]+1];
	        	for(int j=0;j<tmp.length;j++){
	                tmp[j]=array[j+(commands[i][0]-1)];
	            }
	            
	            Arrays.sort(tmp); // 정렬
	            
	            answer[i]=tmp[commands[i][2]-1];
	        }
	          
	        return answer;
	        
	    }
	 
	public static void main(String[] args) {
		
		int[] array1 = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands1 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		//System.out.println(commands1[0][2]);
		//System.out.println(commands1[0][1]);
		//System.out.println(commands1[0][0]);
		solution(array1,commands1);
	}

}
