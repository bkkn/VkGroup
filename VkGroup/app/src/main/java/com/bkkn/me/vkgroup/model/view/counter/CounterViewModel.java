package com.bkkn.me.vkgroup.model.view.counter;

import com.bkkn.me.vkgroup.R;

/**
 * Created by Sergey on 06.09.2017.
 */
public class CounterViewModel {

    protected int mCount;
    protected int mIconColor = R.color.colorIconDis;
    protected int mTextColor = R.color.colorIconDis;

    public CounterViewModel(int count) {
        this.mCount = count;
        if (mCount > 0) {
            setDefaultColor();
        } else {
            setDisabledColor();
        }
    }

    private void setDisabledColor() {
        mIconColor = R.color.colorIconDis;
        mTextColor = R.color.colorIconDis;
    }

    private void setDefaultColor() {
        mIconColor = R.color.colorIcon;
        mTextColor = R.color.colorIcon;
    }

    protected void setAccentColor() {
        mIconColor = R.color.colorAccent;
        mTextColor = R.color.colorAccent;
    }

    public int getCount() {
        return mCount;
    }

    public int getIconColor() {
        return mIconColor;
    }

    public int getTextColor() {
        return mTextColor;
    }
}
