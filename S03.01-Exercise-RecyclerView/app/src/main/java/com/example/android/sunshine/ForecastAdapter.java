package com.example.android.sunshine;

import android.content.Context; //?
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater; //?
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Callipso on 8/30/2017.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ViewHolder> {
    private String[] m_weatherData;

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView m_weatherTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            m_weatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        parent.inflate(parent.getContext(), R.layout.forecast_list_item, parent);
        return new ViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.m_weatherTextView.setText(m_weatherData[position]);
    }

    @Override
    public int getItemCount() {
        return m_weatherData == null ? 0 : m_weatherData.length;
    }

    public void setWeatherData(String[] data){
        m_weatherData = data;
        notifyDataSetChanged();

    }

}
