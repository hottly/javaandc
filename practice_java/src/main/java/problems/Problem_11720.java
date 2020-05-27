package problems;
import problems.Problem;
import java.util.Scanner;

public class Problem_11720 extends Problem{
	public Problem_11720(){	}

	public void run(){
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		int sum = 0;

		for(int i = 0; i < val.length(); i++){
			sum += Character.getNumericValue(val.charAt(i));
		}
		System.out.println(sum);
	}

	public String getDescription(){
		return "Enter a line of numbers, print sum of numbers of each digits";
	}
}
