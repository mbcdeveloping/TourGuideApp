package com.example.android.tourguideapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BogdanMihalca(@MBC) on 7/9/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    ArrayList<ListItem> mListItem;

    public RecyclerViewAdapter(ArrayList<ListItem> listItem) {

        mListItem = listItem;
    }

    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters

        return new MyViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return mListItem.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ListItem item = mListItem.get(position);
        holder.mImageView.setImageResource(item.getmImageresID());
        holder.mTitleTextView.setText(item.getmTitle());
        holder.mDescriptionTextView.setText(item.getmDescription());
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public CardView mCardView;
        public TextView mTitleTextView;
        public TextView mDescriptionTextView;
        public ImageView mImageView;

        public MyViewHolder(View v) {
            super(v);

            mCardView = (CardView) v.findViewById(R.id.card_view);
            mTitleTextView = (TextView) v.findViewById(R.id.title_text_view);
            mDescriptionTextView = (TextView) v.findViewById(R.id.description_text_view);
            mImageView = (ImageView) v.findViewById(R.id.image_view);
        }
    }
}
