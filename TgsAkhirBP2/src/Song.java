public class Song extends MusicItem {
    private String namaArtis;

    public Song(String judul, int tahun, String namaArtis) {
        super(judul, tahun);
        this.namaArtis = namaArtis;
    }

    public String getNamaArtis() {
        return namaArtis;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Artis: " + namaArtis);
    }
}
