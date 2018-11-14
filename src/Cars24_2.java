import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cars24_2 {
	//static int c = 0;
	/*static void combinationUtil(int arr[], int data[], int start, 
			int end, int index, int r) 
	{ 
		if (index == r) 
		{ 
				if(data[0]!=0){
					c++;				
			}
				
			return; 
		} 

		for (int i=start; i<=end && end-i+1 >= r-index; i++) 
		{ 
			data[index] = arr[i]; 
			combinationUtil(arr, data, i+1, end, index+1, r); 
		} 
	} 

	static void printCombination(int arr[], int n, int r) 
	{ 
		int data[]=new int[r]; 	
		combinationUtil(arr, data, 0, n-1, 0, r); 
	} 
*/
	
	static long printCombination(int arr[],int n, int r){
		int C[] = new int[r+1];
		Arrays.fill(C, 0);
		C[0] = 1;
		for(int i = 1;i<=n;i++){
			for(int j = Math.min(i,r);j>0;j--){
				C[j] = C[j] + C[j-1]; 
			}
		}
		return C[r];
	}
	
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();
		//List<Integer> list = Arrays.asList(arr);
		//int arr[] = {1, 1, 0, 1, 0}; 
		//int r = 3; 
		//int n = arr.length; 
		long ans = printCombination(arr, n, k);
		int c1 = 0,flag = 0;
		for(int i = 0;i<n;i++){
			if(arr[i] == 0){
				c1++;
				flag = 1;
		}
		}
		if(flag == 1)
		System.out.println(ans -1 );
		else
			System.out.println(ans);
	} 
} 


