package arrays;

import java.util.Scanner;

public class vowel_matching {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s1=sc.nextLine().toLowerCase();
		String s[]=s1.split(" ");
		char a[]={'a','e','i','o','u'};
		int c=0;
		for(int i=0;i<s.length;i++){
		   // System.out.print(i);
		   for(int j=0;j<a.length;j++){
		      if(s[i].charAt(0)==a[j]){
		          c+=1;
//		          System.out.println(s[i]);
		      }
		   
		       
		   }
		   
		}
		if(c>0){
		    System.out.println(c);
		}
	    else{
	        System.out.print("no");
	    }
		}
}
