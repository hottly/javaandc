package problems;
import problems.Problem;
import java.util.Scanner;

public class Problem_4673 extends Problem{
	public Problem_4673(){
		//do nothing
	}
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter n : ");
		int n = sc.nextInt();
		int count = 0;
		for(int i =1; i< n; i++)
			if(isSelfNumber(i)){
				System.out.println(i);
				count++;
			}

		System.out.println("Total Self Number Count in "+ n +" is :" + count);
	}

	public String getDescription(){
		return "Get Self Number less than N";
	}

	public boolean isSelfNumber(int val){
	/*
		Self number is f(x) = x + sum of digit
		val = f(x) = x + sum of digit
		val - x = sum of digit
		So, make a loop less than val
		and check if there is x which is sum of x's digit and x
		make value zero
	*/
		boolean result = true;

		for(int i = 1; i< val; i++){

			if(val-(i+getSumOfDigit(i))==0){
				result = false;
				break;
			}else{
				result = true;
			}
		}

	
		return result;
	}

	public int getSumOfDigit(int k){
		int sum = 0;
		int val = k;
		while(true){
			sum += val%10;

			if(val<1)
				break;
			val/=10;
		}
		return sum;
	}
}
