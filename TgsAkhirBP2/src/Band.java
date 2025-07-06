public class Band {
    private String nama;
    private String genre;
    private Artist[] anggota;
    private Album[] albums; // Array untuk menyimpan album
    private int jumlahalbum;
    private int jumlahAnggota;
    private int jumlahAlbum;

    public Band(String nama,String genre, int maxAnggota) {
        this.nama = nama;
        this.genre = genre;
        this.anggota = new Artist[maxAnggota];
        this.albums = new Album[15]; // Inisialisasi array albums
        this.jumlahAnggota = 0;
        this.jumlahAlbum = 0;
    }
    
    public String getNama(){
        return nama;
        
    }
    public void tambahAnggota(Artist artist) {
        if (jumlahAnggota < anggota.length) {
            anggota[jumlahAnggota++] = artist;
        } else {
            System.out.println("Daftar anggota band sudah penuh.");
        }
    }
    
    public void tambahAlbum(Album album) {
        if (jumlahalbum < albums.length) {
            albums[jumlahalbum++] = album;
        } else {
            System.out.println("Daftar album penuh.");
        }
    }
    
    public void tambahlagukeAlbum(String albumTitle, Song song) {
        for (int i = 0; i < jumlahalbum; i++) {
            if (albums[i].getJudul().equals(albumTitle)) {
                albums[i].tambahLagu(song);
                return;
            }
        }
        System.out.println("Album tidak ditemukan.");
    }
    
    // Metode untuk menampilkan informasi band dan anggota yang dimilikinya
    public void tampilInfo() {
        System.out.println("Band: " + nama + ", Genre: " + genre); // Mencetak nama dan genre band
        for (int i = 0; i < jumlahAnggota; i++) { // Loop melalui semua anggota
            System.out.println("Anggota: " + anggota[i].getNama() + ", Genre: " + anggota[i].getGenre()); // Memanggil getter untuk mendapatkan nama dan genre anggota
        }
        System.out.println("Albums:");
        for (int i = 0; i < jumlahAlbum; i++) {
            albums[i].tampilInfo();
        }
    }
    
}
