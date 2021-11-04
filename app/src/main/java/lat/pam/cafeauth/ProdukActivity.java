package lat.pam.cafeauth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ProdukActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk);

        int id = getIntent().getIntExtra("id", -1);

        ArrayList<Product> list = ProductData.getData(getApplicationContext());
        Product product = list.get(id);

        if (product != null) {
            TextView judulprd = findViewById(R.id.productname);
            TextView descprd = findViewById(R.id.textdesc);
            TextView hargprd = findViewById(R.id.textharga);
            ImageView imgprd = findViewById(R.id.menu_img);

            imgprd.setImageDrawable(product.image);
            judulprd.setText(product.judul);
            hargprd.setText(String.valueOf(product.harga));
            descprd.setText(product.deskripsi);
        }
    }
}