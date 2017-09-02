package com.bkkn.me.vkgroup.rest.api;

import com.bkkn.me.vkgroup.rest.model.response.BaseItemResponse;
import com.bkkn.me.vkgroup.rest.model.response.Full;
import com.bkkn.me.vkgroup.rest.model.response.WallGetResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by Sergey on 03.09.2017.
 */

public interface WallApi {
    @GET(ApiMethods.WALL_GET)
    Call<WallGetResponse> get(@QueryMap Map<String, String> map);
}
