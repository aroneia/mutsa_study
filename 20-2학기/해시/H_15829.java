package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class H_15829 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		int mod=1234567891;
		
		String str= sc.next();
		int r=1;	//31의 0승부터 시작
		
		
		//핵심은 곱해져있는 걸 분리해서 각각 %mod 해줘도 된다는 것
		for(int i=0;i<num;i++) {
			char now = str.charAt(i);	//각 자리 숫자 가져오기
			sum=(sum+(now-'a'+1)*r)%mod;	//a=1 b=2 이 과정을 아스키코드를 이용해서 구함. 그 값이랑 31의 n승이랑 곱한다음 원래 있던 sum값에 더해줌.
			r=(r*31)%mod;
		}
		System.out.println(sum);
		
	}

}
