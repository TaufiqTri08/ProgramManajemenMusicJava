/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasBP2;
public class Song extends MusicItem {
    private Artist artist;
    private Band band;

    public Song(String judul, int tahun, Artist artist) {
        super(judul, tahun);
        this.artist = artist;
        this.band = null;
    }

    public Song(String judul, int tahun, Artist artist, Band band) {
        super(judul, tahun);
        this.artist = artist;
        this.band = band;
    }

    public Artist getArtist() {
        return artist;
    }

    public Band getBand() {
        return band;
    }

    @Override
    public void display() {
        super.display();
        artist.display();
        if (band != null) {
            band.display();
        }
    }
}
