package Demo.builde;
import java.util.*;

public class Number {
	public static void main(String [] args) {
		int n=12345;
		String s1=Integer.toString(n);//converted into string
        // String s1=String.valueOf(n);
		StringBuilder b =new StringBuilder(s1); // converted to stringbuilder
		//b.reverse();
		String s2=b.reverse().toString();//back to string 
		int n2=Integer.parseInt(s2); //back to number
		System.out.println("before  " + n);
		System.out.println("after  " + n2);
		}

}
