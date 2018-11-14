import java.util.ArrayList;
import java.util.HashMap;

public class LRUCache_IB {

	 private int c;
	    private HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
	    private ArrayList<Integer> l= new ArrayList<Integer>();
	    private int count=0;
	    
	    public LRUCache_IB(int capacity) {
	        this.c= capacity;
	    }
	    
	    /*
	    list with keys
	    list with key and value
	    */
	    
	    public int get(int key) {
	            if(hm.containsKey(key)){
	                removeElement(key);
	                addInFront(key,hm.get(key));
	                return hm.get(key);
	            }
	            else{
	                return -1;
	            }
	    }
	    
	    public void set(int key, int value) {
	        if(!hm.containsKey(key)){
	            if(count < c){
	                addInFront(key,value);
	            }
	            else{
	                removeLast();
	                addInFront(key,value);
	                
	            }
	        }
	        else{
	            removeElement(key);
	            addInFront(key,value);
	        }
	        
	    }
	    
	    private void removeElement(int no){
	        int index= l.indexOf(no);
	        l.remove(index);
	        count--;
	    }
	    
	    private void addInFront(int key,int no){
	        l.add(0,key);
	        hm.put(key,no);
	        count++;
	    }
	    
	    private void removeLast(){
	        int key=l.get(l.size()-1);
	        l.remove(l.size()-1);
	        hm.remove(key);
	        count--;
	    }

}
