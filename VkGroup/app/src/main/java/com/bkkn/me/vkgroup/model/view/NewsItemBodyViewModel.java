package com.bkkn.me.vkgroup.model.view;

import android.view.View;

import com.bkkn.me.vkgroup.model.WallItem;
import com.bkkn.me.vkgroup.ui.holder.NewsItemBodyHolder;

/**
 * Created by Sergey on 03.09.2017.
 */

public class NewsItemBodyViewModel extends BaseViewModel {
    private int mId;

    private String mText;

    public NewsItemBodyViewModel(WallItem wallItem) {
        this.mId = wallItem.getId();
        this.mText = wallItem.getText();
    }


    @Override
    public LayoutTypes getType() {
        return LayoutTypes.NewsFeedItemBody;
    }

    @Override
    public NewsItemBodyHolder onCreateViewHolder(View view) {
        return new NewsItemBodyHolder(view);
    }


    public String getText() {
        return mText;
    }

    public int getId() {
        return mId;
    }
}