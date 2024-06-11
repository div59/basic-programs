import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int a[]={2,3,44,67,88,90,94,99};
		int l=0;
		int n=a.length;
		int h=n-1;
		int k=0;
		int g=0;
		while(l<=h){
		    int m=(l+h)/2;
		    if (a[m]==x){
		        k=1;
		        g=(m+1);
		        break;
		    }
		    else if(x<a[m]){
		        h=m-1;
		    }
		    else{
		        l=m+1;
		    }
		   
		    
		}
		if(k==1){
		    System.out.println("yes "+g);
		}
		else{
		    System.out.println("no");
		}
		
	}
}
