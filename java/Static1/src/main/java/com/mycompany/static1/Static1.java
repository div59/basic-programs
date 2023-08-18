/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.static1;

/**
 *
 * @author admin
 */

//Class Name Is Different with(contains) Main Method:
public class Static1 {
    int a = 2;
    static int c = 6;

    void display() {
        System.out.println("a is " + a + "   c is " + c);
    }

    static int show() {
        return c;
    }

    void non() {
        System.out.println("a is " + a + "   c is " + c);
    }

    public static void main(String[] args) {
        int b = 4;
       Static1 obj = new Static1();
        
        obj.display(); // Calling instance method
        System.out.println(show()); // Calling static method
        System.out.println("static variable called.." + c); // Accessing static variable
        System.out.println(c + " " + obj.a); // Accessing static variable and instance variable
        System.out.println("b is  " + b); // Printing local variable
        
        obj.non(); // Calling instance method
    }
}

