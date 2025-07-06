public class Stack {
    private Song[] stackArray;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        stackArray = new Song[capacity];
        this.capacity = capacity;
        top = -1;
    }

    public void push(Song song) {
        if (top < capacity - 1) {
            stackArray[++top] = song;
        } else {
            System.out.println("Stack is full.");
        }
    }

    public Song pop() {
        if (top >= 0) {
            return stackArray[top--];
        } 
        return null;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
