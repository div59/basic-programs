package builtin_functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(6);
		a.add(3);
		a.add(9);
		Collections.sort(a);
		System.out.println(a);

	}

}
