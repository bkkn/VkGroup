package com.bkkn.me.vkgroup.model.view.counter;

import com.bkkn.me.vkgroup.model.Reposts;

/**
 * Created by Sergey on 06.09.2017.
 */

public class RepostCounterViewModel extends CounterViewModel {

    private Reposts mReposts;

    public RepostCounterViewModel(Reposts reposts) {
        super(reposts.getCount());

        this.mReposts = reposts;
        if (mReposts.getUserReposted() == 1) {
            setAccentColor();
        }
    }

    public Reposts getReposts() {
        return mReposts;
    }
}