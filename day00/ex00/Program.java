package day00.ex00;

public class Program {
	public static void main(String[] args)
	{
		int n = 011111;
		int r = 0;
		System.out.println(n / 10);
		r += n % 10;
		n /= 10;
		r += n % 10;
		n /= 10;
		r += n % 10;
		n /= 10;
		r += n % 10;
		n /= 10;
		r += n % 10;
		n /= 10;
		r += n % 10;
		
		System.out.println(r);
	}
}
