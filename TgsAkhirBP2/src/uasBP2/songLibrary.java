/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasBP2;
public class songLibrary {
    private Song[] songItems;
    private Album[] albums;
    private int jumlahAlbum;
    private int jumlahItem;
    private Cstack stack;
    private cQueue queue;

    public songLibrary() {
        this.songItems = new Song[50];
        this.jumlahItem = 0;
        this.albums = new Album[20];
        this.jumlahAlbum = 0;
        this.stack = new Cstack(50);
        this.queue = new cQueue(50);
    }

    public void addSong(Song song) {
        if (jumlahItem < songItems.length) {
            songItems[jumlahItem++] = song;
        } else {
            System.out.println("Song Library is full.");
        }
    }

    public void display() {
        for (int i = 0; i < jumlahItem; i++) {
            System.out.print((i + 1) + ". ");
            songItems[i].display();
        }
    }

    public void addAlbum(Album album) {
        if (jumlahAlbum < albums.length) {
            albums[jumlahAlbum++] = album;
        } else {
            System.out.println("Album Library is full.");
        }
    }

    public void displayAlbums() {
        for (int i = 0; i < jumlahAlbum; i++) {
            System.out.print((i + 1) + ". ");
            albums[i].display();
        }
    }

    public void displayAlbumDetails(int albumIndex) {
        Album album = getAlbumByIndex(albumIndex);
        if (album != null) {
            album.display();
        }
    }

    public Song getSongByIndex(int index) {
        if (index >= 0 && index < jumlahItem) {
            return songItems[index];
        } else {
            System.out.println("Invalid song index.");
            return null;
        }
    }

    public Album getAlbumByIndex(int index) {
        if (index >= 0 && index < jumlahAlbum) {
            return albums[index];
        } else {
            System.out.println("Invalid album index.");
            return null;
        }
    }

    public void linkSongToBand(int songIndex, Band band) {
        Song song = getSongByIndex(songIndex);
        if (song != null) {
            song = new Song(song.getJudul(), song.getTahun(), song.getArtist(), band);
            songItems[songIndex] = song;
        }
    }

    public void addSongToAlbum(int songIndex, int albumIndex) {
        Song song = getSongByIndex(songIndex);
        Album album = getAlbumByIndex(albumIndex);
        if (song != null && album != null) {
            album.addSong(song);
        }
    }

    public void push(int index) {
        Song song = getSongByIndex(index);
        if (song != null) {
            stack.push(song);
        }
    }

    public Song pop() {
        return stack.pop();
    }

    public void enqueue(int index) {
        Song song = getSongByIndex(index);
        if (song != null) {
            queue.enqueue(song);
        }
    }

    public Song dequeue() {
        return queue.dequeue();
    }
}