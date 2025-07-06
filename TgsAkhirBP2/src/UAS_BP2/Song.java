package UAS_BP2;
public class Song extends MusicItem {
    private Artist namaArtis;
    private Band band;

    public Song(String judul, int tahun, Artist namaArtis) {
        super(judul, tahun);
        this.namaArtis = namaArtis;
        this.band = null;
    }

    public Song(String judul, int tahun, Artist namaArtis, Band band) {
        super(judul, tahun);
        this.namaArtis = namaArtis;
        this.band = band;
    }

    public Artist getNamaArtis() {
        return namaArtis;
    }

    public Band getBand() {
        return band;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        namaArtis.tampilInfo();
        if (band != null) {
            band.tampilInfo();
        }
    }

    
}