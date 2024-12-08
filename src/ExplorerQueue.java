public class ExplorerQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor
    public ExplorerQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue a new explorer
    public void enqueue(String explorer) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot add: " + explorer);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = explorer;
        size++;
        System.out.println("Added explorer: " + explorer);
    }

    // Dequeue an explorer
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No explorer to remove.");
            return null;
        }
        String removedExplorer = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Removed explorer: " + removedExplorer);
        return removedExplorer;
    }

    // Display the next explorer in line
    public String nextExplorer() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        System.out.println("Next explorer in line: " + queue[front]);
        return queue[front];
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Display all explorers in the queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Explorers in the queue:");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        ExplorerQueue explorerQueue = new ExplorerQueue(5);

        // Enqueue explorers
        explorerQueue.enqueue("Alice");
        explorerQueue.enqueue("Bob");
        explorerQueue.enqueue("Charlie");
        explorerQueue.enqueue("Diana");
        explorerQueue.enqueue("Eve");

        // Attempt to enqueue when the queue is full
        explorerQueue.enqueue("Frank");

        // Display the queue
        System.out.println("\nDisplaying queue:");
        explorerQueue.displayQueue();

        // Show the next explorer
        System.out.println("\nNext explorer:");
        explorerQueue.nextExplorer();

        // Dequeue explorers
        System.out.println("\nDequeue explorers:");
        explorerQueue.dequeue();
        explorerQueue.dequeue();

        // Display the queue after dequeue operations
        System.out.println("\nQueue after dequeuing:");
        explorerQueue.displayQueue();

        // Show the next explorer
        System.out.println("\nNext explorer:");
        explorerQueue.nextExplorer();

        // Check the queue state
        System.out.println("\nIs the queue full? " + (explorerQueue.isFull() ? "Yes" : "No"));
        System.out.println("Is the queue empty? " + (explorerQueue.isEmpty() ? "Yes" : "No"));
    }
}
