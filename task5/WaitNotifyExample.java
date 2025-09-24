class SharedResource {
    void waitMethod() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " is going to wait...");
            try {
                wait();  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " got notified and resumed!");
        }
    }

    void notifyMethod() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " is going to notify...");
            notify(); // wakes up one waiting thread
        }
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.waitMethod(), "Thread-1");
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000); // let t1 start first
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.notifyMethod();
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}