package bruteforce_al;

import java.util.Scanner;

public class B_1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int want = sc.nextInt();

		int splitbranch = 64; // ���� �������
		int finalbranch = 0; // �ٿ������� ����
		int count = 0; // �������� ����

		if (want == 64) {
			count = 1;
		} else {
			while (true) {
				if ((finalbranch + splitbranch) == want) {
					count++;
					break;
				} else if (want < finalbranch + splitbranch) {	//ex. 48 < 0+64 �̸� 64�� ��������.
					splitbranch = splitbranch / 2;
					
				} else if (want > finalbranch + splitbranch) {	//ex. 48 > 0+32 �̸� fianlbranch0�� ������ ���� splitbranch32�� �����ְ� ���� �������� �÷��� 1
					finalbranch=finalbranch+splitbranch;
					count++;
					splitbranch=splitbranch/2;
				}
			}
		}
		
		System.out.println(count);

	}

}
