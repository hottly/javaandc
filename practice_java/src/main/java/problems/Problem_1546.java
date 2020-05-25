package problems;
import problems.Problem;
import java.util.Scanner;

public class Problem_1546 extends Problem{
	private int n;
	private int max;
	private int[] arr;
	private float result;
	private float sum;

	public Problem_1546(){
		this.n = 0;
		this.max = 0;
		arr = null;
		result = 0;
		sum = 0;
	}
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Numbers");
		n = sc.nextInt();
		arr = new int[n];
			
		System.out.println("Enter Numbers");
		for(int i = 0; i < n ; i++){
			int val = sc.nextInt();
			arr[i] =  val;
			if(max < val)
				max = val;
		}

		for(int i : arr){
			float val = i;
			sum += val/max*100;
		}
		result = sum/n;

		System.out.println("result: " + result);
	}

	public String getDescription(){
		return "Enter n Numbers and get average "+
				"which is divided by Maximum number \n"+
				"and Multiplied 100 " +
				"first Regain numbers by (Number/Max*100)" +
				"So, get (Sum of Regained number)\n";
	}
}
