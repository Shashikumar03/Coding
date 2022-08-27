
package sorting1;

public class mergeSort1 {
    
	//step -1 to break and call merge function
	static int[] divideArray(int arr[])
	{
		if(arr.length <= 1)
		{
			return arr;
		}
		else
		{
			int length = arr.length;
			int middle = length/2;
			int left[],right[];
			left = new int[middle];
			right = new int[length - middle];
		    for (int i = 0; i <left.length; i++) {
                        left[i]=arr[i];
                    }
                    int j=0;
                    for (int i = middle; i <length; i++) {
                        if(j<=right.length)
                        {
                            right[j]= arr[i];
                            j++;
                        }
                        
                    }
			
		int[]	leftSorted = divideArray(left);
		int []	rightSorted = divideArray(right);
			
			
		int []	finalResult = merge(leftSorted, rightSorted);
			 return finalResult;
			
		}
	}
	
	
	
	//step - 2 to merge two sorted arrays and return final sorted array
	static int[] merge(int arr1[], int arr2[])
	{
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int result[] = new int[n1+n2];
		
		int i,j,k;
		i = j = k =0;
		
		while(i < n1 && j <n2)
		{
			if(arr1[i] < arr2[j])
			{
				result[k] = arr1[i];
				i++; k++;
			}
			else
			{
				result[k] = arr2[j];
				j++; k++;
			}
		}
		
		while( i < n1)
		{
			result[k] = arr1[i];
			i++; k++;
		}
		
		while( j < n2)
		{
			result[k] = arr2[j];
			j++; k++;
		}
		return result;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = new int[] {2020,2019,2015,2018,2016,2017,2013,2014,2012,2011,2010};
		int result[];
		System.out.println("Array before merge Sort");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		result = divideArray(arr);
		System.out.println();
		System.out.println("Array after merge Sort");
		for(int i = 0; i<result.length; i++)
		{
			System.out.print(result[i]+" ");
		}

	}
}
