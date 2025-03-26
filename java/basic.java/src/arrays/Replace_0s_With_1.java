package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Replace_0s_With_1 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		long n=scanner.nextLong();
		String s=String.valueOf(n);
		ArrayList<Integer> list =new ArrayList<>();
		for(char c:s.toCharArray()) {
//			int f=c-'0';
//			if (f==0) {
//				f=1;
//				list.add(f);
//			}
//			else {
//				list.add(f);
//			}
			list.add(c=='0'?1:c-'0');
		}
		for(int i:list) {
			System.out.print(i+" ");
		}

	}

}
