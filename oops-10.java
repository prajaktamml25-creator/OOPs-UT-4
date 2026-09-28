class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++)
            System.out.println("Hello Student");
    }
}

class Program10 {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new MyRunnable());
        t.start();
        t.join();

        System.out.println("Main thread completed.");
    }
}