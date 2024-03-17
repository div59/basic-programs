
public class Main
{
	public static void main(String[] args) {
		int []a={9,8,5,4,3};
		int n=a.length;
		int t=0;
		for(int i=0;i<n-1;i++){
		   int minn=i;
		    for(int j=i+1;j<n;j++){
		        if(a[j]<a[minn]){
		            minn=j;
		        }
		    }
		    t=a[minn];
		    a[minn]=a[i];
		    a[i]=t;
		}
		
		   
		for(int i=0;i<n;i++){
		    System.out.print(a[i]+" ");
		}
	}
}
