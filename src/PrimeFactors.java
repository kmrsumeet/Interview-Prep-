import java.util.ArrayList;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 500;
		ArrayList<Integer> list = new ArrayList<>();
		while(n%2 == 0){
			if(!list.contains(2))
			list.add(2);
			n = n/2;
		}
		for(int i =3;i<=Math.sqrt(n);i = i+2){
			while(n%i == 0){
				if(!list.contains(i))
					list.add(i);
			n = n/i;
		}
		}
		if(n>2)
			list.add(n);
		for(int i = 0;i<list.size();i++){
			System.out.print(list.get(i) + " ");
		}

	}

}
