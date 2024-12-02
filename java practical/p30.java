class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println(threadName + " is starting.");
        try {
        
            for (int i = 0; i < 5; i++) {
                System.out.println(threadName + " is working... " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
        System.out.println(threadName + " is finished.");
    }
}

public class p30 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            System.out.println("Thread 1 has finished. Now proceeding to Thread 2.");
        
            thread2.join();
            System.out.println("Thread 2 has finished.");
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All threads have completed.");
    }
}