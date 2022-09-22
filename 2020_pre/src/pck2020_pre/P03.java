package pck2020_pre;

import java.util.Arrays;
import java.util.Scanner;

public class P03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, Ans;
		
		N = sc.nextInt();
		int[] x = new int[N+1];
		for(int i = 0; i < N+1; i++) {
			x[i] = sc.nextInt();
		}
		
		int[] y = new int[N];
		for(int i = 0; i < N; i++) {
			y[i] = x[i+1];
		}
		
		Arrays.sort(y);
		if(x[0] == 0) {
			Ans = y[N-1];
		}
		else if(x[0] > y[N-1]) {
			Ans = x[0] - y[0];
		}
		else {
			if(y.length == 1) {
				Ans = Math.abs(x[0] - y[0]);
			}
			else if(Math.abs(x[0] - y[0]) < Math.abs(x[0] - y[N-1])) {
				Ans = 2 * Math.abs(x[0] - y[0]) + Math.abs(x[0] - y[N-1]);
			}
			else {
				Ans = 2 * Math.abs(x[0] - y[N-1]) + Math.abs(x[0] - y[0]);
			}
		}
		
		System.out.println(Ans);
		
		sc.close();
	}
}