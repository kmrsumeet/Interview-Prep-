import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.sql.rowset.CachedRowSet;

public class HackerrankLRUCache {
	static int c = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,S;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		S = sc.nextInt();
		//int pageFault = 0;
		
		int arr[] = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>(S);
		int countPageFault = 0;
		for(int i = 0;i<n;i++){
			
			 countPageFault = pageFault(cache,arr[i]);
			
			if(cache.containsKey(arr[i])){
				cache.remove(arr[i]);
			}
			//System.out.println(cache.size());
			if(cache.size() == S){
				Set<Integer> keySet = cache.keySet();
				int leastRecentlyUsedKey = keySet.iterator().next();
				cache.remove(leastRecentlyUsedKey);
				
			}
			cache.put(arr[i], arr[i]);
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(Map.Entry m:cache.entrySet()){
			list.add((Integer) m.getValue());
		}
		System.out.println(countPageFault);
		for(int i = list.size()-1;i>=0;i--){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		
		

	}

	private static int pageFault(LinkedHashMap<Integer, Integer> cache,int x) {
		// TODO Auto-generated method stub
		if(!cache.containsKey(x)){
			c++;
		}
		
		return c;
	}
}


