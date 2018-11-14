import java.util.Arrays;
import java.util.Scanner;

public class Cars24_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       int t = sc.nextInt();
	       while(t-- > 0){
	           int n = sc.nextInt();
	           int arr[] = new int[n];
	           long sum = 0;
	           for(int i = 0;i<n;i++){
	               arr[i] = sc.nextInt();
	               
	           }
	           for (int i = 0; i < n; i++)  
	               sum += arr[i]; 
	           long mid = sum / n;
	           long sum1 = 0;
	           for(int i = 0;i<n;i++){
	        	   long x = mid - arr[i];
	        	   sum1 = sum1 + x;
	           }
	           long ans = -1;
	           if(sum1 == 0){
	        	   ans = mid;
	           }
	          System.out.println(ans);
	       
	           
	}
}

}
