class SharedResource {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available) {
            try { wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify();
    }

    public synchronized int consume() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
        return data;
    }
}

class Producer extends Thread {
    private final SharedResource resource;

    public Producer(SharedResource resource) { this.resource = resource; }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.produce(i);
            try { Thread.sleep(500); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
    }
}

class Consumer extends Thread {
    private final SharedResource resource;

    public Consumer(SharedResource resource) { this.resource = resource; }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.consume();
            try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
    }
}

public class p31 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        SharedResource resource = new SharedResource();
        new Producer(resource).start();
        new Consumer(resource).start();
    }
}