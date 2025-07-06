package UAS_BP2;
public class queue {
    private Song[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public queue(int capacity) {
        this.capacity = capacity;
        this.queueArray = new Song[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    
    public void enqueue(Song song) {
        if (size < capacity) {
            rear = (rear + 1) % capacity;
            queueArray[rear] = song;
            size++;
            System.out.println("Lagu berhasil ditambahkan ke queue.");
        } else {
            System.out.println("Queue penuh.");
        }
    }

    public Song dequeue() {
        if (size > 0) {
            Song song = queueArray[front];
            front = (front + 1) % capacity;
            size--;
            System.out.println("Lagu berhasil dikeluarkan dari queue:");
            song.tampilInfo();
            return song;
        } else {
            System.out.println("Queue kosong.");
            return null;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}