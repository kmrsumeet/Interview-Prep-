import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaximumPowerHashMap {
	 static int gcd(int a, int b) 
	    { 
	        if (a == 0) 
	            return b; 
	        return gcd(b % a, a); 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int n = 1500;
		while(n%2 == 0){
			//Integer val = hmap.get(2);
			if(hmap.containsKey(2)){
				hmap.put(2,hmap.get(2)+1);
			}
			else {
			       hmap.put(2, 1);
			   }
			n = n/2;
		}
		for(int i = 3;i<=Math.sqrt(n);i= i+2){
			
			while(n%i == 0){
				//Integer val = hmap.get(i);
				if(hmap.containsKey(i)){
					hmap.put(i,hmap.get(i)+1);
				}
				else {
				       hmap.put(i, 1);
				   }
				n = n/i;
			}
		}
		if(n>2){
			if(hmap.containsKey(n)){
				hmap.put(n,hmap.get(n)+1);
			}
			else
			{
				hmap.put(n,1);
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(Map.Entry m:hmap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			   list.add((Integer) m.getValue());
			  }
		int gcd1 = list.get(0);
		for(int i = 0;i<list.size();i++){
			gcd1 = gcd(gcd1,list.get(i));
		}
		System.out.println(gcd1);
		System.out.println(list);
	}

}

