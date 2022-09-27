
public class Program4
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7,8,9};
		int input[]={1,2,8,9,12,46,76,82,15,20,30};
		int count =0;
		for(int i=0;i<=arr.length-1;i++)
		{
			int k=arr[i];
			count=0;
			for(int j=0;j<=input.length-1;j++)
			{

				if(input[j]%k==0)
				{
					count++;
				}

			}
			System.out.print(arr[i]+" :"+count+" ,");
		}
	}
}