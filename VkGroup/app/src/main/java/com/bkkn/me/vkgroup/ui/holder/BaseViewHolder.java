package com.bkkn.me.vkgroup.ui.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Sergey on 03.09.2017.
 */

public abstract class BaseViewHolder<Item> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindViewHolder(Item item);

    public abstract void unbindViewHolder();
}