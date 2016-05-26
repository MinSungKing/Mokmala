package com.example.cse11.thirsty;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,Serializable {

    private GoogleMap mMap;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API."0
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    Button searchButton;
    EditText searchView;

    Building engineering1;
    Building engineering2;
    Building engineering3;
    Building engineering4;
    Building engineering5;
    Building industryUniversityInstituteCollaboration;
    Building business;
    Building library;
    Building art;
    Building firstRestaurant;

    Building[] buildings;

    ListView list;
    ListViewAdapter listAdapter;
    boolean start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        startActivity(new Intent(this, SplashActivity.class));

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        searchButton = (Button)findViewById(R.id.search);
        searchView = (EditText)findViewById(R.id.searchView);

        // Add a marker in Sydney and move the camera
        LatLng youngTop = new LatLng(36.3688, 127.3454);

        // a
        Drink aloe = new Drink("알로에", 600,R.drawable.originalaloe);
        Drink ambasa = new Drink("암바사", 700,R.drawable.ambasa);

// b
        Drink blue_hawaii = new Drink("블루하와이", 900,R.drawable.sunkistblue);

// c
        Drink cider = new Drink("칠성사이다", 800,R.drawable.chilsungsider);
        Drink ceylonTea = new Drink("실론티", 700,R.drawable.ceylonetea);
        Drink ceylonTea_sparkling = new Drink("실론티 스파클링", 800,R.drawable.ceyloneteasparkling);
        Drink ceylonTea_sparkling_pet = new Drink("실론티 스파클링 (페트)", 1000);
        Drink cafeTime = new Drink("카페타임", 700);
        Drink confidence = new Drink("컨피던스", 700,R.drawable.confidence);
        Drink coke = new Drink("코카콜라", 800,R.drawable.cocacola);
        Drink cocopam_ddung = new Drink("코코팜 뚱", 600,R.drawable.cocopamfat);
        Drink cocopam = new Drink("코코팜", 600,R.drawable.cocopam);
        Drink cocopam_peach = new Drink("코코팜 복숭아", 600,R.drawable.cocopampink);
        Drink cantata = new Drink("칸타타", 800,R.drawable.cantata);
        Drink creami = new Drink("크리미소다",500,R.drawable.creamysoda);

//d
        Drink demisoda_apple = new Drink("데미소다 사과", 600,R.drawable.demisoda);
        Drink demisoda_peach = new Drink("데미소다 복숭아", 600,R.drawable.demisodapeach);
        Drink demisoda_lemon = new Drink("데미소다 레몬", 600,R.drawable.demisodalemon);
        Drink dejawa = new Drink("데자와", 700,R.drawable.dezawa);
// e

// f
        Drink fanta = new Drink("환타 오렌지", 700,R.drawable.fanta);
// g
        Drink gatorade = new Drink("게토레이", 700,R.drawable.gatoray);
        Drink green_tea = new Drink("두번째 우려낸 녹차만 담았다", 500,R.drawable.greenteacan);
        Drink green_tea_pet = new Drink("두번째 우려낸 녹차만 담았다 (페트)", 1000);
        Drink grapefruitWater = new Drink("자몽워터",1300,R.drawable.lemonwatergrapefruite);

// h
        Drink hotSix = new Drink("핫식스", 900,R.drawable.hotsix);
        Drink heartbeat = new Drink("하트비트 요구르트맛", 1500,R.drawable.heartbeat);
// i
        Drink im_cappuccino = new Drink("나는 카푸치노", 500,R.drawable.imcappucino);
        Drink icis = new Drink("아이시스", 500,R.drawable.icies);

// j
        Drink jorgia_original = new Drink("조지아 오리지날", 500,R.drawable.georgiaorigianl);
        Drink jorgia_max = new Drink("조지아 맥스", 700,R.drawable.gergiamax);
// k

// l
        Drink letsbeeMoka = new Drink("레쓰비 모카라떼", 500,R.drawable.letsbemoca);
        Drink letsbeeMild = new Drink("레쓰비 마일드", 500,R.drawable.letsbeblue);
        Drink lemonWater = new Drink("레몬워터",1300,R.drawable.lemonwater);
        Drink lemonade = new Drink("레몬에이드", 600);
// m
        Drink mackol = new Drink("맥콜", 600);
        Drink maxwellMild = new Drink("맥스웰 마일드", 500,R.drawable.maxwellblue);
        Drink maxwellCappuccino = new Drink("맥스웰 카푸치노", 500,R.drawable.maxwell);
        Drink milkiss = new Drink("밀키스", 700,R.drawable.milkis);
        Drink minutemade_orange = new Drink("미닛메이드 오렌지", 600,R.drawable.minutemadeoragne);
        Drink minutemate_joy = new Drink("미닛메이드 조이", 600,R.drawable.minutemaderich);
        Drink mojito = new Drink("모히또", 900);

// n
        Drink narangd = new Drink("나랑드", 600,R.drawable.narand);
// o
        Drink oranc_pine = new Drink("오란씨 파인애플", 600,R.drawable.orancpine);
        Drink oranc_orange = new Drink("오란씨 오렌지", 600,R.drawable.orancorange);
        Drink o_latte_original = new Drink("오라떼 오리지널", 500,R.drawable.olatteoriginal);
        Drink o_latte_peach = new Drink("오라떼 복숭아", 500,R.drawable.olattepeach);
        Drink o_latte_apple = new Drink("오라떼 사과", 500,R.drawable.olatteapple);

// p
        Drink pokari = new Drink("포카리스웨트", 700,R.drawable.pocarisweat);
        Drink pokari_pet = new Drink("포카리스웨트 (페트)", 1300,R.drawable.pocarisweatpet);
        Drink partyHouseRiceDrink = new Drink("잔치집 식혜", 700,R.drawable.ricewater);
        Drink pepsi = new Drink("펩시콜라", 700,R.drawable.pepsi);
        Drink powerade = new Drink("파워에이드", 600,R.drawable.powerade);
// q

// r
        Drink richs = new Drink("리치스 그레이프", 800,R.drawable.richisgrape);

// s
        Drink strawberryLatte = new Drink("딸기라떼", 600,R.drawable.strawberrylatte);
        Drink swisiHala = new Drink("스위시 한라봉", 600,R.drawable.swishhallabong);
        Drink sprite = new Drink("스프라이트", 600,R.drawable.sprite);
        Drink shine_on_the_beach = new Drink("샤인온더비치", 900);
        Drink sunkist_sparkling_grapefruit = new Drink("썬키스트 스파클링 자몽 (캔)", 800);

// t
        Drink tropSpaklingGrapeFruit_pet = new Drink("트로피카나 스파클링 자몽(페트)",1300,R.drawable.sparklingpetgrapefruite);
        Drink tropSpaklingApple_pet = new Drink("트로피카나 스파클링 사과(페트)",1300,R.drawable.sparklingpet);
        Drink tropSpaklingApple = new Drink("트로피카나 스파클링 애플",900,R.drawable.sparklingcan);
        Drink tropSpaklingGrape = new Drink("트로피카나 스파클링 포도", 900);
        Drink top = new Drink("티오피", 900);

// u

// v
        Drink vitaminwater_pink = new Drink("비타민워터 focus", 1500,R.drawable.vitaminwatermultiv);
        Drink vitaminwater_blue = new Drink("비타민워터 dwnld", 1500,R.drawable.vitaminwaterpowerc);
        Drink vitaminwater_black = new Drink("비타민워터 xxx", 1500,R.drawable.vitaminwaterxxx);
        Drink vitaminwater_yellow = new Drink("비타민워터 energy", 1500,R.drawable.vitaminwaterenergy);

// x

// w

// y

// z
        Drink zeti = new Drink("제티", 600);

        engineering1 = new Building(new Drink[]{lemonWater,tropSpaklingGrapeFruit_pet,tropSpaklingApple,cider,gatorade,pepsi,milkiss,
                strawberryLatte,hotSix,ceylonTea,cafeTime,letsbeeMoka,letsbeeMild,aloe,partyHouseRiceDrink,richs,
                mackol,swisiHala,maxwellMild,top,zeti} ,"공대 1호관",new LatLng(36.36763,127.34466));




        engineering2 = new Building(new Drink[]{pokari,demisoda_apple,demisoda_peach,narangd,oranc_pine,oranc_orange,dejawa,
                                            green_tea,o_latte_original,o_latte_peach,o_latte_apple,maxwellMild,confidence,lemonWater,tropSpaklingApple,
                                            tropSpaklingGrapeFruit_pet,tropSpaklingGrape,ceylonTea,cider,hotSix,milkiss,strawberryLatte,pepsi,
                                            gatorade,letsbeeMild,letsbeeMoka,aloe,ceylonTea_sparkling,vitaminwater_pink,vitaminwater_blue,
                                            vitaminwater_black,vitaminwater_yellow,minutemade_orange,minutemate_joy,coke,sprite,ambasa,fanta,
                                            powerade,jorgia_original,richs,swisiHala,mackol,top,maxwellMild,zeti},"공대 2호관",new LatLng(36.36430,127.34630));
        engineering3 = new Building(new Drink[]{pokari,demisoda_apple,narangd,oranc_orange,oranc_pine,dejawa,maxwellMild,o_latte_apple,o_latte_peach,
                                            o_latte_original},"공대 3호관",new LatLng(36.36521,127.34661));
        engineering4 = new Building(new Drink[]{pokari,demisoda_apple,o_latte_peach,narangd,o_latte_apple,maxwellMild,oranc_orange,
                                            oranc_pine,dejawa,cocopam_ddung,creami,cocopam_peach,lemonade,im_cappuccino,jorgia_max,
                                            cocopam, strawberryLatte,ceylonTea,gatorade,ceylonTea_sparkling,aloe,milkiss,cider,pepsi,cantata,
                                            letsbeeMild},"공대 4호관",new LatLng(36.36508,127.34769));
       engineering5 = new Building(new Drink[]{cocopam,cocopam_peach,creami,demisoda_apple,jorgia_max,im_cappuccino,maxwellMild,
                                                        narangd,o_latte_original,o_latte_peach,oranc_orange,oranc_pine,pokari},"공대 5호관",new LatLng(36.36645,127.34470));
        industryUniversityInstituteCollaboration = new Building(new Drink[]{pokari,demisoda_apple,oranc_orange,narangd,dejawa,maxwellCappuccino,
                                                        oranc_pine,o_latte_original,o_latte_apple,o_latte_peach},"산학연교육연구관", new LatLng(36.36566, 127.34477));
        business = new Building(new Drink[]{lemonWater,tropSpaklingGrapeFruit_pet,tropSpaklingApple,cider,gatorade,pepsi,milkiss,
                                                    strawberryLatte,hotSix,ceylonTea,cafeTime,letsbeeMoka,letsbeeMild,aloe,partyHouseRiceDrink,
                                                    richs,mackol,swisiHala,top,maxwellMild,zeti},"경상대학",new LatLng(36.367398, 127.346089));

        library = new Building(new Drink[]{cider,pepsi,milkiss,hotSix,ceylonTea,gatorade,lemonWater,grapefruitWater,icis,tropSpaklingGrapeFruit_pet,
                                                    tropSpaklingApple_pet,ceylonTea_sparkling,letsbeeMild,cantata,aloe,richs,mackol,swisiHala,
                                                    top,maxwellMild,zeti,cocopam_ddung,shine_on_the_beach,blue_hawaii,cocopam_peach,cocopam,im_cappuccino,
                                                    jorgia_max,mojito,creami,sunkist_sparkling_grapefruit,lemonade},"도서관",new LatLng(36.37019,127.34604));

        art = new Building(new Drink[]{coke,sprite,ambasa,powerade,jorgia_original,minutemade_orange,minutemate_joy,fanta,pokari,
                                                demisoda_peach,demisoda_apple,narangd,maxwellMild,green_tea,dejawa,o_latte_apple,o_latte_peach,o_latte_original},"예술대학", new LatLng(36.37114, 127.34363));
        firstRestaurant = new Building(new Drink[]{richs,swisiHala,mackol,top,maxwellMild,zeti,demisoda_lemon,o_latte_peach,o_latte_original,
                                                            narangd,o_latte_apple,pokari,demisoda_apple,confidence,dejawa,cocopam_ddung,sunkist_sparkling_grapefruit,
                                                            mojito,blue_hawaii,shine_on_the_beach,cocopam,cocopam_peach,lemonade,creami,
                                                            im_cappuccino,jorgia_max,coke,sprite,ambasa,fanta,jorgia_original,minutemade_orange,minutemate_joy,
                                                            powerade},"제1후생관", new LatLng(36.36783,127.34316));

        //Building socialScienceLecture = new Building("사회과학강의동",new LatLng(36.36671,127.34222));

        /*

         */

        buildings = new Building[]{engineering1,engineering2,engineering3,engineering4,engineering5,industryUniversityInstituteCollaboration,
                business,library,art,firstRestaurant};

        mMap.addMarker(new MarkerOptions().position(engineering1.getLatLng()).title(engineering1.getName()));
        mMap.addMarker(new MarkerOptions().position(engineering2.getLatLng()).title(engineering2.getName()));
        mMap.addMarker(new MarkerOptions().position(engineering3.getLatLng()).title(engineering3.getName()));
        mMap.addMarker(new MarkerOptions().position(engineering4.getLatLng()).title(engineering4.getName()));
        mMap.addMarker(new MarkerOptions().position(engineering5.getLatLng()).title(engineering5.getName()));
        mMap.addMarker(new MarkerOptions().position(library.getLatLng()).title(library.getName()));
        mMap.addMarker(new MarkerOptions().position(art.getLatLng()).title(art.getName()));
        //mMap.addMarker(new MarkerOptions().position(socialScienceLecture.getLatLng()).title(socialScienceLecture.getName()));
        mMap.addMarker(new MarkerOptions().position(industryUniversityInstituteCollaboration.getLatLng()).title(industryUniversityInstituteCollaboration.getName()));
        mMap.addMarker(new MarkerOptions().position(firstRestaurant.getLatLng()).title(firstRestaurant.getName()));
        mMap.addMarker(new MarkerOptions().position(business.getLatLng()).title(business.getName()));

        //마커 전부 삭제
        //mMap.clear();

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(youngTop, 16));

        searchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String searchName = searchView.getText().toString();
                searchBuilding(searchName, mMap);

            }
        });

        //우측 상단에 현재 위치로 이동하는 버튼 추가
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {
            // Show rationale and request permission.
        }
    }


    public void searchBuilding(String drinkName,GoogleMap googleMap){
        googleMap.clear();

        ArrayList<Building> nameArray = new ArrayList<>();
        for(int i=0; i < buildings.length; i++){
            for(int j = 0; j < buildings[i].getDrinks().length; j++){
                if(buildings[i].getDrinks()[j].getName().contains(drinkName)){
                    googleMap.addMarker(new MarkerOptions().position(buildings[i].getLatLng()).title(buildings[i].getName()));
                    nameArray.add(buildings[i]);
                    break;
                }
            }
        }

        list = (ListView) findViewById(R.id.list);
        listAdapter = new ListViewAdapter<String>(this,R.layout.buildingnamelist,nameArray);
        //list.setAdapter(listAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String buildingName = (String)listAdapter.getItem(position);
                Log.v("가져온 빌딩 이름은 ???? : ","" + buildingName);
                Intent intent;
                intent = new Intent(getApplicationContext() ,MenuActivity.class);
                ArrayList<Drink> arr = new ArrayList<Drink>();
                if(buildingName.equals("공대 1호관")){
                    Collections.addAll(arr, engineering1.getDrinks());
                }
                else if(buildingName.equals("공대 2호관")){
                    Collections.addAll(arr, engineering2.getDrinks());

                }

                else if(buildingName.equals("공대 3호관")){
                    Collections.addAll(arr, engineering3.getDrinks());

                }
                else if(buildingName.equals("공대 4호관")){
                    Collections.addAll(arr, engineering4.getDrinks());

                }

                else if(buildingName.equals("공대 5호관")){
                    Collections.addAll(arr, engineering5.getDrinks());

                }
                else if(buildingName.equals("경상대학")){
                    Collections.addAll(arr, business.getDrinks());

                }
                else if(buildingName.equals("도서관")){
                    Collections.addAll(arr, library.getDrinks());

                }
                else if(buildingName.equals("산학연교육연구관")){
                    Collections.addAll(arr, industryUniversityInstituteCollaboration.getDrinks());

                }
                else if(buildingName.equals("제1후생관")){
                    Collections.addAll(arr, firstRestaurant.getDrinks());

                }
                else if(buildingName.equals("예술대학")){
                    Collections.addAll(arr, art.getDrinks());

                }
                else{
                    Log.v("그럴리없어","");
                }
                intent.putExtra("drinks", arr);
                startActivity(intent);

            }
        });
        list.setAdapter(listAdapter);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Maps Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.cse11.thirsty/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Maps Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.cse11.thirsty/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
