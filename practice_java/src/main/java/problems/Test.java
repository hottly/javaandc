import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while(true){
			input = sc.nextInt();
			
			if(input!=-1)
				System.out.println(getSumOfDigit(input));
			else
				break;
		}

	}	
	public static int getSumOfDigit(int k){
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
