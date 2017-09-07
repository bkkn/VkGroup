package com.bkkn.me.vkgroup.model.view.counter;

import com.bkkn.me.vkgroup.model.Likes;

/**
 * Created by Sergey on 06.09.2017.
 */

public class LikeCounterViewModel extends CounterViewModel{

    private Likes mLikes;

    public LikeCounterViewModel(Likes likes) {
        super(likes.getCount());

        this.mLikes = likes;

        if (mLikes.getUserLikes() == 1) {
            setAccentColor();
        }
    }

    public Likes getLikes() {
        return mLikes;
    }
}
