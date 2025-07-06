/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasBP2;
public class Artist {
    private String nama;
    private String genre;

    public Artist(String nama, String genre) {
        this.nama = nama;
        this.genre = genre;
    }

    public String getNama() {
        return nama;
    }

    public String getGenre() {
        return genre;
    }

    public void display() {
        System.out.println("Artist Name: " + nama + ", Genre: " + genre);
    }
}
