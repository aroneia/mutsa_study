package hashing;

import java.awt.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class H_1764 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt(); // 듣도 못한 사람
		int num2 = sc.nextInt(); // 보도 못한 사람

		ArrayList<String> al1 = new ArrayList<>();
		ArrayList<String> al2 = new ArrayList<>();

		for (int i = 0; i < num1; i++) {
			al1.add(sc.next());
		}
		for (int k = 0; k < num2; k++) {
			al2.add(sc.next());
		}

		al1.sort(null);
		al2.sort(null);

		//System.out.println(al1.toString());
		//System.out.println(al2.toString());

		Iterator<String> b1 = al1.iterator();
		Iterator<String> b2 = al2.iterator();

		ArrayList<String> r = new ArrayList<String>();
		
		int total = 0;
		if (num1 < num2) {
			while (b1.hasNext()) {
				String b = b1.next();
				if (al2.contains(b)) {
					r.add(b);
					//System.out.println(b);
					total += 1;
				}
			}
		} else {
			while (b2.hasNext()) {
				String bb = b2.next();
				if (al1.contains(bb)) {
					r.add(bb);
					//System.out.println(bb);
					total += 1;
				}
			}
		}
		System.out.println(total);
		Iterator<String> fin = r.iterator();
		while(fin.hasNext()) {
			String f = fin.next();
			System.out.println(f);
		}

	}

}
