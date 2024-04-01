package Demo.multi;

class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Runnable " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Runa {
    public static void main(String[] args) {
        MyRunnable my= new MyRunnable();
        Thread t = new Thread(my);
        //Thread t2 = new Thread(my);
        t.start(); // Start the thread
        //t2.start();
    }
}

