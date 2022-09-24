package pck2020_pre;

import java.util.Scanner;

class Rotate {
	char[][] row;
	int r;
	Rotate (char[][] row, int r){
		this.row = row;
		this.r = r;
	}
	public char[][] rotate(){
		char[][] result = new char[row.length][row.length];
		
		if(r == 0 || r % 4 == 0) {
			for(int i = 0; i < row.length; i++) {
				for(int j = 0; j < row.length; j++) {
					result[i][j] = row[i][j];
				}
			}
		}
		else if(r % 4 == 1 || r % 4 == -3) {
			for(int i = 0; i < row.length; i++) {
				for(int j = 0; j < row.length; j++) {
					result[i][j] = row[row.length-1-j][i];
				}
			}
		}
		else if(r % 4 == 2 || r % 4 == -2) {
			for(int i = 0; i < row.length; i++) {
				for(int j = 0; j < row.length; j++) {
					result[i][j] = row[row.length-1-i][row.length-1-j];
				}
			}
		}
		else if(r % 4 == 3 || r % 4 == -1) {
			for(int i = 0; i < row.length; i++) {
				for(int j = 0; j < row.length; j++) {
					result[i][j] = row[j][row.length-1-i];
				}
			}
		}
		else {
			result = null;
		}
		
		return result;
	}
}


public class P05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, Q;
		
		N = sc.nextInt();
		char[][] row = new char[N][N];
		
		String[] input = new String[N];
		for(int i = 0; i < N; i++) {
			input[i] = sc.next();
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				row[i][j] = input[i].charAt(j);
			}
		}
		Q = sc.nextInt();
		int r = 0;
		
		for(int i = 0; i < Q; i++) {
			r += sc.nextInt();
		}
		
		Rotate ro = new Rotate(row, r);
		char[][] ans = ro.rotate();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
