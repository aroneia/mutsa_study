package bruteforce_al;

import java.util.*;

public class B_2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nan = new int[9];
		boolean flag=false;
		
		int total=0;
		for(int i=0;i<9;i++){
			nan[i]=sc.nextInt();
			total+=nan[i];
		}
		Arrays.sort(nan);
		
		for(int i=0;i<8;i++) {				//아닌 난쟁이 색출
			for(int j=i+1;j<9;j++) {		//아닌 난쟁이 색출
				for(int k=0;k<9;k++) {		//그 외 난쟁이 프린트
					if(k==i || k==j)		
						continue;
					
					if(total-(nan[i]+nan[j])==100) {		//그 두개 빼고는 합이 100이 되는 경우 멈추고 출력
						flag=true;
						System.out.println(nan[k]);
					}
				}
				if(flag)
					return;
			}
		}
	}

}
