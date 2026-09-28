class MyThread extends Thread {
    public void run() {
        System.out.println(getName() + " = " + getPriority());
    }
}

class Program18 {
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("LowPriority");
        t2.setName("HighPriority");

        t1.setPriority(3);
        t2.setPriority(8);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        System.out.println("Both threads completed.");
    }
}