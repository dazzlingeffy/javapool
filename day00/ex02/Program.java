package day00.ex02;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int query;
		int temp = 0;
		boolean prime = true;

		while ((query = scan.nextInt()) != 42) {
			while (query > 0) {
				temp += query % 10;
				query /= 10;
			}
			for (int i = 2; i * i <= temp; i++)
			{
				if (temp % i == 0)
				{
					prime = false;
					break;
				}
			}
			if (prime)
				count++;
		}
		scan.close();
		System.out.println("Count of coffe-request - " + count);
	}
}
