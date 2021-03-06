package sorting;

import java.util.*;

public class 가장큰수 {
	public String solution(int[] numbers) {
		String answer = new String();
		/** 1 **/
		String str_numbers[] = new String[numbers.length];

		/** 2 **/
		for (int i = 0; i < str_numbers.length; i++) {
			str_numbers[i] = String.valueOf(numbers[i]); // int->String
		}

		/** 3 **/ //**이해필요
		Arrays.sort(str_numbers, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			} /// o2+o1랑 o1+o2비교해서 큰거 리턴
		});

		/** 4 **/
		if (str_numbers[0].startsWith("0")) {
			answer += "0";
		} else {
			for (int j = 0; j < str_numbers.length; j++) {
				answer += str_numbers[j];
			}
		}

		return answer;
	}
}