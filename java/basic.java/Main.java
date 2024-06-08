
/*
Input : 4
Output : 0 1 1 2*/
public class Main
{
	public static void main(String[] args) {
		int n=5;
		int f1,f2,f3;
		f1=0;
		f2=1;
		if (n==1){
		    
		    System.out.print(f1+" ");
		}
		else if(n==2){
		   
		    System.out.print(f1+" "+f2+" ");
		}
		else{
		    
		     System.out.print(f1+" "+f2+" ");
		    for(int i=3;i<=n;i++){
		        f3=f1+f2;
		        System.out.print(f3+" ");
		        f1=f2;
		        f2=f3;
		    }
		}
	}
}
