package com.example.recycleview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Contact> contactList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        setData();
    }
    private void setData() {
        Contact dataLiverpool = new Contact("Liverpool", "5 UCL", "MOBILE", R.drawable.liverpool);
        Contact dataMU = new Contact("MU", "3 UCL", "MOBILE", R.drawable.mu);
        Contact dataArsenal = new Contact("Arsenal", "0 UCL", "MOBILE", R.drawable.arsenal);
        Contact dataChelsea = new Contact("Chelsea", "3 UCL", "MOBILE", R.drawable.chelsea);
        Contact dataAston = new Contact("Aston Villa", "UCL", "MOBILE", R.drawable.astonvilla);
        Contact dataTottenham = new Contact("Tottenham", "0 UCL", "MOBILE", R.drawable.tottenham);
        Contact dataEverton = new Contact("Everton", "0 UCL", "MOBILE", R.drawable.everton);
        Contact dataManCity = new Contact("Manchester City", "0 UCL", "MOBILE", R.drawable.mancity);
        Contact dataNewcastle = new Contact("Newcastle", "0 UCL", "MOBILE", R.drawable.newcastle);
        Contact dataBlackburn = new Contact("Blackburn Rovers", "0 UCL", "MOBILE", R.drawable.blackburn);


        contactList.add(dataLiverpool);
        contactList.add(dataMU);
        contactList.add(dataArsenal);
        contactList.add(dataChelsea);
        contactList.add(dataAston);
        contactList.add(dataTottenham);
        contactList.add(dataEverton);
        contactList.add(dataManCity);
        contactList.add(dataNewcastle);
        contactList.add(dataBlackburn);

        mAdapter = new Adapter(contactList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
    }
}
