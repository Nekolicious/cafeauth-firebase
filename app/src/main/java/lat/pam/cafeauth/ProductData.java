package lat.pam.cafeauth;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class ProductData {
    public static ArrayList<Product> getData(Context context) {
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(new Product("Cappuchino","Kopi asal Itali yang terbuat dari espresso dan susu ", 20000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Product("Sparkling Tea","Teh organik yang dipadukan dengan soda", 15000, context.getDrawable(R.drawable.sparkling_tea)));
        list.add(new Product("Donut","Adonan goreng dengan bentuk bulat yang khas", 17000, context.getDrawable(R.drawable.donut)));
        list.add(new Product("Mie Goreng","Adonan mie yang digoreng dengan bumbu spesial", 15000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Product("Black Salad","Salad dengan kandungan charcoal", 12000, context.getDrawable(R.drawable.black_salad)));

        return list;
    }
}
