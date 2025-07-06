
package UAS_BP2;
public class Band {
    private String nama;
    private String genre;

    public Band(String nama, String genre) {
        this.nama = nama;
        this.genre = genre;
    }

    public String getNama() {
        return nama;
    }

    public String getGenre() {
        return genre;
    }

    public void tampilInfo() {
        System.out.println("Nama Band: " + nama);
        System.out.println("Genre: " + genre);
    }
}