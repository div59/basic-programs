
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	int []a=new int[5];
	int n=a.length;
	for(int i=0;i<5;i++){
	     a[i]=s.nextInt();
	}
	int temp=0;
	for(int i=0;i<n-1;i++){
	    for(int j=0;j<n-1-i;j++){
	        if (a[j]>a[j+1]){
	            temp=a[j];
	            a[j]=a[j+1];
	            a[j+1]=temp;
	        }
	    }
	}
    for(int i=0;i<5;i++){
        System.out.print(a[i]+" ");
    }
	}
}
