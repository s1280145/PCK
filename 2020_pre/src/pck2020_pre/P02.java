package pck2020_pre;

import java.util.Scanner;

public class P02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w, m, s, higashi;
		
		w = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();
		higashi = w - s;
		
		if(s <= m && higashi <= m) {
			System.out.println(3);
		}else if(higashi <= m) {
			System.out.println(2);
		}else if(s <= m) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		sc.close();
	}
}