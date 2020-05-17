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
		r = 0;
		for (i = 2; i * i <= n; i++)
		{
			r++;
			if (n % i == 0)
			{
				prime = false;
				break;
			}
		}
		System.out.print(prime + " " + r);
	}
}
