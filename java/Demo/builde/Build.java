package Demo.builde;


public class Build {
	public static void main(String [] args) {
		StringBuilder b=new StringBuilder();
		String s="divyani kumbar";
		
		char a[]=s.toCharArray();
		for (char  i : a) {
			b.append(i);
		}
		System.out.println(b);
		System.out.println(b.reverse());
		
		
		
		
		
//		String s1="i m divya";
//		StringBuilder b =new StringBuilder(s1); //converted string to stringbuilder
//		System.out.println(b.reverse());
//		
		
		StringBuilder b2=new StringBuilder();
		b2.append("i am divyani");
		//System.out.println(b2.reverse());
		
	 //functions
		b2.append('!');
		
		b2.insert(5,"beutifull ");
		System.out.println(b2);
		
		b2.delete(5, 14);
		System.out.println(b2);
		
		b2.deleteCharAt(13);
		System.out.println(b2);
		
		b2.replace(5, 13, "shivani");
		System.out.println(b2);
		
		String g=b2.substring(5);
		System.out.println(g);
		
		int n=b2.length();
		System.out.println(n);
		
		char c=b2.charAt(5);
		System.out.println(c);
		
		int i=b2.indexOf("shivani");
		System.out.println(i);
		
		String f=b2.toString();
		System.out.println(f);
		
		
//		System.out.println(b2.reverse().toString());
		
	}

	
}
