package com.example.real.thinkers.ecommerce;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.real.thinkers.ecommerce.models.Product;
import com.example.real.thinkers.myapplication.R;

import java.util.ArrayList;

public class ProductDetailActivity extends AppCompatActivity {
    TextView titleTextView,descriptionTextView,priceTextView,quantityTv;
    ImageView imageView;

    String price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        titleTextView = findViewById(R.id.detailedTitle);
        descriptionTextView = findViewById(R.id.productDesctiption);
        priceTextView = findViewById(R.id.idDetailPrice);
        quantityTv= findViewById(R.id.quantityTv);
        imageView = findViewById(R.id.detailedImage);

        Intent intent = getIntent();
        int imageID =getIntent().getIntExtra(ProductCredentials.imageKye,0);

           // imageView.setImageBitmap(bitmap);

        String title = intent.getStringExtra(ProductCredentials.titleKey);
        String description = intent.getStringExtra(ProductCredentials.descriptionKye);
        price = intent.getStringExtra(ProductCredentials.priceKey);
        imageView.setImageResource(imageID);
        descriptionTextView.setText(description);
        titleTextView.setText(title);
        priceTextView.setText(price);
        quantityTv.setText("1");
    }

    public void add(View view) {
        int currentQtt = Integer.parseInt(quantityTv.getText().toString());
        currentQtt = currentQtt+1;
        quantityTv.setText(String.valueOf(currentQtt));
        int currentPrice =Integer.parseInt(price);
        int addedPrice = currentPrice * currentQtt;

        priceTextView.setText(String.valueOf(addedPrice));
    }

    public void sub(View view) {

        int currentQtt = Integer.parseInt(quantityTv.getText().toString());
        if (currentQtt>0) {
            currentQtt = currentQtt - 1;
        }
            quantityTv.setText(String.valueOf(currentQtt));
            int currentPrice = Integer.parseInt(price);
            int subedPrice = currentPrice*currentQtt;

            priceTextView.setText(String.valueOf(subedPrice));


    }
}
