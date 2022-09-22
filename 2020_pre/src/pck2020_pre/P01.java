package pck2020_pre;

import java.util.Scanner;

public class P01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println((int)Math.floor(x / 3600) + " " + (int)Math.floor(y / 3600));
		
		sc.close();
	}
}