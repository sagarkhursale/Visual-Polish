package com.sagar.visualpolish;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class SelectorItemAdapter extends RecyclerView.Adapter<SelectorItemAdapter.ArticleViewHolder> {

    private static final String TAG = SelectorItemAdapter.class.getSimpleName();

    final private ListItemClickListener mOnClickListener;

    //The interface that receives onClick messages.
    public interface ListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }

    public SelectorItemAdapter(ListItemClickListener listener) {
        mOnClickListener = listener;
    }


    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.selector_list_item;

        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        ArticleViewHolder viewHolder = new ArticleViewHolder(view);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ArticleViewHolder holder, int position) {
        Log.d(TAG, "#" + position);
    }


    @Override
    public int getItemCount() {
        return 10;
    }


    class ArticleViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        ImageView icon;
        TextView firstName;
        TextView lastName;


        public ArticleViewHolder(View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.personIcon);
            firstName = itemView.findViewById(R.id.firstName);
            lastName = itemView.findViewById(R.id.lastName);

            itemView.setOnClickListener(this);
        }

        //Called whenever a user clicks on an item in the list.
        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onListItemClick(clickedPosition);
        }
    }

    // END
}
