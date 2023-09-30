class Table {
    synchronized void printTable(int x) {
        for(int i=1; i<=10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + x + " * " + i + " = " + x*i);    //2 * 1 = 2
            try {
                Thread.sleep(400); // 0.4 sec
            } catch (Exception e) { // InterruptedException
                System.out.println(e);
            }
        }
    }
}

// class MyThread extends Thread {
//     Table t;
//     MyThread(Table t, String str) {
//         this.t = t;
//         super.setName(str);
//     }

//     @Override
//     public void run() {
//         t.printTable(5);
//     }
// }

class MyThread implements Runnable {
    Table t;
    Thread th;
    MyThread(Table t, String str) {
        this.t = t;
        th = new Thread(this, str);
    }

    @Override
    public void run() {
        t.printTable(5);
    }

    public void start() {
        th.start();
    }
}


public class Sync {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread t1 = new MyThread(obj, "T1");
        MyThread t2 = new MyThread(obj, "T2");

        t1.start();
        t2.start();
    }
}
