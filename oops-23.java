class Message {
    String msg;

    synchronized void receive() throws Exception {
        System.out.println("Waiting for message...");
        wait();
        System.out.println("Message received: " + msg);
    }

    synchronized void send(String msg) {
        this.msg = msg;
        notify();
    }
}

class Program23 {
    public static void main(String[] args) throws Exception {
        Message m = new Message();

        Thread t1 = new Thread(() -> {
            try {
                m.receive();
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (Exception e) {}

            m.send("Hello Student");
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}