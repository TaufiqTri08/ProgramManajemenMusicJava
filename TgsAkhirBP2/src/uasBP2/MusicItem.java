/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasBP2;

public class MusicItem {
    private String judul;
    private int tahun;

    public MusicItem(String judul, int tahun) {
        this.judul = judul;
        this.tahun = tahun;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahun() {
        return tahun;
    }

    public void display() {
        System.out.println("Judul: " + judul + ", Tahun: " + tahun);
    }
}
