package com.example.tahaali.fypvolley.VolleyData;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.tahaali.fypvolley.Contact;
import com.example.tahaali.fypvolley.Data;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by hp on 8/8/2017.
 */

public class JsonVolley
{
    Context context;
    ArrayList<Data> arrayList=new ArrayList<>();;
    String url;
    ArrayList<Contact> test=new ArrayList<>();

   public JsonVolley(Context context1)
    {
        url="http://wowdukan.com/ethrills/ethrills/rest.php?action=getPlaces&categoryId=5";
        this.context=context1;
        //arrayList=new ArrayList<>();
    }





    public ArrayList<Data> getArrayList() {

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url,


                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        int flag=0;

                        while (flag<response.length()) {
                            try {
                                JSONObject jsonObject=response.getJSONObject(flag);
                                Data D1=new Data();
                                arrayList.add(D1);
                                Log.d("taha", "onResponse: ");
                         //       Contact C1=new Contact(jsonObject.getString("Name"),jsonObject.getString("Email"));
                                //arrayList.add(C1);
                           //     test.add(C1);
                                flag++;
                                //Log.d("taha",jsonObject.getString());
                               // Log.d("taha",arrayList.get(flag-1).getEmail());
                            } catch (JSONException e) {
                               // Toast.makeText(context,"ON RESPONSE EXCEPTION:-"+e.toString(),Toast.LENGTH_LONG).show();
                                Data D1=new Data();
                                arrayList.add(D1);
        //                        Log.d("taha",e.toString());
                            }
                        }

                    }



        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("taha",error.toString());
            }
        });

        Singleton.getInstance(context).addToRequestQueue(jsonArrayRequest);
        Log.d("taha",String.valueOf(arrayList.size()));

        return arrayList;
    }

    }