package com.example.real.thinkers.ecommerce;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.real.thinkers.ecommerce.database.MyDatabaseHelper;
import com.example.real.thinkers.ecommerce.models.Product;
import com.example.real.thinkers.myapplication.R;

import java.util.ArrayList;

import static com.example.real.thinkers.myapplication.R.id.cartListView;

public class CartListActivity extends AppCompatActivity {

    ListView cartLV;
    MyDatabaseHelper myDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_list);

        cartLV = findViewById(cartListView);

        myDatabaseHelper = new MyDatabaseHelper(this);
        //display all

        ArrayList<Product> productArrayList=myDatabaseHelper.getAllCart();
        ArrayList<String>list=new ArrayList<>();
        for(Product product:productArrayList){
            list.add(product.getTitle()+"\n"+product.getQuantity()+"\n"+product.getPrice());
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        cartLV.setAdapter(adapter);
    }

   /* private void loadData() {

        ArrayList<String> cartListData=new ArrayList<>();
        Cursor cursor=myDatabaseHelper.displayAllData();
        if(cursor.getCount()==0){
            Toast.makeText(getApplicationContext(),"No data is available",Toast.LENGTH_SHORT).show();
        }else {
            while (cursor.moveToNext()){
                cartListData.add("Name :"+cursor.getString(1)+" \n "+"Quantity :"+cursor.getString(2)+" \n "+"Price :"+cursor.getString(3));
            }
        }

    }*/
}
