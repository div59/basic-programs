
package Demo.Static;

public class Human {
    
    int salary;
    String name;
    boolean marriead;
    static int num=0;
    Human(int sa,String na,boolean ma){
        salary=sa;
        name=na;
        marriead=ma;
        this.num+=1;
        
    
}
    static void display() {
    	System.out.println("i m static method inside Human class");
    	//System.out.println("cant" + this.salary);//this itself obj so cant be used inside static method
    }
}
