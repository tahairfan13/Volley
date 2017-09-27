package com.example.tahaali.fypvolley.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tahaali.fypvolley.Data;
import com.example.tahaali.fypvolley.R;
//import com.example.tahaali.recyclerviewwithvolley.R;

import java.util.ArrayList;

/**
 * Created by hp on 8/8/2017.
 */

public class recyclerviewAdapter extends RecyclerView.Adapter<recyclerviewAdapter.viewHolder>// RecyclerView adapter contain the instance of View holder class which in our case is static
{

    ArrayList<Data> arrayList=new ArrayList<>();

   public recyclerviewAdapter(ArrayList<Data> contacts)
    {
       // arrayList=new ArrayList<>(); //could be
       this.arrayList=contacts;
    } // CHECK WITH THIS LATER


    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        viewHolder viewHolder=new viewHolder(view); // WIll create an instace of view holder
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
        holder.Name.setText(arrayList.get(position).getName());
        holder.Email.setText(arrayList.get(position).getEmail());
        holder.Address.setText(arrayList.get(position).getAddress());
        holder.Phone.setText(arrayList.get(position).getPhoneNumber());
    }

    @Override
    public int getItemCount() {// Will return the size of the array
        return arrayList.size();
    }


    public static class viewHolder extends RecyclerView.ViewHolder{

        //Components will be added here(TextView,Image View)
        //In our case we have two text views and an image view

        TextView Name,Email,Address,Phone;



        public viewHolder(View itemView) {
            super(itemView);// WE will use the itemView to access views

            Name= (TextView) itemView.findViewById(R.id.Name);
            Email= (TextView) itemView.findViewById(R.id.Email);
            Address=(TextView)itemView.findViewById(R.id.Address);
            Phone=(TextView)itemView.findViewById(R.id.Phone);

        }
    }


}
