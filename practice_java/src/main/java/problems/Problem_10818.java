// input N and insert some numbers
// get maximum and minimum number
package problems;
import java.util.Scanner;

public class Problem_10818 extends Problem{
	private int N;
	private int arr[];
	private int min;
	private int max;

	public Problem_10818(){
		System.out.println("please enter N: ");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		min = 0;
		max = 0;

		System.out.println("please enter numbers: ");
		for(int i = 0 ; i < N; i++){
			arr[i] = sc.nextInt();
		}
		
		min = max = arr[0];
	}
	public void run(){
		for(int i = 0; i < N; i++){
			if(arr[i]<min)
				min = arr[i];
			
			if(arr[i]>max)
				max = arr[i];
		}

		System.out.println("Min : " + min + " Max : " + max);
		System.out.println("End of Problem");
	}
	public String getDescription(){
		return "Get Min Max Number";
	}
}
