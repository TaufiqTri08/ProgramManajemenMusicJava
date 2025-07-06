package UAS_BP2;
public class Album {
    private String judul;
    private int tahun;
    private Song[] lagu;
    private int jumlahLagu;

    public Album(String judul, int tahun, int maxLagu) {
        this.judul = judul;
        this.tahun = tahun;
        this.lagu = new Song[maxLagu];
        this.jumlahLagu = 0;
    }

    public void tambahLagu(Song song) {
        if (jumlahLagu < lagu.length) {
            lagu[jumlahLagu++] = song;
        } else {
            System.out.println("Album sudah penuh.");
        }
    }

    public String getJudul() {
        return judul;
    }

    public int getTahun() {
        return tahun;
    }

    public void tampilInfo() {
        System.out.println("Judul Album: " + judul);
        System.out.println("Tahun: " + tahun);
        System.out.println("Lagu:");
        for (int i = 0; i < jumlahLagu; i++) {
            System.out.print((i + 1) + ". ");
            lagu[i].tampilInfo();
        }
    }
}