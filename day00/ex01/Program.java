package day00.ex01;

import java.util.Scanner;

public class Program
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int		n;
		int     r;
		boolean prime = true;
		int     i;

		n = scanner.nextInt();
		scanner.close();
		if (n < 2)
		{
			System.out.print("Illegal Argument");
			return;
		}
		r = 2;
		for (i = 1; r * r <= n; i++)
		{
			if (n % r++ == 0)
			{
				prime = false;
				break;
			}
		}
		System.out.print(prime + " " + i);
	}
}
