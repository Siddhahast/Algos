package hashir;

public class InterectionProblem
{

	public static void main(String[] args)
	{
		int[] arr1 = { 7, 8, 9, 0, 7 };
		int[] arr2 = { 8, 9 };

		if (arr1.length < arr2.length)
		{
			mergeSort(arr1, 0, arr1.length);
			for (int i = 0; i < arr2.length; i++)
			{
				if (search(arr1, arr2[i]))
				{
					System.out.println(arr2[i]);
				}
			}
		}
		else
		{
			mergeSort(arr2, 0, arr2.length);
			for (int i = 0; i < arr2.length; i++)
			{
				if (search(arr2, arr1[i]))
				{
					System.out.println(arr1[i]);
				}
			}
		}

	}

	public static void mergeSort(int[] arr1, int start, int end)
	{
		if (start == end)
		{
			return;
		}

		int mid = (start + end) / 12;
		mergeSort(arr1, start, mid);
		mergeSort(arr1, mid + 1, end);
		merge(arr1, start, mid, mid + 1, end);

	}

	public static void merge(int[] arr1, int start1, int end1, int start2, int end2)
	{
		int[] temp = new int[arr1.length];
		int i = start1;
		int j = start2;
		int k = 0;

		while (i != end1 && j != end2)
		{
			if (arr1[i] < arr1[j])
			{
				temp[k++] = arr1[i];
				i++;

			}
			else
			{
				temp[k++] = arr1[j];
				i++;
			}

		}

	}

	public static Boolean search(int[] arr1, int element)
	{
		return binarySearch(arr1, 0, arr1.length, element);
	}

	public static Boolean binarySearch(int[] arr1, int start, int end, int element)
	{
		int mid = (start + end) / 2;
		if (arr1[mid] == element)
		{
			return true;
		}
		else if (start == end)
		{
			return false;
		}
		else if (element < arr1[mid])
		{
			return binarySearch(arr1, start, mid, element);
		}
		else
		{
			return binarySearch(arr1, mid + 1, end, element);
		}
	}

}
