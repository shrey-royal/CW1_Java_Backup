class CustomThread extends Thread {

    public CustomThread(String str) {
        super.setName(str);
    }

    public void printTable(int x) {
        for(int i=1; i<=10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + x + " * " + i + " = " + x*i);    //2 * 1 = 2
            try {
                Thread.sleep(500); // 0.5 sec
            } catch (Exception e) { // InterruptedException
                System.out.println(e);
            }
        }
    } 

    @Override
    public void run() {
        // System.out.println("Thread is running");
        printTable(5);
    }
}

public class MThreading {
    public static void main(String[] args) {
        // Thread t1 = new Thread("Table of 2");
        // Thread t2 = new Thread("Table of 3");

        // t1.start();
        // t2.start();

        CustomThread t1 = new CustomThread("T1");
        CustomThread t2 = new CustomThread("T2");
        CustomThread t3 = new CustomThread("T3");
        
        //priority (1(min) to 10(max))
        t1.setPriority(10);    //Thread.MAX_PRIORITY
        t2.setPriority(1);    //Thread.MIN_PRIORITY
        t3.setPriority(2);
        
        
        t1.start();
        t2.start();
        t3.start();
    }
}
