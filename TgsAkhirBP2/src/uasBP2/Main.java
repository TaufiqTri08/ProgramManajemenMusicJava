
package uasBP2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        songLibrary songLibrary = new songLibrary();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Tambahkan lagu ke dalam library");
            System.out.println("2. Tampilkan library");
            System.out.println("3. Push Song to Stack");
            System.out.println("4. Pop Song from Stack");
            System.out.println("5. Enqueue Song to Queue");
            System.out.println("6. Dequeue Song from Queue");
            System.out.println("7. Add Band");
            System.out.println("8. Tambahkan song ke album");
            System.out.println("9. Tampilkan album dan song");
            System.out.println("10. Add Album to Album Library");
            System.out.println("11. Display Album Library");
            System.out.println("12. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String songTitle = sc.nextLine();
                    System.out.print("Enter year: ");
                    int songYear = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter artist name: ");
                    String artistName = sc.nextLine();
                    System.out.print("Enter artist genre: ");
                    String artistGenre = sc.nextLine();
                    Artist artist = new Artist(artistName, artistGenre);
                    songLibrary.addSong(new Song(songTitle, songYear, artist));
                    break;
                case 2:
                    songLibrary.display();
                    break;
                case 3:
                    songLibrary.display();
                    System.out.print("Enter song number to push to stack: ");
                    int pushIndex = sc.nextInt() - 1;
                    songLibrary.push(pushIndex);
                    break;
                case 4:
                    Song poppedSong = songLibrary.pop();
                    if (poppedSong != null) {
                        poppedSong.display();
                    }
                    break;
                case 5:
                    songLibrary.display();
                    System.out.print("Enter song number to enqueue to queue: ");
                    int enqueueIndex = sc.nextInt() - 1;
                    songLibrary.enqueue(enqueueIndex);
                    break;
                case 6:
                    Song dequeuedSong = songLibrary.dequeue();
                    if (dequeuedSong != null) {
                        dequeuedSong.display();
                    }
                    break;
                case 7:
                    songLibrary.display();
                    System.out.print("Enter song number to link to band: ");
                    int songIndex = sc.nextInt() - 1;
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter band name: ");
                    String bandName = sc.nextLine();
                    System.out.print("Enter band genre: ");
                    String bandGenre = sc.nextLine();
                    Band band = new Band(bandName, bandGenre);
                    songLibrary.linkSongToBand(songIndex, band);
                    break;
                case 8:
                    songLibrary.display();
                    System.out.print("Enter song number to add to album: ");
                    int songAlbumIndex = sc.nextInt() - 1;
                    songLibrary.displayAlbums();
                    System.out.print("Enter album number: ");
                    int albumIndex = sc.nextInt() - 1;
                    songLibrary.addSongToAlbum(songAlbumIndex, albumIndex);
                    break;
                case 9:
                    songLibrary.displayAlbums();
                    System.out.print("Enter album number to display details: ");
                    int albumDetailIndex = sc.nextInt() - 1;
                    songLibrary.displayAlbumDetails(albumDetailIndex);
                    break;
                case 10:
                    System.out.print("Enter album title: ");
                    String albumTitle = sc.nextLine();
                    System.out.print("Enter year: ");
                    int albumYear = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    songLibrary.addAlbum(new Album(albumTitle, albumYear));
                    break;
                case 11:
                    songLibrary.displayAlbums();
                    break;
                case 12:
                    System.out.println("Exiting...");
                    System.out.println("Terima Kasih!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 12);
        sc.close();
    }
}