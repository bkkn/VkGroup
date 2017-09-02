package com.bkkn.me.vkgroup.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bkkn.me.vkgroup.CurrentUser;
import com.bkkn.me.vkgroup.MyApplication;
import com.bkkn.me.vkgroup.R;
import com.bkkn.me.vkgroup.common.BaseAdapter;
import com.bkkn.me.vkgroup.model.WallItem;
import com.bkkn.me.vkgroup.model.view.NewsItemBodyViewModel;
import com.bkkn.me.vkgroup.rest.api.WallApi;
import com.bkkn.me.vkgroup.rest.model.request.WallGetRequestModel;
import com.bkkn.me.vkgroup.rest.model.response.BaseItemResponse;
import com.bkkn.me.vkgroup.rest.model.response.Full;
import com.bkkn.me.vkgroup.rest.model.response.WallGetResponse;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFeedFragment extends BaseFragment {

    @Inject
    WallApi mWallApi;

    RecyclerView mRecyclerView;

    BaseAdapter mAdapter;

    public NewsFeedFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getApplicationComponent().inject(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mWallApi.get(new WallGetRequestModel(-86529522).toMap()).enqueue(new Callback<WallGetResponse>() {
            @Override
            public void onResponse(Call<WallGetResponse> call, Response<WallGetResponse> response) {

                List<NewsItemBodyViewModel> list = new ArrayList<>();

                for (WallItem item : response.body().response.getItems()) {

                    list.add(new NewsItemBodyViewModel(item));

                }
                mAdapter.addItems(list);

                Toast.makeText(getActivity(), "Likes: " + response.body().response.getItems().get(0).getLikes().getCount(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<WallGetResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    @Override
    protected int getMainContentLayout() {
        return R.layout.fragment_feed;
    }

    @Override
    public int onCreateToolbarTitle() {
        return R.string.screen_name_news;
    }

    private void setUpRecyclerView(View rootView) {

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.rv_list);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setUpRecyclerView(view);
        setUpAdapter(mRecyclerView);
    }

    protected void setUpAdapter(RecyclerView rv) {

        mAdapter = new BaseAdapter();

        rv.setAdapter(mAdapter);

    }

}
