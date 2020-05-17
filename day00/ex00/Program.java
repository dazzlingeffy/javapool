package day00.ex00;
public class Program {
	public static void main(String[] args)
	{
		int n = 479598;
		int r = 0;

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
