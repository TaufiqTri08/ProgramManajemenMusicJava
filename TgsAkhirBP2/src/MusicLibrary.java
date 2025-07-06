public class MusicLibrary {
    private MusicItem[] items;
    private int jumlahItem;

    public MusicLibrary(int maxItem) {
        items = new MusicItem[maxItem];
        jumlahItem = 0;
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
