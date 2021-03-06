package com.example.real.thinkers.ecommerce;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.real.thinkers.ecommerce.models.Product;
import com.example.real.thinkers.myapplication.R;
import com.example.real.thinkers.ecommerce.adapters.ProductAdapter;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ProductAdapter mAdapter;

        // --------- Properties of every list item--------------

        //----------titles----------------------
        String pakhi3PcsTitle="Pakhi 3pcs";
        String makeUpBoxTitle="Make up box";
        String chakriThakbeNaTitle="Chakri thakbe na T-shirt";
        String cardMobileTitle="Card mobile";
        String smartWatchTitle="Smart watch DZ-08";
        String tendaRouterTitle="Tenda router";
        String waterHeatheTitle="Water heater";
        String kidswearTitle="Kids wear kit";
        String smartPenTitle="Smart pen";
        //------------descriptions---------------------
        String pakhi3PcsDes="\n" +
                "\n" +
                "    অরিজিনাল প্রোডাক্ট\n" +
                "\n" +
                "    আনস্টিচড থ্রি পিস\n" +
                "\n" +
                "    সালোয়ার: কটন\n" +
                "\n" +
                "    কামিজ ফেব্রিক- ফুল জর্জেট এমব্রয়ডারি\n" +
                "\n" +
                "    ওড়না: শিফন\n" +
                "\n" +
                "    হাই কোয়ালিটি ফেব্রিক\n" +
                "\n" +
                "    আকর্ষণীয় ডিজাইন\n" +
                "\n" +
                "    ফ্যাশনেবল ও আরামদায়ক\n"; String price3Pcs= "3450";

        String makeUpBoxDes="Product details of Cosmetics Organizer Box - Transparent\n" +
                "\n" +
                "    Type: Storage Boxes\n" +
                "    Material: Plastic\n" +
                "    Style: Modern\n" +
                "    Color: Transparent\n" +
                "    Environmentally friendly, Stocked\n" +
                "    Ideal for organizing and storing your makeup"; String makeUpBoxPri= "1990";

        String chakriTNDes="\n" +
                "    Fabrics: Cotton\n" +
                "    Fabrication: 180 GSM\n" +
                "    Attractive Design\n" +
                "    Color: As Given Picture\n" +
                "    Computer Marvel Rubber Print\n" +
                "    N.B: Please Check The Size Chart And Select Your Size Before Placing Order.\n" +
                "    Disclaimer: The Actual Color Of The Physical Product May Slightly Vary Due To The Deviation Of Lighting Sources, Photography Or Your Device Display Settings."; String tShirtPrice ="999";

        String cardMobileDes="\n" +
                "\n" +
                "ব্র্যান্ড: AEKU\n" +
                "\n" +
                "মডেল: C6\n" +
                "\n" +
                "র\u200D্যাম: <128 মেগাবাইট\n" +
                "\n" +
                "টকটাইম: ৪ ঘণ্টা (প্রায়)\n" +
                "\n" +
                "স্ট্যান্ডবাই টাইম: ২ দিন (প্রায়)\n" +
                "\n" +
                "ব্যাটারি: 320mAh\n" +
                "\n" +
                "ন্যানো সিম\n" +
                "\n" +
                "সিঙ্গেল সিম\n" +
                "\n" +
                "কালার: র\u200C্যান্ডম\n"; String carMobPrice="2400";

        String smartWatchDes="    Display: 1.54'' IPSCapacitive Touchscreen\n" +
                "    Resolutions: 240 x 240\n" +
                "    Compatible OS: Android\n" +
                "    RAM: 64MB, ROM: 128MB\n" +
                "    Single SIM\n" +
                "    Camera: VGA"; String smartWatchPri= "1400";

        String tendaRouterDes="Wireless Speed\t2.4GHZ:300Mbps II\n" +
                "5GHZ:867Mbps II\n" +
                "Button\t1*WPS/RESET button\n" +
                "Antenna Type\t5 External Antennas\n" +
                "Wireless Standards\t1 10/100M auto-negotiation WAN port II\n" +
                "3 10/100M auto-negotiation LAN ports II\n" +
                "Frequency\tWorks over 2.4GHz and 5GHz II\n" +
                "Basic Functions Wireless Switch II\n" +
                "SSID Broadcast Switch II\n" +
                "Work Frequency: 2.4GHz,5GHz II\n" +
                "Channel Of 2.4GHz:1-13 II\n" +
                "Channel Of 5GHz: 149、153、157、161、165 II"; String routerPrice = "1950";

        String waterHeaterDes="\n" +
                "\n" +
                "    *Brand: Hyundai\n" +
                "\n" +
                "    *Model: REK-105\n" +
                "\n" +
                "    *Power: 1550 W\n" +
                "\n" +
                "    *Voltage: 220 V\n" +
                "\n" +
                "    *Capacity: 1.8 LITER\n" +
                "\n" +
                "    *Size: 190x190x230 mm\n" +
                "\n" +
                "    *3 Leyar safety.\n" +
                "\n" +
                "    *Auto Switch Off Function after Boield.\n" +
                "\n" +
                "    *Mirror polished Stainless Steel.\n"; String wHeaterPri ="1150";

        String kidsWearDes="\n" +
                "\n" +
                "    Product type: Baby pack 7 pcs set.\n" +
                "    Brand: Cussons.\n" +
                "    Biodegradable and dermatologically tested.\n" +
                "    Good quality for kids.                                                                                           \n" +
                "    Made in Indonesia.\n" +
                "    Color: As same as picture.\n" +
                "\n"; String kidswearPri = "5580";

        String smartPenDes="\n" +
                "    Touch pen for smartphone and Tablets\n" +
                "    Stylus Pen for Capacitive Touch screens\n" +
                "    Pen clip for easy carry and storage\n" +
                "    Super soft and flexible 7mm stylus tip design is replaceable\n" +
                "    Highly sensitive and durable pen tip provides precision control\n" +
                "    500,000 tap times for pen tip - SGS certified\n"; String smartPenPri= "2200";


        listView =findViewById(R.id.movies_list);
        final ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product(R.drawable.three_pcs, pakhi3PcsTitle ,pakhi3PcsDes, price3Pcs));
        productList.add(new Product(R.drawable.make_up, makeUpBoxTitle , makeUpBoxDes ,makeUpBoxPri));
        productList.add(new Product(R.drawable.t_shirt, chakriThakbeNaTitle ,chakriTNDes, tShirtPrice));
        productList.add(new Product(R.drawable.card_mobile, cardMobileTitle ,cardMobileDes, carMobPrice));
        productList.add(new Product(R.drawable.sm_watch, smartWatchTitle ,smartWatchDes, smartWatchPri));
        productList.add(new Product(R.drawable.router, tendaRouterTitle ,tendaRouterDes ,routerPrice));
        productList.add(new Product(R.drawable.water_heater, waterHeatheTitle ,waterHeaterDes ,wHeaterPri));
        productList.add(new Product(R.drawable.kids_wear, kidswearTitle ,kidsWearDes ,kidswearPri));
        productList.add(new Product(R.drawable.smart_pen, smartPenTitle ,smartPenDes ,smartPenPri));

        mAdapter = new ProductAdapter(this,productList);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Product product = productList.get(i);

                Intent intent = new Intent(MainActivity.this,ProductDetailActivity.class);

                intent.putExtra(ProductCredentials.imageKye,product.getProductImage());
                intent.putExtra(ProductCredentials.titleKey,product.getTitle());
                intent.putExtra(ProductCredentials.descriptionKye,product.getDescription());
                intent.putExtra(ProductCredentials.priceKey,product.getPrice());

                startActivity(intent);
            }
        });

    }
}
