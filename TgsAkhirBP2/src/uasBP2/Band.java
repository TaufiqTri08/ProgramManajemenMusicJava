/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasBP2;

public class Band {
    private String nama;
    private String genre;

    public Band(String nama, String genre) {
        this.nama = nama;
        this.genre = genre;
    }

    public String getNamaBand() {
        return nama;
    }

    public String getGenre() {
        return genre;
    }

    public void display() {
        System.out.println("Nama Band: " + nama);
        System.out.println("Genre: " + genre);
    }
}
