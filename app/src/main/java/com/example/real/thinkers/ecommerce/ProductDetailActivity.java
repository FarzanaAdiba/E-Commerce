package com.example.real.thinkers.ecommerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.real.thinkers.myapplication.R;

public class ProductDetailActivity extends AppCompatActivity {
    TextView titleTextView,descriptionTextView,priceTextView,quantityTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        titleTextView = findViewById(R.id.detailedTitle);
        descriptionTextView = findViewById(R.id.productDesctiption);
        priceTextView = findViewById(R.id.idDetailPrice);
        quantityTv= findViewById(R.id.quantityTv);


        Intent intent = this.getIntent();

        String title = intent.getStringExtra("titleKey");
        String description = intent.getStringExtra("descriptionKey");
        String price = intent.getStringExtra("priceKey");

        titleTextView.setText(title);
        descriptionTextView.setText(description);
        priceTextView.setText(price+" TK ");

    }

    public void add(View view) {
        int currentQtt= Integer.parseInt(quantityTv.getText().toString());
        int addedValue= currentQtt+1;
        quantityTv.setText(String.valueOf(addedValue));
    }

    public void sub(View view) {
        int currentQtt = Integer.parseInt(quantityTv.getText().toString());
        if (currentQtt>0){
            int subtractedQtt= currentQtt-1;
            quantityTv.setText(String.valueOf(subtractedQtt));
        }
    }
}
