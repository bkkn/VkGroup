package com.bkkn.me.vkgroup.model.view.counter;

import com.bkkn.me.vkgroup.model.Comments;

/**
 * Created by Sergey on 06.09.2017.
 */

public class CommentCounterViewModel extends CounterViewModel{

    private Comments mComments;

    public CommentCounterViewModel(Comments comments) {
        super(comments.getCount());

        this.mComments = comments;
    }

    public Comments getComments() {
        return mComments;
    }
}
