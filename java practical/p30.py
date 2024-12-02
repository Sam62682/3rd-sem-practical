// Custom Runnable class
class MyRunnable implements Runnable {
    private String threadName;

    // Constructor to set the thread name
    public MyRunnable(String name) {
        this.threadName = name;
    }

    // Override the run() method
    @Override
    public void run() {
        System.out.println(threadName + " is starting.");
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                // Sleep for a short duration to simulate work
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " has finished executing.");
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        // Create instances of MyRunnable
        MyRunnable runnable1 = new MyRunnable("Thread-1");
        MyRunnable runnable2 = new MyRunnable("Thread-2");
        MyRunnable runnable3 = new MyRunnable("Thread-3");

        // Create Thread objects
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for threads to finish
        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
            thread3.join(); // Wait for thread3 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads have finished executing.");
    }
}