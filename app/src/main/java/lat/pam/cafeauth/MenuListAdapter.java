package lat.pam.cafeauth;

import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MenuListAdapter extends RecyclerView.Adapter<MenuListAdapter.ListViewHolder> {

    private ArrayList<Product> menuData;

    MenuListAdapter(ArrayList<Product> list) {
        this.menuData = list;
    }

    @NonNull
    @Override
    public MenuListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_menu_list_adapter, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuListAdapter.ListViewHolder holder, int position) {
        Product product = menuData.get(position);
        holder.judul.setText(product.judul);
        holder.harga.setText(String.valueOf(product.harga));
        holder.image.setBackground(product.image);
        holder.image.setImageDrawable(product.image);
    }

    @Override
    public int getItemCount() {
        return menuData.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView image;
        public TextView judul, harga;
        public ListViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.list_img);
            judul = itemView.findViewById(R.id.list_nama);
            harga = itemView.findViewById(R.id.list_harga);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int selected = getLayoutPosition();
            Intent intent = new Intent(view.getContext(), ProdukActivity.class);
            intent.putExtra("id", selected);
            view.getContext().startActivity(intent);
        }
    }
}