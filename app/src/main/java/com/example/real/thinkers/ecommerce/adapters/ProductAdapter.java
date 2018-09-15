package com.example.real.thinkers.ecommerce.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.real.thinkers.ecommerce.models.Product;
import com.example.real.thinkers.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {

    private Context mContext;
    private List<Product> moviesList = new ArrayList<>();

    public ProductAdapter(@NonNull Context context, @SuppressLint("SupportAnnotationUsage") @LayoutRes ArrayList<Product> list) {
        super(context, 0 , list);
        mContext = context;
        moviesList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

        Product currentProduct = moviesList.get(position);

        ImageView image = listItem.findViewById(R.id.idProductImage);
        image.setImageResource(currentProduct.getProductImage());

        TextView title =  listItem.findViewById(R.id.idTitleTv);
        title.setText(currentProduct.getTitle(position));


        TextView price =  listItem.findViewById(R.id.icPriceTv);
        price.setText(currentProduct.getPrice(position)+" TK");

        return listItem;
    }
}
