package com.example.real.thinkers.ecommerce;

import android.content.DialogInterface;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        cartLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder builder=new AlertDialog.Builder(CartListActivity.this);
                builder.setMessage("Want to buy?");
                builder.setCancelable(false);
                builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(CartListActivity.this,"Login here",Toast.LENGTH_LONG).show();
                        //loginActivity will be added here
                    }
                });
                builder.setNegativeButton("Not now", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();

            }
        });


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
