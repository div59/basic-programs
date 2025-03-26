package arrays;

import java.util.*;
public class anagrams{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s[]=s1.split("");
        String b[]=s2.split("");
        Arrays.sort(s);
        Arrays.sort(b);
        if(Arrays.equals(s,b)){
            System.out.print("yes");
        }
        else{
            System.out.print("NO");
        }
       
        
    }
}
