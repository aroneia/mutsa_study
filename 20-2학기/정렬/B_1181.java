package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class B_1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = Integer.parseInt(sc.nextLine());
		
        //단어의 중복을 제거하기 위해 set을 사용
		HashSet<String> set = new HashSet<String>();
		
		for(int i = 0; i < N ; i++)
			set.add(sc.nextLine());
		
        //set을 list로 변환
		ArrayList<String> list = new ArrayList<String>(set);
		
        //Collections와 new Comparator를 통해 커스텀 정렬
		Collections.sort(list, new Comparator<String>() {

			public int compare(String o1, String o2) {
            
            	//문자열 길이 비교 (1)
				if(o1.length() > o2.length())
					return 1;
                //문자열 길이 비교 (2)
				else if(o1.length() < o2.length())
					return -1;
                //문자열 길이가 같으면 알파벳순 정렬
				else
					return o1.compareTo(o2);
			}
		});
		
		for(String s : list)
			System.out.println(s);
	}

}
