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
    public String getJudul(){
        return judul;
    }
    public void tambahLagu(Song lagu) {
        if (jumlahLagu < this.lagu.length) {
            this.lagu[jumlahLagu++] = lagu;
        } else {
            System.out.println("Daftar lagu sudah penuh.");
        }
    }

    public void tampilInfo() {
        System.out.println("Album: " + judul + ", Tahun: " + tahun);
        for (int i = 0; i < jumlahLagu; i++) {
            lagu[i].tampilInfo();
        }
    }
}
