import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintKthRowPascal {

	public static void main (String[] args) {
		//code
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- > 0){
		    int k;
		    k = sc.nextInt();
		    int arr[][] = new int[k][k];
		    ArrayList<Integer> list = new ArrayList<>();
		    for(int line = 0;line<k;line++){
		        for(int i = 0;i<=line;i++){
		            if(line == i || i == 0){
		                arr[line][i] = 1;
		                if(line == (k-1))
		                	list.add(arr[line][i]);
		            }
		            else
		            {
		                arr[line][i] = arr[line -1][i-1] + arr[line-1][i];
		                if(line == (k-1)){
		                	list.add(arr[line][i]);
		                }
	
		            }
		        }
		    }
		    for(int i = 0;i<k;i++)
		    System.out.print(list.get(i) + " ");
		    
		}
	}

}
