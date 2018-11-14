import java.util.ArrayList;
import java.util.List;

public class MaximumPower {
	public static List<Long> primeFactors(long n){
		ArrayList<Long> list = new ArrayList<Long>();
		while(n%2 == 0){
			list.add((long) 2);
			n = n/2;
		}
		for(int i =3;i<=Math.sqrt(n);i = i+2){
			
			while(n%i == 0){
				list.add((long) i);
				n = n/i;
			}
			
		}
		if(n>2){
			list.add(n);
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primeFactors(75));

	}

}
