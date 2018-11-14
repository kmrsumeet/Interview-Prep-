import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleHockeyStick {
	private static void hockeyStick(int row, int length) {
	    //System.out.println("Hockey stick statring from " + row);
	    List<Integer> finalResult = new ArrayList<>(Arrays.asList(1, ++row));
	    int oldValue = 1;
	    int newValue = row;
	    int sum = row + 1;
	    for (int i = 2; i < length - 1; i++) {
	        finalResult.add(newValuebimialCoefficient(oldValue + newValue, i, ++row));
	        oldValue += newValue;
	        newValue = finalResult.get(i);
	        sum += newValue;
	    }
	    finalResult.add(sum);
	   // String[] str[] = (String[]) new String[finalResult.size()];
	    String str = "";
	    for(int i = 0;i<finalResult.size()-1;i++){
	    	if(i == (finalResult.size()-2))
	    	 str = str + String.valueOf(finalResult.get(i));
	    	else
	    		str = str + String.valueOf(finalResult.get(i)) + " + ";
	    	 
	    }
	   //System.out.println(finalResult);
	    System.out.println(str);
	}

	private static int newValuebimialCoefficient(int oldValue, int index, int line) {
	    return (oldValue * (line - index + 1) / index);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hockeyStick(5,5);
	}

}
