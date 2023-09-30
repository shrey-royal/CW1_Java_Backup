public class DeadLock {
    public static void main(String[] args) {
        final String resource1 = "Scarlett Johansson";
        final String resource2 = "Kylie Jenner";

        // vedant tries to lock resource1 then resource2
        Thread vedant = new Thread() {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("Vedant locked Scarlett Johansson");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    synchronized (resource2) {
                        System.out.println("Vedant locked Kylie Jenner");
                    }
                }
            }
        };


        // sujal tries to lock resource2 then resource1
        Thread sujal = new Thread() {
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("Sujal locked Kylie Jenner");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    synchronized (resource1) {
                        System.out.println("Sujal locked Scarlett Johansson");
                    }
                }
            }
        };

        vedant.start();
        sujal.start();
    }
}
