package com.example.real.thinkers.ecommerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.real.thinkers.ecommerce.models.Product;
import com.example.real.thinkers.myapplication.R;
import com.example.real.thinkers.ecommerce.adapters.ProductAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    private ProductAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =findViewById(R.id.movies_list);
        final ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product(R.drawable.ic_launcher_foreground, "Pakhi 3pcs" ,"description", "2000"));
        productList.add(new Product(R.drawable.ic_launcher_foreground, "Make up box" , "description","1600"));
        productList.add(new Product(R.drawable.ic_launcher_foreground, "Chakri thakbe na T-shirt" ,"description", "600"));
        productList.add(new Product(R.drawable.ic_launcher_foreground, "Card mobile" ,"description", "2200"));
        productList.add(new Product(R.drawable.ic_launcher_foreground, "Smart watch DZ-08" ,"description", "1500"));
        productList.add(new Product(R.drawable.ic_launcher_foreground, "Tenda router" , "description","1200"));
        productList.add(new Product(R.drawable.ic_launcher_foreground, "Water heater" , "description","900"));
        productList.add(new Product(R.drawable.ic_launcher_foreground, "Kids waer kit box" , "description","5000"));
        productList.add(new Product(R.drawable.ic_launcher_foreground, "Smart pen" ,"description", "8700"));

        mAdapter = new ProductAdapter(this,productList);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Product product = new Product();

                Intent intent = new Intent(MainActivity.this,ProductDetailActivity.class);

                intent.putExtra("titleKey",product.getTitle(parent.getPositionForView(view)));
                intent.putExtra("descriptionKey",product.getDescription(parent.getPositionForView(view)));
                intent.putExtra("priceKey",product.getDescription(parent.getPositionForView(view)));

                startActivity(intent);
            }
        });

    }
}
