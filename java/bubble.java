

package com.mycompany.java;

import java.util.Scanner;


/**
 *
 * @author admin
 */
public class Java {

    public static void main(String[] args) {
        

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int []a=new int[n];int i,j,temp=0;
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
         for(i=0;i<n-1;i++){
             for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
             }
         }
          for(i=0;i<n;i++){
            System.out.print(a[i]);
          }


    }
}
    

