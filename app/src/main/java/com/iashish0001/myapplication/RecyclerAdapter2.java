package com.iashish0001.myapplication;





import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter2 extends RecyclerView.Adapter<RecyclerAdapter2.ViewHolder>{

    private ArrayList<String> data2;

    private Context context;

    public RecyclerAdapter2(Context context) {
        this.context = context;
    }

    // RecyclerView recyclerView;
//    public RecyclerAdapter(String[] data) {
//        this.data = data;
//    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View listItem= layoutInflater.inflate(R.layout.list_view2, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.tagText.setText(data2 .get(position));
        holder.closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data2.remove(data2.get(position));
                notifyDataSetChanged();
            }
        });


    }

    public void setData(ArrayList<String> data2) {
        this.data2 = data2;
        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return data2.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageButton closeButton;
        private TextView tagText;
        public ViewHolder(View itemView) {
            super(itemView);

            closeButton = (ImageButton) itemView.findViewById(R.id.closeButton);
            tagText = itemView.findViewById(R.id.tagText);


        }
    }
}


