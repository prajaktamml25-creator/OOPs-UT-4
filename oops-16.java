class LifeThread extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
}

class Program16 {
    public static void main(String[] args) throws Exception {
        LifeThread t = new LifeThread();

        System.out.println("Thread is starting.");
        t.start();
        t.join();

        System.out.println("Thread has completed.");
    }
}