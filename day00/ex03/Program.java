package day00.ex03;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int minMark = 9;
		int weeks = 1;
		float temp;
		float res = 0;
		int c = 1;

		while(!scan.next().equals("42") && weeks <= 18) {
			if (scan.nextInt() == weeks++) {
				for (int i = 0; i < 5; i++) {
					if ((temp = scan.nextInt()) < minMark)
						minMark = (int)temp;
				}
				res = (minMark + res) * 10;
				c *= 10;
				minMark = 9;
			} else {
				System.err.println("Illegal Argument");
				System.err.print(-1);
				return;
			}
		}
		for (int i = 1; i < weeks; i++) {
			System.out.print("Week " + i + " ");
			temp = res / c;
			while (temp-- >= 1) {
				System.out.print("=");
			}
			res = res % c;
			c /= 10;
			System.out.println(">");
		}
	}
}
