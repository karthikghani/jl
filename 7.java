import java.util.LinkedList;

class SharedBuffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            // Buffer is full, wait for the consumer to consume
            wait();
        }

        // Add item to the buffer
        buffer.add(item);
        System.out.println("Produced: " + item);

        // Notify the consumer that an item is produced
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (buffer.size() == 0) {
            // Buffer is empty, wait for the producer to produce
            wait();
        }

        // Remove and consume item from the buffer
        int item = buffer.removeFirst();
        System.out.println("Consumed: " + item);

        // Notify the producer that an item is consumed
        notify();
    }
}

class Producer extends Thread {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(1000); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.consume();
                Thread.sleep(1500); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(3); // Setting buffer capacity to 3

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}


