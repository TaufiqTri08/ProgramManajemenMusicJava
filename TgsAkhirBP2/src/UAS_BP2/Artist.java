package UAS_BP2;

public class Artist {
    private String nama; // Deklarasi variabel untuk nama artis
    private String genre; // Deklarasi variabel untuk genre artis

    public Artist(String nama, String genre) { // Konstruktor untuk kelas Artist
        this.nama = nama;
        this.genre = genre;
    }

    public String getNama() { // Method untuk mendapatkan nama artis
        return nama;
    }

    public String getGenre() { // Method untuk mendapatkan genre artis
        return genre;
    }

    public void tampilInfo() { // Method untuk menampilkan informasi artis
        System.out.println("Nama Artis: " + nama + ", Genre: " + genre);
    }
}
