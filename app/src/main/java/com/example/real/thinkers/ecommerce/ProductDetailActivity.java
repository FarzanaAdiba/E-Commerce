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

        if(getIntent().hasExtra(ProductCredentials.imageKye)) {
            Bitmap bitmap = BitmapFactory.decodeByteArray(
                    getIntent().getByteArrayExtra(ProductCredentials.imageKye), 0, getIntent().getByteArrayExtra("byteArray").length);
            imageView.setImageBitmap(bitmap);
        }
        String title = intent.getStringExtra(ProductCredentials.titleKey);
        String description = intent.getStringExtra(ProductCredentials.descriptionKye);
        String price = intent.getStringExtra(ProductCredentials.priceKey);
        descriptionTextView.setText(description);
        titleTextView.setText(title);
        priceTextView.setText(price);


    }

    public void sub(View view) {
        int currentQtt= Integer.parseInt(quantityTv.getText().toString());
        int addedValue= currentQtt+1;
        quantityTv.setText(String.valueOf(addedValue));
    }

    public void add(View view) {
        int currentQtt = Integer.parseInt(quantityTv.getText().toString());
        if (currentQtt>0){
            int subtractedQtt= currentQtt-1;
            quantityTv.setText(String.valueOf(subtractedQtt));
        }
    }
}
