package com.bkkn.me.vkgroup.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.bkkn.me.vkgroup.CurrentUser;
import com.bkkn.me.vkgroup.mvp.view.MainView;

/**
 * Created by Sergey on 02.09.2017.
 */
@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    public void checkAuth() {
        if (!CurrentUser.isAuthorized()) {
            getViewState().startSignIn();
        } else {
            getViewState().signedIn();
        }
    }

}
