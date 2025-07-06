package UAS_BP2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        SongLibrary songLibrary = new SongLibrary(100);
        MusicLibrary musicLibrary = new MusicLibrary(100);
        Scanner scanner = new Scanner(System.in);
        int pilihanUtama = 0;

        do {
            System.out.println("\n-|SISTEM MANAJEMEN MUSIK|-");
            System.out.println("1. Menu Lagu");
            System.out.println("2. Menu Stack");
            System.out.println("3. Menu Queue");
            System.out.println("4. Menu Band");
            System.out.println("5. Menu Album");
            System.out.println("6. Tambah Music Item");
            System.out.println("7. Tampilkan Music Item");
            System.out.println("8. Keluar");
            System.out.print("Pilih opsi: ");
            pilihanUtama = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihanUtama) {
                case 1:
                    kelolaLagu(songLibrary, scanner);
                    break;
                case 2:
                    kelolaStack(songLibrary, scanner);
                    break;
                case 3:
                    kelolaQueue(songLibrary, scanner);
                    break;
                case 4:
                    kelolaBand(songLibrary, scanner);
                        break;
                    case 5:
                        kelolaAlbum(songLibrary, scanner);
                        break;
                    case 6:
                        tambahMusicItem(musicLibrary, scanner);
                        break;
                    case 7:
                        tampilkanMusicItemLibrary(musicLibrary);
                        break;
                    case 8:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Opsi tidak valid.");
                }
            } while (pilihanUtama != 8);

            scanner.close();
        }

        private static void kelolaLagu(SongLibrary songLibrary, Scanner scanner) {
            int pilihan;
            do {
                System.out.println("\nMENU LAGU");
                System.out.println("1. Tambahkan Lagu ke Library");
                System.out.println("2. Tampilkan Library");
                System.out.println("3. Kembali ke Menu Utama");
                System.out.print("Pilih opsi: ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Konsumsi newline

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan judul lagu: ");
                        String judulLagu = scanner.nextLine();
                        System.out.print("Masukkan tahun: ");
                        int tahunLagu = scanner.nextInt();
                        scanner.nextLine(); // Konsumsi newline
                        System.out.print("Masukkan nama artis: ");
                        String namaArtis = scanner.nextLine();
                        System.out.print("Masukkan genre artis: ");
                        String genreArtis = scanner.nextLine();
                        Artist artis = new Artist(namaArtis, genreArtis);
                        songLibrary.tambahLagu(new Song(judulLagu, tahunLagu, artis));
                        break;
                    case 2:
                        System.out.println("");
                        songLibrary.tampilPerpustakaan();
                    break;
                case 3:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        } while (pilihan != 3);
    }

    private static void kelolaStack(SongLibrary songLibrary, Scanner scanner) {
        int pilihan;
        do {
            System.out.println("\nMENU STACK");
            System.out.println("1. Push Lagu ke Stack");
            System.out.println("2. Pop Lagu dari Stack");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.println("");
                    songLibrary.tampilPerpustakaan();
                    System.out.print("\nMasukkan nomor lagu untuk push ke stack: ");
                    int indeksPush = scanner.nextInt() - 1;
                    songLibrary.Push(songLibrary.getLagu(indeksPush));
                    break;
                case 2:
                    Song laguDiPop = songLibrary.Pop();
                    if (laguDiPop != null) {
                        laguDiPop.tampilInfo();
                    }
                    break;
                case 3:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        } while (pilihan != 3);
    }

    private static void kelolaQueue(SongLibrary songLibrary, Scanner scanner) {
        int pilihan;
        do {
            System.out.println("\nMENU QUEUE");
            System.out.println("1. Enqueue Lagu ke Queue");
            System.out.println("2. Dequeue Lagu dari Queue");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.println("");
                    songLibrary.tampilPerpustakaan();
                    System.out.print("\nMasukkan nomor lagu untuk enqueue ke queue: ");
                    int indeksEnqueue = scanner.nextInt() - 1;
                    songLibrary.enqueue(songLibrary.getLagu(indeksEnqueue));
                    break;
                case 2:
                    Song laguDiDequeue = songLibrary.dequeue();
                    if (laguDiDequeue != null) {
                        laguDiDequeue.tampilInfo();
                    }
                    break;
                case 3:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        } while (pilihan != 3);
    }

    private static void kelolaBand(SongLibrary songLibrary, Scanner scanner) {
        int pilihan;
        do {
            System.out.println("\nMENU BAND");
            System.out.println("1. Hubungkan Lagu ke Band");
            System.out.println("2. Kembali ke Menu Utama");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.println("");
                    songLibrary.tampilPerpustakaan();
                    System.out.print("\nMasukkan nomor lagu untuk dihubungkan ke band: ");
                    int indeksLagu = scanner.nextInt() - 1;
                    scanner.nextLine(); // Konsumsi newline
                    System.out.print("Masukkan nama band: ");
                    String namaBand = scanner.nextLine();
                    System.out.print("Masukkan genre band: ");
                    String genreBand = scanner.nextLine();
                    Band band = new Band(namaBand, genreBand);
                    songLibrary.hubungkanLaguKeBand(indeksLagu, band);
                    break;
                case 2:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        } while (pilihan != 2);
    }

    private static void kelolaAlbum(SongLibrary songLibrary, Scanner scanner) {
        int pilihan;
        do {
            System.out.println("\nMENU ALBUM");
            System.out.println("1. Tambahkan Lagu ke Album");
            System.out.println("2. Tampilkan Album dan Lagu");
            System.out.println("3. Tambahkan Album ke Library Album");
            System.out.println("4. Tampilkan Library Album");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.println("");
                    songLibrary.tampilPerpustakaan();
                    System.out.print("\nMasukkan nomor lagu untuk ditambahkan ke album: ");
                    int indeksLaguAlbum = scanner.nextInt() - 1;
                    songLibrary.tampilAlbum();
                    System.out.print("Masukkan nomor album: ");
                    int indeksAlbum = scanner.nextInt() - 1;
                    songLibrary.tambahLaguKeAlbum(indeksLaguAlbum, indeksAlbum);
                    break;
                case 2:
                    System.out.println("");
                    songLibrary.tampilAlbum();
                    System.out.print("\nMasukkan nomor album untuk melihat detail: ");
                    int indeksAlbumDetail = scanner.nextInt() - 1;
                    songLibrary.tampilAlbumLengkap(indeksAlbumDetail);
                    break;
                case 3:
                    System.out.print("Masukkan judul album: ");
                    String judulAlbum = scanner.nextLine();
                    System.out.print("Masukkan tahun: ");
                    int tahunAlbum = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline
                    songLibrary.tambahAlbum(new Album(judulAlbum, tahunAlbum, 10));
                    break;
                case 4:
                    System.out.println("");
                    songLibrary.tampilAlbum();
                    break;
                case 5:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        } while (pilihan != 5);
    }

    private static void tambahMusicItem(MusicLibrary musicLibrary, Scanner scanner) {
        System.out.print("Masukkan judul music item: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        musicLibrary.tambahMusicItem(new MusicItem(judul, tahun));
    }

    private static void tampilkanMusicItemLibrary(MusicLibrary musicLibrary) {
        System.out.println("");
        musicLibrary.tampilPerpustakaan();
    }
}
