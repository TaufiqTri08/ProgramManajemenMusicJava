public class SongLibrary {
    private Song[] lagu;
    private int jumlahLagu;
    private Stack tumpukan; // Menggunakan Stack tanpa generik
    private Queue antrian; // Menggunakan Queue tanpa generik

    public SongLibrary(int maxLagu) {
        lagu = new Song[maxLagu];
        jumlahLagu = 0;
        tumpukan = new Stack(maxLagu); // Menginisialisasi Stack dengan kapasitas maxLagu
        antrian = new Queue(maxLagu); // Menginisialisasi Queue dengan kapasitas maxLagu
    }

    public void tambahLagu(Song lagu) {
        if (jumlahLagu < this.lagu.length) {
            this.lagu[jumlahLagu++] = lagu;
        } else {
            System.out.println("Perpustakaan lagu sudah penuh.");
        }
    }

    public void tampilPerpustakaan() {
        for (int i = 0; i < jumlahLagu; i++) {
            lagu[i].tampilInfo();
        }
    }

    public void Push(Song lagu) {
        tumpukan.push(lagu); // Memanggil method push dari kelas Stack
    }

    public Song Pop() {
        return (Song) tumpukan.pop(); // Memanggil method pop dari kelas Stack dan cast ke Song
    }

    public void enqueue(Song lagu) {
        antrian.enqueue(lagu); // Memanggil method enqueue dari kelas Queue
    }

    public Song dequeue() {
        return (Song) antrian.dequeue(); // Memanggil method dequeue dari kelas Queue dan cast ke Song
    }
}
