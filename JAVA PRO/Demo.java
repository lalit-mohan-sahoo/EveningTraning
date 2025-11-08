
    class X implements Runnable {
    public void run() {
        try {
            Thread.sleep(2000); 
        } 
        catch (InterruptedException e) {
            System.out.println("I am handling it");
        }

        System.out.println(Thread.currentThread());
    }
}

class Demo {
    public static void main(String[] args) {
        X obj = new X();
        Thread t1 = new Thread(obj, "1st");
        t1.start();
        t1.interrupt();
    }
}

