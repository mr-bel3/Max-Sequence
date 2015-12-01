import java.util.Scanner;


public class MaxSequence 
{
	public static void displaySubsequence(int [] list, int start, int end)
	{
		System.out.println("The Subsequence is");
		
		for(int i = start; i < end + 1;i++ )
		{
			
			System.out.println(list[i]);
		}
	}
	
	public static int MaxSubsequenceSum (int [] list )
	{
		int maxSum = 0;
		int thisSum = 0;
		
		for (int i = 0, j = 0; j < list.length; j ++)
		{
			thisSum += list[j];
			
			if( thisSum >  maxSum)
			{
				maxSum = thisSum;
			}
			else if (thisSum < 0)
			{
				i = j + 1;
				thisSum = 0;
			}
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) 
	{
		int list [] = {-1, 4, 2, 3, -3, -10, 8, -1, 1};
		int list2 [] = {-5, -1, 4, 2, 1, -3, -10, 6, -1, 3};
		System.out.println("Enter the index in which you want to start printing");
		Scanner scan1 = new Scanner(System.in);
		int num1 = scan1.nextInt();
		System.out.println("Enter the index in which you want to end printing");
		Scanner scan2 = new Scanner(System.in);
		int num2 = scan2.nextInt();
		System.out.println("The Maximum SubSequence is " + MaxSubsequenceSum(list2));
		//System.out.println("The Maximum SubSequence is " + MaxSubsequenceSum(list));
		displaySubsequence(list2, num1, num2);
		
	}

}
