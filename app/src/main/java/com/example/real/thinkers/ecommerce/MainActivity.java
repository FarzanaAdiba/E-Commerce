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

    // --------- Properties of every list item--------------

    //----------titles----------------------
    private String pakhi3PcsTitle="Pakhi 3pcs";
    private String makeUpBoxTitle="Make up box";
    private String chakriThakbeNaTitle="Chakri thakbe na T-shirt";
    private String cardMobileTitle="Card mobile";
    private String smartWatchTitle="Smart watch DZ-08";
    private String tendaRouterTitle="Tenda router";
    private String waterHeatheTitle="Water heater";
    private String kidswearTitle="Kids wear kit";
    private String smartPenTitle="Smart pen";
    //------------descriptions---------------------
    private String pakhi3PcsDes="\n" +
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

    private String makeUpBoxDes="Product details of Cosmetics Organizer Box - Transparent\n" +
            "\n" +
            "    Type: Storage Boxes\n" +
            "    Material: Plastic\n" +
            "    Style: Modern\n" +
            "    Color: Transparent\n" +
            "    Environmentally friendly, Stocked\n" +
            "    Ideal for organizing and storing your makeup"; String makeUpBoxPri= "1990";

    private String chakriTNDes="\n" +
            "    Fabrics: Cotton\n" +
            "    Fabrication: 180 GSM\n" +
            "    Attractive Design\n" +
            "    Color: As Given Picture\n" +
            "    Computer Marvel Rubber Print\n" +
            "    N.B: Please Check The Size Chart And Select Your Size Before Placing Order.\n" +
            "    Disclaimer: The Actual Color Of The Physical Product May Slightly Vary Due To The Deviation Of Lighting Sources, Photography Or Your Device Display Settings."; String tShirtPrice ="999";

    private String cardMobileDes="\n" +
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

    private String smartWatchDes="    Display: 1.54'' IPSCapacitive Touchscreen\n" +
            "    Resolutions: 240 x 240\n" +
            "    Compatible OS: Android\n" +
            "    RAM: 64MB, ROM: 128MB\n" +
            "    Single SIM\n" +
            "    Camera: VGA"; String smartWatchPri= "1400";

    private String tendaRouterDes="Wireless Speed\t2.4GHZ:300Mbps II\n" +
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

    private String waterHeaterDes="\n" +
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

    private String kidsWearDes="\n" +
            "\n" +
            "    Product type: Baby pack 7 pcs set.\n" +
            "    Brand: Cussons.\n" +
            "    Biodegradable and dermatologically tested.\n" +
            "    Good quality for kids.                                                                                           \n" +
            "    Made in Indonesia.\n" +
            "    Color: As same as picture.\n" +
            "\n"; String kidswearPri = "5580";

    private String smartPenDes="\n" +
            "    Touch pen for smartphone and Tablets\n" +
            "    Stylus Pen for Capacitive Touch screens\n" +
            "    Pen clip for easy carry and storage\n" +
            "    Super soft and flexible 7mm stylus tip design is replaceable\n" +
            "    Highly sensitive and durable pen tip provides precision control\n" +
            "    500,000 tap times for pen tip - SGS certified\n"; String smartPenPri= "2200";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView =findViewById(R.id.movies_list);
        final ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product(R.drawable.ic_launcher_foreground, pakhi3PcsTitle ,pakhi3PcsDes, price3Pcs));
        productList.add(new Product(R.drawable.ic_launcher_foreground, makeUpBoxTitle , makeUpBoxDes ,makeUpBoxPri));
        productList.add(new Product(R.drawable.ic_launcher_foreground, chakriThakbeNaTitle ,chakriTNDes, tShirtPrice));
        productList.add(new Product(R.drawable.ic_launcher_foreground, cardMobileTitle ,cardMobileDes, carMobPrice));
        productList.add(new Product(R.drawable.ic_launcher_foreground, smartWatchTitle ,smartWatchDes, smartWatchPri));
        productList.add(new Product(R.drawable.ic_launcher_foreground, tendaRouterTitle ,tendaRouterDes ,routerPrice));
        productList.add(new Product(R.drawable.ic_launcher_foreground, waterHeatheTitle ,waterHeaterDes ,wHeaterPri));
        productList.add(new Product(R.drawable.ic_launcher_foreground, kidswearTitle ,kidsWearDes ,kidswearPri));
        productList.add(new Product(R.drawable.ic_launcher_foreground, smartPenTitle ,smartPenDes ,smartPenPri));

        mAdapter = new ProductAdapter(this,productList);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this,ProductDetailActivity.class);

                if (position == 0){
                    intent.putExtra("titleKey",pakhi3PcsTitle);
                    intent.putExtra("descriptionKey",pakhi3PcsDes);
                    intent.putExtra("priceKey",price3Pcs);
                }else if (position==1){
                    intent.putExtra("titleKey",makeUpBoxTitle);
                    intent.putExtra("descriptionKey",makeUpBoxDes);
                    intent.putExtra("priceKey",makeUpBoxPri);
                }else if (position==2){
                    intent.putExtra("titleKey",chakriThakbeNaTitle);
                    intent.putExtra("descriptionKey",chakriTNDes);
                    intent.putExtra("priceKey",tShirtPrice);
                }else if (position==3){
                    intent.putExtra("titleKey",cardMobileTitle);
                    intent.putExtra("descriptionKey",cardMobileDes);
                    intent.putExtra("priceKey",carMobPrice);
                }else if (position==4){
                    intent.putExtra("titleKey",smartWatchTitle);
                    intent.putExtra("descriptionKey",smartWatchDes);
                    intent.putExtra("priceKey",smartWatchPri);
                }else if (position==5){
                    intent.putExtra("titleKey",tendaRouterTitle);
                    intent.putExtra("descriptionKey",tendaRouterDes);
                    intent.putExtra("priceKey",routerPrice);
                }else if (position==6){
                    intent.putExtra("titleKey",waterHeatheTitle);
                    intent.putExtra("descriptionKey",waterHeaterDes);
                    intent.putExtra("priceKey",wHeaterPri);
                }else if (position==7){
                    intent.putExtra("titleKey",kidswearTitle);
                    intent.putExtra("descriptionKey",kidsWearDes);
                    intent.putExtra("priceKey",kidswearPri);
                }else if (position==8){
                    intent.putExtra("titleKey",smartPenTitle);
                    intent.putExtra("descriptionKey",smartPenDes);
                    intent.putExtra("priceKey",smartPenPri);
                }
                startActivity(intent);
            }
        });

    }
}
