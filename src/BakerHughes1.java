import java.util.HashMap;
import java.util.Scanner;

public class BakerHughes1 {
	
	public static int doUnion(int s1[], int s2[]){
		int sum = 0;
		for(int i = 0;i<26;i++){
			sum = sum + Math.min(s1[i], s2[i]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String s = sc.next();
		char s1[] = s.toCharArray();
		int count1[] = new int[26];
		int count2[] = new int[26];
	
		int ans = 0;
		for(int i = 0;i<s.length();i++){
			count1[s1[i]-97]++;
		}
		for(int i = 0;i<s.length();i++){
			count1[s1[i]-97]--;
			count2[s1[i]-97]++;
			ans = Math.max(ans, doUnion(count1, count2));
		}
		
		
		System.out.println(ans);

	}

}
