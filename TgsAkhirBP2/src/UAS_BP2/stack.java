package UAS_BP2;
public class stack {
    private Song[] stackArray;
    private int top;
    private int capacity;

    public stack(int capacity) {
        this.stackArray = new Song[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(Song song) {
        if (top < capacity - 1) {
            stackArray[++top] = song;
            System.out.println("Lagu berhasil ditambahkan ke stack.");
        } else {
            System.out.println("Stack penuh.");
        }
    }

    public Song pop() {
        if (top >= 0) {
            Song song = stackArray[top--];
            System.out.println("Lagu berhasil dikeluarkan dari stack:");
            song.tampilInfo();
            return song;
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}