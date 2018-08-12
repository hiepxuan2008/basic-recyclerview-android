package com.example.hiepmt.demo1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<MyObject> mItems = new ArrayList<>();

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bindData(getItem(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public void updateData(ArrayList<MyObject> items) {
        mItems = new ArrayList<>(items);
        notifyDataSetChanged();
    }

    private MyObject getItem(int position) {
        if (position >= 0 && position < mItems.size())
            return mItems.get(position);

        return null;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView subTitle;

        MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            subTitle = itemView.findViewById(R.id.sub_title);
        }

        void bindData(MyObject myObject) {
            if (myObject == null)
                return;

            title.setText(myObject.title);
            subTitle.setText(myObject.subTitle);
        }
    }
}
