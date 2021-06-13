package com.example.recyclerview191172;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview191172.R;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.MainViewHolder> {
    private final LayoutInflater Remove;
    private final ArrayList<String> Recycleritems;
    public adapter(LayoutInflater remove, ArrayList<String> recycleritems) {
        this.Remove = remove;
        this.Recycleritems = recycleritems;
    }
    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(Remove.inflate(R.layout.activity_adapter,parent,false));
    }
    @Override
    public void onBindViewHolder(@NonNull adapter.MainViewHolder holder, int position) {
        holder.Recyclername.setText(Recycleritems.get(position));
        holder.deleteIC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recycleritems.remove(position);
                notifyDataSetChanged();
            }
        });
    }
    @Override
    public int getItemCount() {
        return Recycleritems.size();
    }
    public static class MainViewHolder extends RecyclerView.ViewHolder{
        private final TextView Recyclername;
        private final ImageButton deleteIC;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
//initializing the views of each view item in the recyclerView
            Recyclername = itemView.findViewById(R.id.Recyclername);
            deleteIC = itemView.findViewById(R.id.Delete);
        }
    }
}