public class Artist {
    private String nama;
    private String genre;
    private Album[] album;
    private int jumlahAlbum;

    public Artist(String nama, String genre, int maxAlbum) {
        this.nama = nama;
        this.genre = genre;
        this.album = new Album[maxAlbum];
        this.jumlahAlbum = 0;
    }
    
    // Getter untuk nama
    public String getNama() {
        return nama; 
    }

    // Getter untuk genre
    public String getGenre() {
        return genre; 
    }
    
    public void tambahAlbum(Album album) {
        if (jumlahAlbum < this.album.length) {
            this.album[jumlahAlbum++] = album;
        } else {
            System.out.println("Daftar album sudah penuh.");
        }
    }
    
    public void tambahlagukeAlbum(String judulAlbum,Song lagu){
        for (int i = 0; i < jumlahAlbum; i++) {
            if(album[i].getJudul().equals(judulAlbum)){
               album[i].tambahLagu(lagu);
            }    
        }
        System.out.println("Album Kosong!");
    }
    
    public void tampilInfo() {
        System.out.println("Artis: " + nama + ", Genre: " + genre);
        for (int i = 0; i < jumlahAlbum; i++) {
            album[i].tampilInfo();
        }
    }
}