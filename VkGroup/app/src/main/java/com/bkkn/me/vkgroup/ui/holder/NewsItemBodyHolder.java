package com.bkkn.me.vkgroup.ui.holder;

import android.view.View;
import android.widget.TextView;

import com.bkkn.me.vkgroup.R;
import com.bkkn.me.vkgroup.model.view.NewsItemBodyViewModel;

/**
 * Created by Sergey on 03.09.2017.
 */

public class NewsItemBodyHolder extends BaseViewHolder<NewsItemBodyViewModel> {

    public TextView tvText;


    public NewsItemBodyHolder(View itemView) {
        super(itemView);

        tvText = (TextView) itemView.findViewById(R.id.tv_text);
    }

    @Override
    public void bindViewHolder(NewsItemBodyViewModel item) {
        tvText.setText(item.getText());
    }

    @Override
    public void unbindViewHolder() {
        tvText.setText(null);
    }
}