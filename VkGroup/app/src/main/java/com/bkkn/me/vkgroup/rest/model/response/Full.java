package com.bkkn.me.vkgroup.rest.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Sergey on 02.09.2017.
 */

public class Full<T> {
    @SerializedName("response")
    @Expose
    public T response;
}