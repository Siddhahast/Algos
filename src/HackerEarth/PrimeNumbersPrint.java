package HackerEarth;

import java.util.Scanner;

public class PrimeNumbersPrint
{

	public static void main(String[] args)
	{
		printArray(fetchPrimeNumbersInRange(getInputNumber()));
	}
	
	private static void printArray(int[] arr)
	{
		if(arr != null)
		{
		for(int i=0;i<arr.length;i++)
			{
				System.out.print(i+ " ");
			}
		}
	}
	
	private static int[] fetchPrimeNumbersInRange(int n)
	{
		int[] primes = new int[n];
		int index = 0;
		if(n == 1)
		{
			return null;
		}
		
		if(n == 2)
		{
			return new int[]{2};
		}
		
		for(int i = 2;i<=n; i++)
		{
			if(isPrime(i))
			{
				primes[index++] = i;
			}
		}
		return primes;
	}
	
	private static boolean isPrime(int n)
	{
		int root = (int) Math.sqrt(n);
		for(int i =2;i<root;i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	private static int getInputNumber()
	{
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		return N;
	}
}
