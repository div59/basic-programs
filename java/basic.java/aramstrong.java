
/*Input : 371
Output : It's an Armstrong Number.
Explanation: 371 = 3^3 + 7^3 + 1^3
Therefore it's an Armstrong number.*/
public class Main
{
	public static void main(String[] args) {
		int n=391;
		int k=n;
		int l=String.valueOf(n).length();
		int s=0,r;
		while(n!=0){
		    r=n%10;
		    s+=Math.pow(r,l);
		    n=n/10;
		}
		if (k==s){
		    System.out.println("yes");
		}else{
		    System.out.println("NO");
		}
	}
}
