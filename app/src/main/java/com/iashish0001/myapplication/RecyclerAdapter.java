package com.iashish0001.myapplication;




import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private ArrayList<String> data;

    private Context context;

    public RecyclerAdapter(Context context) {
        this.context = context;
    }

    // RecyclerView recyclerView;
//    public RecyclerAdapter(String[] data) {
//        this.data = data;
//    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View listItem= layoutInflater.inflate(R.layout.list_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.newItem.setText(data.get(position));
//        holder.radioGrpnew.check(R.id.radioButton8);

    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView newItem;
        private RadioButton radioBotton3 , radioButton8;
        private RadioGroup radioGrpnew;
        public ViewHolder(View itemView) {
            super(itemView);
            newItem = itemView.findViewById(R.id.newItem);
            radioBotton3 = itemView.findViewById(R.id.radioButton3);

            radioButton8 = itemView.findViewById(R.id.radioButton8);
            radioGrpnew = itemView.findViewById(R.id.radioGrpnew);


        }
    }
}

