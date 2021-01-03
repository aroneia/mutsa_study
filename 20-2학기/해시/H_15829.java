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
		int r=1;	//31�� 0�º��� ����
		
		
		//�ٽ��� �������ִ� �� �и��ؼ� ���� %mod ���൵ �ȴٴ� ��
		for(int i=0;i<num;i++) {
			char now = str.charAt(i);	//�� �ڸ� ���� ��������
			sum=(sum+(now-'a'+1)*r)%mod;	//a=1 b=2 �� ������ �ƽ�Ű�ڵ带 �̿��ؼ� ����. �� ���̶� 31�� n���̶� ���Ѵ��� ���� �ִ� sum���� ������.
			r=(r*31)%mod;
		}
		System.out.println(sum);
		
	}

}
