/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasBP2;
public class Cstack {
    private Song[] stackArray;
    private int top;

    public Cstack(int kapasitas) {
        stackArray = new Song[kapasitas];
        top = -1; // Correctly initialize top
    }

    public void push(Song song) {
        if (top < stackArray.length - 1) {
            stackArray[++top] = song;
        } else {
            System.out.println("Stack Penuh.");
        }
    }

    public Song pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack Kosong.");
            return null;
        }
    }
}