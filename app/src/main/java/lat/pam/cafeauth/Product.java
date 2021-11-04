package lat.pam.cafeauth;

import android.graphics.drawable.Drawable;

public class Product {
    String judul;
    String deskripsi;
    int harga;
    Drawable image;

    Product(String judul, String deskripsi, int harga, Drawable image) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.image = image;
    }
}
