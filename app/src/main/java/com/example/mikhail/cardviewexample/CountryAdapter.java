package com.example.mikhail.cardviewexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mikhail.cardviewexample.model.Country;

import java.util.List;

/**
 * Created by Mikhail on 23.08.2015.
 */
public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    private List<Country> countries;
    private int rowLayout;
    private Context mContext;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView countryName;
        public ImageView countryImage;

        public ViewHolder(View view){
            super(view);
            countryName = (TextView)itemView.findViewById(R.id.countryName);
            countryImage = (ImageView)itemView.findViewById(R.id.countryImage);
        }
    }

    public CountryAdapter(List<Country> countries,int rowLayout,Context context){
        this.countries = countries;
        this.rowLayout = rowLayout;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup,int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){
        Country country = countries.get(i);
        viewHolder.countryName.setText(country.name);
        viewHolder.countryImage.setImageDrawable(mContext.getResources().getDrawable(country.getImageResourceId(mContext)));
    }

    @Override
    public int getItemCount(){
        return countries == null ? 0 :countries.size();
    }


}
