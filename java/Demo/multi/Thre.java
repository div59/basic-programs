package Demo.multi;
class MyThread extends Thread {
    public void run() {
        // Code to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Thread " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thre {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        my.start(); // Start the thread
    }
}
