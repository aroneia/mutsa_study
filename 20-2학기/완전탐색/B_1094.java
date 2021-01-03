package bruteforce_al;

import java.util.Scanner;

public class B_1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int want = sc.nextInt();

		int splitbranch = 64; // 시작 막대길이
		int finalbranch = 0; // 붙여나가는 길이
		int count = 0; // 나뭇가지 갯수

		if (want == 64) {
			count = 1;
		} else {
			while (true) {
				if ((finalbranch + splitbranch) == want) {
					count++;
					break;
				} else if (want < finalbranch + splitbranch) {	//ex. 48 < 0+64 이면 64를 나눠야함.
					splitbranch = splitbranch / 2;
					
				} else if (want > finalbranch + splitbranch) {	//ex. 48 > 0+32 이면 fianlbranch0과 반으로 나눈 splitbranch32를 더해주고 붙인 나무갯수 플러스 1
					finalbranch=finalbranch+splitbranch;
					count++;
					splitbranch=splitbranch/2;
				}
			}
		}
		
		System.out.println(count);

	}

}
