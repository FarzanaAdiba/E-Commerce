package com.example.real.thinkers.ecommerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.real.thinkers.myapplication.R;

public class ProductDetailActivity extends AppCompatActivity {
    TextView titleTextView,descriptionTextView,priceTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        titleTextView = findViewById(R.id.detailedTitle);
        descriptionTextView = findViewById(R.id.productDesctiption);
        priceTextView = findViewById(R.id.idDetailPrice);


        String title = getIntent().getStringExtra("titleKey");
        String description = getIntent().getStringExtra("descriptionKey");
        String price = getIntent().getStringExtra("priceKey");

        titleTextView.setText(title);
        descriptionTextView.setText(description);
        priceTextView.setText(price);

    }
}
