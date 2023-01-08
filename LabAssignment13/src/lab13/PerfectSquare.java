package lab13;

public class PerfectSquare {
	public static void main(String args[])
	{
		
		//array declaration
		int[] arr={16,144,169,224};
		
		//if else statement
		if(checkperfectSquare(arr))
		{
			System.out.println("given array is perfect square aaray");
		}
		else
			System.out.println("given  array is not perfect square aaray");
				
		}
	
		//method to check perfect square array
		static boolean checkperfectSquare(int[] arr)
		{
			int pp=0,ps=0;
			
			// for loop
			for(int i=0;i<arr.length;i++)
			{
				//use sqrt function 
				ps=(int)Math.sqrt(arr[i]);
				
				pp=ps*ps;
				
			    //if statement  for  check condition
				if(pp!=arr[i])
				{
					return false;
				}
			}
					return true;
		
			}
}
