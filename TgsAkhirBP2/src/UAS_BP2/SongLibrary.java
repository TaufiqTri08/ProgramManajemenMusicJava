package UAS_BP2;
public class SongLibrary {
    private Song[] lagu;
    private Album[] albums;
    private int jumlahLagu;
    private int jumlahAlbum;
    private stack tumpukan;
    private queue antrian;

    public SongLibrary(int maxLagu) {
        this.lagu = new Song[maxLagu];
        this.albums = new Album[20];
        this.jumlahLagu = 0;
        this.jumlahAlbum = 0;
        this.tumpukan = new stack(maxLagu);
        this.antrian = new queue(maxLagu);
    }

    public void tambahLagu(Song song) {
        if (jumlahLagu < lagu.length) {
            lagu[jumlahLagu++] = song;
        } else {
            System.out.println("Perpustakaan lagu sudah penuh.");
        }
    }

    public void tampilPerpustakaan() {
        for (int i = 0; i < jumlahLagu; i++) {
            System.out.println((i + 1) + ". Lagu:");
            lagu[i].tampilInfo();
        }
    }

    public void tambahAlbum(Album album) {
        if (jumlahAlbum < albums.length) {
            albums[jumlahAlbum++] = album;
        } else {
            System.out.println("Perpustakaan album sudah penuh.");
        }
    }

    public void tampilAlbum() {
        for (int i = 0; i < jumlahAlbum; i++) {
            System.out.println((i + 1) + ". ");
            albums[i].tampilInfo();
        }
    }

    public void tampilAlbumLengkap(int albumIndex) {
        Album album = getAlbumByIndex(albumIndex);
        if (album != null) {
            album.tampilInfo();
        }
    }

    public Song getLagu(int index) {
        if (index >= 0 && index < jumlahLagu) {
            return lagu[index];
        } else {
            System.out.println("Indeks lagu tidak valid.");
            return null;
        }
    }

    public Album getAlbumByIndex(int index) {
        if (index >= 0 && index < jumlahAlbum) {
            return albums[index];
        } else {
            System.out.println("Indeks album tidak valid.");
            return null;
        }
    }

    public void hubungkanLaguKeBand(int songIndex, Band band) {
        Song song = getLagu(songIndex);
        if (song != null) {
            song = new Song(song.getJudul(), song.getTahun(), song.getNamaArtis(), band);
            lagu[songIndex] = song;
        }
    }

    public void tambahLaguKeAlbum(int songIndex, int albumIndex) {
        Song song = getLagu(songIndex);
        Album album = getAlbumByIndex(albumIndex);
        if (song != null && album != null) {
            album.tambahLagu(song);
        }
    }

    public void Push(Song song) {
        tumpukan.push(song);
    }

    public Song Pop() {
        return tumpukan.pop();
    }

    public void enqueue(Song song) {
        antrian.enqueue(song);
    }

    public Song dequeue() {
        return antrian.dequeue();
    }
}