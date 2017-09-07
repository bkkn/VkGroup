package com.bkkn.me.vkgroup.ui.holder;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;

import com.bkkn.me.vkgroup.MyApplication;
import com.bkkn.me.vkgroup.R;
import com.bkkn.me.vkgroup.model.view.NewsItemBodyViewModel;

import javax.inject.Inject;

/**
 * Created by Sergey on 03.09.2017.
 */
public class NewsItemBodyHolder extends BaseViewHolder<NewsItemBodyViewModel> {

    private TextView tvText;

    private TextView tvAttachments;

    @Inject
    protected Typeface mFontGoogle;


    public NewsItemBodyHolder(View itemView) {
        super(itemView);
        MyApplication.getApplicationComponent().inject(this);

        tvText = (TextView) itemView.findViewById(R.id.tv_text);
        tvAttachments = (TextView) itemView.findViewById(R.id.tv_attachments);

        if (tvAttachments != null) {
            tvAttachments.setTypeface(mFontGoogle);
        }
    }

    @Override
    public void bindViewHolder(NewsItemBodyViewModel item) {
        tvText.setText(item.getText());
        tvAttachments.setText(item.getmAttachmentString());
    }

    @Override
    public void unbindViewHolder() {
        tvText.setText(null);
        tvAttachments.setText(null);
    }
}