package UAS_BP2;
public class MusicLibrary {
    private MusicItem[] items;
    private int jumlahItem;

    public MusicLibrary(int maxItem) {
        this.items = new MusicItem[maxItem];
        this.jumlahItem = 0;
    }

    public void tambahMusicItem(MusicItem item) {
        if (jumlahItem < items.length) {
            items[jumlahItem++] = item;
        } else {
            System.out.println("Perpustakaan musik sudah penuh.");
        }
    }

    public void tampilPerpustakaan() {
        for (int i = 0; i < jumlahItem; i++) {
            items[i].tampilInfo();
        }
    }
}