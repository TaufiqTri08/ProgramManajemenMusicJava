import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicLibrary mLibrary = new MusicLibrary(100);
        SongLibrary sLibrary = new SongLibrary(100);
        Band[] bands = new Band[10]; // Membuat array untuk menyimpan objek Band dengan kapasitas 
        Artist[] artists = new Artist[10];
        int bandCount = 0;// Inisialisasi penghitung jumlah band
        int artistCount = 0;

        while (true) {
            System.out.println("\n");
            System.out.println("-----|SISTEM MANAJEMEN MUSIK|-----");
            System.out.println("MENU:");
            System.out.println("1.  Tambah Item Musik");
            System.out.println("2.  Tampilkan Perpustakaan Musik");
            System.out.println("3.  Tambah Lagu ke Perpustakaan");
            System.out.println("4.  Tampilkan Perpustakaan Lagu");
            System.out.println("5.  Push Lagu ke Stack");
            System.out.println("6.  Pop Lagu dari Stack");
            System.out.println("7.  Enqueue Lagu ke Queue");
            System.out.println("8.  Dequeue Lagu dari Queue");
            System.out.println("9.  Tambah Band");
            System.out.println("10. Tampilkan Band");
            System.out.println("11. Tambah Artis");
            System.out.println("12. Tampilkan Artis");
            System.out.println("13. Tambah Album ke Artis");
            System.out.println("14. Tambah Album ke Band");
            System.out.println("15. Tambah Lagu ke Album Artis");
            System.out.println("16. Tambah Lagu ke Album Band");
            System.out.println("17. Keluar");
            System.out.print("Pilih :");

            int pilihan = sc.nextInt();
            sc.nextLine();  // konsumsi newline

            switch (pilihan) {
                case 1:
                    // Tambah Item Musik
                    System.out.println("Masukkan judul Item Musik:");
                    String judul = sc.nextLine();
                    System.out.println("Masukkan tahun Item Musik:");
                    int tahun = sc.nextInt();
                    sc.nextLine();  // konsumsi newline
                    mLibrary.tambahMusicItem(new MusicItem(judul, tahun));
                    System.out.println("Item musik berhasil ditambahkan!");
                    break;
                case 2:
                    // Tampilkan Perpustakaan Musik
                    System.out.println("Perpustakaan Musik:");
                    mLibrary.tampilPerpustakaan();
                    break;
                case 3:
                    // Tambah Lagu ke Perpustakaan
                    System.out.println("Masukkan judul Lagu:");
                    String judulLagu = sc.nextLine();
                    System.out.println("Masukkan tahun Lagu:");
                    int tahunLagu = sc.nextInt();
                    sc.nextLine();  // konsumsi newline
                    System.out.println("Masukkan nama Artis:");
                    String namaArtis = sc.nextLine();
                    sLibrary.tambahLagu(new Song(judulLagu, tahunLagu, namaArtis));
                    System.out.println("Lagu berhasil ditambahkan ke perpustakaan!");
                    break;
                case 4:
                    // Tampilkan Perpustakaan Lagu
                    System.out.println("Perpustakaan Lagu:");
                    sLibrary.tampilPerpustakaan();
                    break;
                case 5:
                    // Push Lagu ke Stack
                    System.out.println("Masukkan judul Lagu:");
                    String judulLaguTumpukan = sc.nextLine();
                    System.out.println("Masukkan tahun Lagu:");
                    int tahunLaguTumpukan = sc.nextInt();
                    sc.nextLine();  // konsumsi newline
                    System.out.println("Masukkan nama Artis:");
                    String namaArtisTumpukan = sc.nextLine();
                    sLibrary.Push(new Song(judulLaguTumpukan, tahunLaguTumpukan, namaArtisTumpukan));
                    System.out.println("Lagu berhasil ditambahkan ke stack!");
                    break;
                case 6:
                    // Pop Lagu dari Stack
                    Song tarikLagu = sLibrary.Pop();
                    if (tarikLagu != null) {
                        System.out.println("Lagu yang di Pop dari Stack:");
                        tarikLagu.tampilInfo();
                    } else {
                        System.out.println("Stack kosong.");
                    }
                    break;
                case 7:
                    // Enqueue Lagu ke Queue
                    System.out.println("Masukkan judul Lagu:");
                    String judulLaguAntrian = sc.nextLine();
                    System.out.println("Masukkan tahun Lagu:");
                    int tahunLaguAntrian = sc.nextInt();
                    sc.nextLine();  // konsumsi newline
                    System.out.println("Masukkan nama Artis:");
                    String namaArtisAntrian = sc.nextLine();
                    sLibrary.enqueue(new Song(judulLaguAntrian, tahunLaguAntrian, namaArtisAntrian));
                    System.out.println("Lagu berhasil ditambahkan ke queue!");
                    break;
                case 8:
                    // Dequeue Lagu dari Queue
                    Song keluarkanLagu = sLibrary.dequeue();
                    if (keluarkanLagu != null) {
                        System.out.println("Lagu yang di Dequeue dari Queue:");
                        keluarkanLagu.tampilInfo();
                    } else {
                        System.out.println("Queue kosong.");
                    }
                    break;
                case 9:
                    // Tambah Band
                    System.out.println("Masukkan nama Band:");
                    String namaBand = sc.nextLine();
                    System.out.print("Masukkan genre:");                               
                    String genreBand = sc.nextLine();
                    System.out.println("Masukkan jumlah maksimal anggota:");
                    int maxAnggota = sc.nextInt();
                    sc.nextLine();  // konsumsi newline
                    Band band = new Band(namaBand,genreBand, maxAnggota);
                    while (true) {
                        System.out.println("Masukkan nama artis (atau 'selesai' untuk selesai):");
                        String namaAnggota = sc.nextLine();
                        if (namaAnggota.equalsIgnoreCase("selesai")) {
                            break;
                        }
                        System.out.println("Masukkan genre Artis:");
                        String genre = sc.nextLine();
                        band.tambahAnggota(new Artist(namaAnggota, genre, maxAnggota));
                    }
                    if (bandCount < bands.length) {
                        bands[bandCount++] = band;
                    } else {
                        System.out.println("Daftar band sudah penuh.");
                    }
                    break;
                case 10:
                    // Tampilkan Band
                    System.out.println("Daftar Band:");
                    for (int i = 0; i < bandCount; i++) {
                        bands[i].tampilInfo();
                    }
                    break;
                case 11:
                    // Tambah Artis
                    System.out.println("Masukkan nama Artis:");
                    String namaArtisBaru = sc.nextLine();
                    System.out.print("Masukkan genre:");                               
                    String genreArtisBaru = sc.nextLine();
                    System.out.println("Masukkan jumlah maksimal album:");
                    int maxAlbum = sc.nextInt();
                    sc.nextLine();  // konsumsi newline
                    Artist artist = new Artist(namaArtisBaru, genreArtisBaru, maxAlbum);
                    if (artistCount < artists.length) {
                        artists[artistCount++] = artist;
                    } else {
                        System.out.println("Daftar artis sudah penuh.");
                    }
                    break;
                case 12:
                    // Tampilkan Artis
                    System.out.println("Daftar Artis:");
                    for (int i = 0; i < artistCount; i++) {
                        artists[i].tampilInfo();
                    }
                    break;
                case 13:
                    // Tambah Album ke Artis
                    System.out.println("Masukkan nama Artis:");
                    String namaArtisTambahAlbum = sc.nextLine();
                    System.out.println("Masukkan judul Album:");
                    String judulAlbum = sc.nextLine();
                    System.out.println("Masukkan tahun Album:");
                    int tahunAlbum = sc.nextInt();
                    sc.nextLine();  // konsumsi newline
                    System.out.println("Masukkan jumlah maksimal lagu:");
                    int maxLaguAlbum = sc.nextInt();
                    sc.nextLine();  // konsumsi newline
                    Album album = new Album(judulAlbum, tahunAlbum, maxLaguAlbum);
                    for (int i = 0; i < artistCount; i++) {
                        if (artists[i].getNama().equals(namaArtisTambahAlbum)) {
                            artists[i].tambahAlbum(album);
                            System.out.println("Album berhasil ditambahkan ke artis!");
                            break;
                        }
                    }
                    break;
                case 14:
                    // Tambah Album ke Band
                    System.out.println("Masukkan nama Band:");
                    String namaBandTambahAlbum = sc.nextLine();
                    System.out.println("Masukkan judul Album:");
                    String judulAlbumBand = sc.nextLine();
                    System.out.println("Masukkan tahun Album:");
                    int tahunAlbumBand = sc.nextInt();
                    sc.nextLine();  // konsumsi newline
                    System.out.println("Masukkan jumlah maksimal lagu:");
                    int maxLaguAlbumBand = sc.nextInt();
                    sc.nextLine();  // konsumsi newline
                    Album albumBand = new Album(judulAlbumBand, tahunAlbumBand, maxLaguAlbumBand);
                    for (int i = 0; i < bandCount; i++) {
                        if (bands[i].getNama().equals(namaBandTambahAlbum)) {
                            bands[i].tambahAlbum(albumBand);
                            System.out.println("Album berhasil ditambahkan ke band!");
                            break;
                        }
                    }
                    break;
                case 15:
                    // Tambah Lagu ke Album Artis
                    System.out.println("Masukkan nama Artis:");
                    String namaArtisTambahLagu = sc.nextLine();
                    System.out.println("Masukkan judul Album:");
                    String judulAlbumArtis = sc.nextLine();
                    System.out.println("Masukkan judul Lagu:");
                    String judulLaguArtis = sc.nextLine();
                    System.out.println("Masukkan tahun Lagu:");
                    int tahunLaguArtis = sc.nextInt();
                    sc.nextLine();  // konsumsi newline
                    System.out.println("Masukkan nama Artis Lagu:");
                    String namaArtisLagu = sc.nextLine();
                    Song laguArtis = new Song(judulLaguArtis, tahunLaguArtis, namaArtisLagu);
                    for (int i = 0; i < artistCount; i++) {
                        if (artists[i].getNama().equals(namaArtisTambahLagu)) {
                            artists[i].tambahlagukeAlbum(judulAlbumArtis,laguArtis);
                            System.out.println("Lagu berhasil ditambahkan ke album artis!");
                            break;
                        }
                    }
                    break;
                case 16:
                    // Tambah Lagu ke Album Band
                    System.out.println("Masukkan nama Band:");
                    String namaBandTambahLagu = sc.nextLine();
                    System.out.println("Masukkan judul Album:");
                    String judulAlbumBandLagu = sc.nextLine();
                    System.out.println("Masukkan judul Lagu:");
                    String judulLaguBand = sc.nextLine();
                    System.out.println("Masukkan tahun Lagu:");
                    int tahunLaguBand = sc.nextInt();
                    sc.nextLine();  // konsumsi newline
                    System.out.println("Masukkan nama Artis Lagu:");
                    String namaArtisBandLagu = sc.nextLine();
                    Song laguBand = new Song(judulLaguBand, tahunLaguBand, namaArtisBandLagu);
                    for (int i = 0; i < bandCount; i++) {
                        if (bands[i].getNama().equals(namaBandTambahLagu)) {
                            bands[i].tambahlagukeAlbum(judulAlbumBandLagu,laguBand);
                            System.out.println("Lagu berhasil ditambahkan ke album band!");
                            break;
                        }
                    }
                    break;
                case 17:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan Sistem Manajemen Musik.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;    
            }
                
        }
    }
}
