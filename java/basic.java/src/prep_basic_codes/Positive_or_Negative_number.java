package prep_basic_codes;
import java.util.*;
public class Positive_or_Negative_number {
	public static void  main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		if(n==0) {
			System.out.println("its zero");
		}
		else if(n>0) {
			System.out.println("positive");
		}
		else {
			System.out.println("negative");
		}
	}
}
