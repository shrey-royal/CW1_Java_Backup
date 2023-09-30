public class DeadLockSolved {
    public static void main(String[] args) {
        final String resource1 = "Scarlett Johansson";
        final String resource2 = "Kylie Jenner";

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

        Thread sujal = new Thread() {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("Sujal locked Scarlett Johansson");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    synchronized (resource2) {
                        System.out.println("Sujal locked Kylie Jenner");
                    }
                }
            }
        };

        vedant.start();
        sujal.start();
    }
}
