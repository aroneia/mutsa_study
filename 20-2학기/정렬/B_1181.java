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
		
        //�ܾ��� �ߺ��� �����ϱ� ���� set�� ���
		HashSet<String> set = new HashSet<String>();
		
		for(int i = 0; i < N ; i++)
			set.add(sc.nextLine());
		
        //set�� list�� ��ȯ
		ArrayList<String> list = new ArrayList<String>(set);
		
        //Collections�� new Comparator�� ���� Ŀ���� ����
		Collections.sort(list, new Comparator<String>() {

			public int compare(String o1, String o2) {
            
            	//���ڿ� ���� �� (1)
				if(o1.length() > o2.length())
					return 1;
                //���ڿ� ���� �� (2)
				else if(o1.length() < o2.length())
					return -1;
                //���ڿ� ���̰� ������ ���ĺ��� ����
				else
					return o1.compareTo(o2);
			}
		});
		
		for(String s : list)
			System.out.println(s);
	}

}
