import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		for(String str : fizzBuzz(15)) {
			System.out.println(str);
		}
	}

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        int countThree = 1;
        int countFive = 1;
        for(int i = 1; i <= n; i++) {
            if(countThree != 3 && countFive != 5) {
            	list.add(String.valueOf(i));
            	countThree++;
            	countFive++;
            } else if (countThree == 3 && countFive != 5) {
            	list.add("Fizz");
            	countThree = 1;
            	countFive++;
            } else if(countThree != 3 && countFive == 5) {
            	list.add("Buzz");
            	countFive = 1;
            	countThree++;
            } else {
            	list.add("FizzBuzz");
            	countThree = 1;
            	countFive = 1;
            }
        }
        return list;
    }
}
