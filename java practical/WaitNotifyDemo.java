import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int MAX_CAPACITY = 5;

    // Producer method
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (queue) {
                while (queue.size() == MAX_CAPACITY) {
                    System.out.println("Queue is full. Producer is waiting...");
                    queue.wait(); // Wait until space is available
                }
                System.out.println("Producing value: " + value);
                queue.add(value++);
                queue.notify(); // Notify the consumer that an item has been produced
            }
            Thread.sleep(1000); // Simulate time taken to produce an item
        }
    }

    // Consumer method
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    System.out.println("Queue is empty. Consumer is waiting...");
                    queue.wait(); // Wait until an item is available
                }
                int value = queue.poll();
                System.out.println("Consuming value: " + value);
                queue.notify(); // Notify the producer that an item has been consumed
            }
            Thread.sleep(1500); // Simulate time taken to consume an item
        }
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}