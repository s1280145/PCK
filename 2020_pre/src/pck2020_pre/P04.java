package pck2020_pre;

import java.util.Scanner;

public class P04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] r = new int[N];
		
		int max = 0;
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			r[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= N; i++) {
			if(r[N-i] > max) {
				max = r[N-i];
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}