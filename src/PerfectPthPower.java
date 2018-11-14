
public class PerfectPthPower {

	public static void main (String[] args) {

		double num= 1073741824;
		System.out.print(getPower((num)));
		//code
		}
		public static int getPower(double num)
		{

		int base =2;
		double p;
		for(;base<65536;base++){
		p=Math.log(num)/Math.log(base);
		if(p==(int)p) return (int)p;

		}
		return 1;
		}

}
