package problems;
import problems.Problem;
import java.util.Scanner;

public class Problem_2562 extends Problem{
	private int max;
	private int idx;
	private int n;
	private int[] arr;

	public	Problem_2562(){
		max = 0;
		idx = 0;
		n = 0;
		arr = null;
	}
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number of numbers");
		n = sc.nextInt();
		arr = new int[n];

		System.out.println("please enter numbers");
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();	
		}

		max = arr[0];

		for(int i=0; i<n;i++){
			if(max<arr[i]){
				max = arr[i];
				idx = i;
			}
		}
		System.out.println("Max number is : " + max
				+ "\nMax number's index is : " + (idx+1));
	}

	public String getDescription(){
		return "Enter numbers and find max number"+
			" also find where number is at Array.";
	}
}
