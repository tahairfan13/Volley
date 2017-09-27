package com.example.tahaali.fypvolley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.tahaali.fypvolley.Recycler.recyclerviewAdapter;
import com.example.tahaali.fypvolley.VolleyData.JsonVolley;
import com.example.tahaali.fypvolley.VolleyData.Singleton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Data> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<Data> arrayList;

        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        JsonVolley jsonVolley=new JsonVolley(Main2Activity.this);
        arrayList=jsonVolley.getArrayList();


        adapter=new recyclerviewAdapter(arrayList);
        recyclerView.setAdapter(adapter);

}
}
