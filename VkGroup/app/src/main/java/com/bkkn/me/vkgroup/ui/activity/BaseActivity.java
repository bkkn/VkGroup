package com.bkkn.me.vkgroup.ui.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.bkkn.me.vkgroup.MyApplication;
import com.bkkn.me.vkgroup.R;
import com.bkkn.me.vkgroup.common.manager.MyFragmentManager;
import com.bkkn.me.vkgroup.ui.fragment.BaseFragment;

import javax.inject.Inject;

/**
 * Created by Sergey on 02.09.2017.
 */

public abstract class BaseActivity extends MvpAppCompatActivity {
    @Inject
    MyFragmentManager myFragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getApplicationComponent().inject(this);
        setContentView(R.layout.activity_base);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        FrameLayout parent = (FrameLayout) findViewById(R.id.main_wrapper);

        getLayoutInflater().inflate(getMainContentLayout(), parent);
    }

    @LayoutRes

    protected abstract int getMainContentLayout();

    public void fragmentOnScreen(BaseFragment baseFragment) {
        setToolbarTitle(baseFragment.createToolbarTitle(this));
    }

    private void setToolbarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    public void setContent(BaseFragment fragment) {
        myFragmentManager.setFragment(this, fragment, R.id.main_wrapper);
    }

    public void addContent(BaseFragment fragment) {
        myFragmentManager.addFragment(this, fragment, R.id.main_wrapper);
    }

    public boolean removeCurrentFragment() {
        return myFragmentManager.removeCurrentFragment(this);
    }

    public boolean removeFragment(BaseFragment fragment) {
        return myFragmentManager.removeFragment(this, fragment);
    }


    @Override
    public void onBackPressed() {
        removeCurrentFragment();
    }
}
