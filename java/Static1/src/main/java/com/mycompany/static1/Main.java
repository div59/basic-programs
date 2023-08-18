/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.static1;

/**
 *
 * @author admin
 */
// if class contain  main method then u can access static Method directly 
// if class doesn't contain main then u can invoke static by using classname.method like tgbhis..





public class Main
{
    int a=2;
    static int  c=6;
    void display(){
        System.out.println("a is " + a + "   c is " + c);
     
    }
    
    static int show(){
        return c;
    }
    void non(){
        System.out.println("a is " + a + "   c is " + c);
       
    }
	public static void main(String[] args) {
	    int b=4;
	   // only variable declaration and  initialization possible in side main method
	   //In other words, you can declare variables and perform various
	   //operations using those variables inside the main method, but if you need 
	   //to define a new method, 
	   //it should be done outside the main method within the class body.
	    Main obj=new Main();
	    obj.display();
	   System.out.println(show());
	   System.out.println(c + " "+obj.a);
	   System.out.println("b is  "+ b);
	  
	   // void non(){
    //     System.out.println("a is " + a + "   c is " + obj.c); wrong
       
    // }
     obj.non();
	    
		
	}
}
