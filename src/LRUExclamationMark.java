import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LRUExclamationMark {
	final LinkedHashMap<Character, Character> cache;
    final int capacity;
    
    public LRUExclamationMark(int capacity) {
        this.cache = new LinkedHashMap<>(capacity);
        this.capacity = capacity;
    }
   /* public ArrayList<Character> get(char key) {
    	ArrayList<Character> list = new ArrayList<>();
        if (cache.containsKey(key)) {
            char val = cache.remove(key);
            // move the key to the last in the list, so that LRU elements will be in the fron
            cache.put(key, val); 
            for(Map.Entry m : cache.entrySet()){
            	list.add((Character) m.getValue());
            }
           
        } 
        return list;
    }*/
    
    public void get(){
    	ArrayList<Character> list = new ArrayList<>();
    	for(Map.Entry<Character, Character> m: cache.entrySet()){
    		list.add(m.getValue());
    	}
    	Object[] objects = list.toArray();
    	 for (Object obj : objects) 
             System.out.print(obj); 
    	 System.out.print(" ");
    	
    }
    
    public void set(char key, char value) {
        if (cache.containsKey(key)) {
            // This is needed since updating the key, won't make the key most recently used.
            cache.remove(key);
        }
        
        if (cache.size() == capacity) {
            Set<Character> keySet = cache.keySet();
            char leastRecentlyUsedKey = keySet.iterator().next();
            cache.remove(leastRecentlyUsedKey);
        }
        
        
        cache.put(key, value);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		LRUExclamationMark obj = new LRUExclamationMark(s);
		String str = sc.next();
		char s1[] = str.toCharArray();
		for(int i = 0;i<str.length();i++){
			if(s1[i] == '!'){
				obj.get();
				
			}
			else
			obj.set(s1[i],s1[i]);
		}
	}

}
