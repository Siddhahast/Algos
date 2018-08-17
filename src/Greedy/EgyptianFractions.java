package Greedy;

public class EgyptianFractions
{

	private static void printEgyptian(int nr, int dr)
	{
		if(nr==0 || dr==0)
		{
			return;
		}
		
		if(dr%nr == 0)
		{
			System.out.print("1/"+(dr/nr)+" ");
			return;
		}
		
		if(nr%dr == 0)
		{
			System.out.print(nr/dr);
			return;
		}
		
		if(nr > dr)
		{
			System.out.print(nr/dr + " + ");
			printEgyptian(nr%dr, dr);
			return;
		}
		
		int ceiling = dr/nr + 1;
		System.out.print("1/"+ceiling + " + ");
		printEgyptian(nr*ceiling - dr, dr*ceiling);
	}
	
	public static void main(String[] args)
	{
		int nr = 7;
		int dr = 3;
		printEgyptian(nr, dr);
	}
}
