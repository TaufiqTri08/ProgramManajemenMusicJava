package UAS_BP2;
public class MusicItem {
    private String judul;
    private int tahun;

    public MusicItem(String judul, int tahun) {
        this.judul = judul;
        this.tahun = tahun;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahun() {
        return tahun;
    }

    public void tampilInfo() {
        System.out.println("Judul: " + judul + ", Tahun: " + tahun);
    }
}