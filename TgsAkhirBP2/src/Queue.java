public class Queue {
    private Song[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queueArray = new Song[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public void enqueue(Song song) {
        if (size < capacity) {
            if (rear == capacity - 1) {
                rear = 0;
            } else {
                rear++;
            }
            queueArray[rear] = song;
            size++;
        } 
    }

    public Song dequeue() {
        if (size > 0) {
            Song song = queueArray[front];
            if (front == capacity - 1) {
                front = 0;
            } else {
                front++;
            }
            size--;
            return song;
        }
        return null;
    }
}
