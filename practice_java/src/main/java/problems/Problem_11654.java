package problems;
import problems.Problem;
import java.util.Scanner;

public class Problem_11654 extends Problem{
	public Problem_11654(){
		
	}
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alpabet: "
				+ "Enter -1 to exit");
		
		String str = "";
		while(true){
			str = sc.next();
			if(str.equals("-1"))
				break;

			System.out.println(str.charAt(0)-0);
		}
	}

	public String getDescription(){
		return "Enter Alpabet, transform to ASCII code";
	}
}
