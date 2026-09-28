class FirstThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++)
            System.out.println("First Thread");
    }
}

class SecondThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++)
            System.out.println("Second Thread");
    }
}

class Program15 {
    public static void main(String[] args) throws Exception {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

        t1.start();
        t1.join();

        t2.start();
        t2.join();
    }
}