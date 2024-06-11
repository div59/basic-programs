public class linearserch {
    
}
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int a[]={2,3,44,67,88,90,94,99};
		int j=0;
		int h=0;
		for(int i=0;i<a.length;i++){
		    if (a[i]==x){
		        j=1;
		        h=(i+1);
		        break;
		    }
		}
		if (j==1){
		    System.out.println("linear "+h);
		}else{
		    System.out.println("no");
		}
		
	}
}
