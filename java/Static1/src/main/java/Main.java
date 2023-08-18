//

class differ{
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
}

public class Main{
    

    public static void main(String[] args) {
        int b = 4;
        differ obj = new differ();
        
        obj.display(); // Calling instance method
        System.out.println(differ.show()); // Calling static method
        System.out.println("static variable called.." + differ.c); // Accessing static variable
        System.out.println(differ.c + " " + obj.a); // Accessing static variable and instance variable
        System.out.println("b is  " + b); // Printing local variable
        
        obj.non(); // Calling instance method
    }
}

