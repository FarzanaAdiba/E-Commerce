package com.example.real.thinkers.ecommerce.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import com.example.real.thinkers.ecommerce.models.Product;

import java.util.ArrayList;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    Context context;
    private static final String DATABASE_NAME="ecommerce";
    private static final String CART_TABLE_NAME="Cart";
    private static final int VERSION_NUMBER=1;

    static final String PRODUCT_ID="productId";
    static final String PRODUCT_NAME="productName";
    static final String PRODUCT_QUANTITY="productQty";
    static final String PRODUCT_PRICE="productPrice";
    // static final String TRAINEE_IMAGE="traineeImage";

    private static final String CREAE_TABLE_CART="CREATE TABLE "
            +CART_TABLE_NAME+"("+PRODUCT_ID+" INTEGER PRIMARY KEY AUTOINCREMENT," +
            ""+PRODUCT_NAME+" VARCHAR(255),"+PRODUCT_QUANTITY+" TEXT,"+PRODUCT_PRICE+" TEXT)";

    private static final String DROP_TABLE_CART="DROP TABLE IF EXISTS "+CART_TABLE_NAME;


    public MyDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {


        try{

            Toast.makeText(context,"onCreate is called",Toast.LENGTH_SHORT).show();
            sqLiteDatabase.execSQL(CREAE_TABLE_CART);
            //sqLiteDatabase.execSQL(CREATE_TABLE_USER);

        }catch (Exception e){
            Toast.makeText(context,"Exception :"+e,Toast.LENGTH_SHORT).show();

        }


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        try {
            Toast.makeText(context,"onUpgrade is called",Toast.LENGTH_SHORT).show();
            sqLiteDatabase.execSQL(DROP_TABLE_CART);
           // sqLiteDatabase.execSQL(DROP_TABLE_USER);
            onCreate(sqLiteDatabase);
        }catch (Exception e){
            Toast.makeText(context,"Exception :"+e,Toast.LENGTH_SHORT).show();

        }

    }

    public long insertData(String name,String quantity,String price){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        //contentValues.put(TRAINEE_IMAGE,traineeImg);
        contentValues.put(PRODUCT_NAME,name);
        contentValues.put(PRODUCT_QUANTITY,quantity);
        contentValues.put(PRODUCT_PRICE,price);
        long rowId=sqLiteDatabase.insert(CART_TABLE_NAME,null,contentValues);
        return rowId;
    }

    public ArrayList<Product> getAllCart(){
        ArrayList<Product>productArrayList=new ArrayList<>();
        String selectQuery="select * from "+ MyDatabaseHelper.CART_TABLE_NAME;
        SQLiteDatabase sqLiteDatabase=getReadableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery(selectQuery,null);
        if(cursor.moveToFirst()){
            do{
                int id=cursor.getInt(cursor.getColumnIndex(MyDatabaseHelper.PRODUCT_ID));
                String productName=cursor.getString(cursor.getColumnIndex(PRODUCT_NAME));
                String quantity=cursor.getString(cursor.getColumnIndex(PRODUCT_QUANTITY));
                String price=cursor.getString(cursor.getColumnIndex(PRODUCT_PRICE));
                Product product=new Product(id,productName,quantity,price);
                productArrayList.add(product);
            }while(cursor.moveToNext());
        }
        return productArrayList;
    }
}
